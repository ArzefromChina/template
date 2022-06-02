package other.mvvm.activity

import com.android.tools.idea.wizard.template.ModuleTemplateData
import com.android.tools.idea.wizard.template.RecipeExecutor
import other.mvvm.activity.res.layout.mvvmActivityXml
import other.mvvm.activity.src.app_package.mvvmViewModel

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
    val ktOrJavaExt = projectData.language.extension
// generateManifest(
//   moduleData = moduleData,
//   activityClass = "${activityClass}Activity",
//   activityTitle = activityClass,
//   packageName = packageName,
//   isLauncher = false,
//   hasNoActionBar = false,
//   generateActivityTitle = true,
//   requireTheme = false,
//   useMaterial2 = false
// )

    val mvvmActivity = other.mvvm.activity.src.app_package.mvvmActivityKt(
        projectData.applicationPackage,
        activityClass,
        componentName,
        layoutName,
        packageName
    )
    // 保存Activity
    save(mvvmActivity, srcOut.resolve("${activityClass}Activity.${ktOrJavaExt}"))
    // 保存xml
    save(mvvmActivityXml(packageName, activityClass), resOut.resolve("layout/${componentName}${layoutName}.xml"))
    // 保存viewmodel
    save(mvvmViewModel(packageName, activityClass), srcOut.resolve("${activityClass}ViewModel.${ktOrJavaExt}"))

}
