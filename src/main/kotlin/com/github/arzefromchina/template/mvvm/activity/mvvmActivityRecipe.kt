package com.github.arzefromchina.template.mvvm.activity

import com.android.tools.idea.wizard.template.ModuleTemplateData
import com.android.tools.idea.wizard.template.RecipeExecutor
import com.android.tools.idea.wizard.template.impl.activities.common.addAllKotlinDependencies
import com.github.arzefromchina.template.listeners.MyProjectManagerListener
import com.github.arzefromchina.template.mvvm.activity.res.layout.mvvmActivityXml
import com.github.arzefromchina.template.mvvm.activity.src.pkg.mvvmActivityKt
import com.github.arzefromchina.template.mvvm.activity.src.pkg.mvvmViewModel
import com.github.arzefromchina.template.mvvm.save
import com.intellij.openapi.roots.ProjectRootManager
import com.intellij.psi.PsiManager

/**
 * Author: Arze
 * Date: 2022/6/2 9:57
 * Description:
 * History:
 * <author> <time> <version> <desc>
 * Arze 2022/6/2 1.0
 */


fun RecipeExecutor.mvvmActivityRecipe(
    moduleData: ModuleTemplateData,
    activityClass: String,
    componentName: String,
    layoutName: String,
    packageName: String
) {
    val (projectData, srcOut, resOut) = moduleData
    val project = MyProjectManagerListener.projectInstance ?: return
    val ktOrJavaExt = "kt" //projectData.language.extension "kt"

    addAllKotlinDependencies(moduleData)

    val virtualFiles = ProjectRootManager.getInstance(project).contentSourceRoots
    val virtSrc = virtualFiles.first { it.path.contains("src") }
    val virtRes = virtualFiles.first { it.path.contains("res") }
    val directorySrc = PsiManager.getInstance(project).findDirectory(virtSrc) ?: return
    val directoryRes = PsiManager.getInstance(project).findDirectory(virtRes) ?: return

/*
    generateManifest(
        moduleData = moduleData,
        activityClass = "${activityClass}Activity",
        activityTitle = activityClass,
        packageName = packageName,
        isLauncher = false,
        hasNoActionBar = false,
        generateActivityTitle = true
    )
*/


    // 保存Activity
    mvvmActivityKt(
        projectData.applicationPackage ?: "",
        activityClass,
        componentName,
        layoutName,
        packageName
    ).save(directorySrc, packageName, "${activityClass}Activity.${ktOrJavaExt}")


    // 保存xml
    mvvmActivityXml(packageName, activityClass)
        .save(directoryRes, "layout", "${componentName}${layoutName}.xml")

    // 保存viewmodel
    mvvmViewModel(packageName, activityClass)
        .save(directorySrc, packageName, "${activityClass}ViewModel.${ktOrJavaExt}")

}
