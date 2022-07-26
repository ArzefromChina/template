package com.github.arzefromchina.template.mvvm

import com.intellij.psi.PsiDirectory
import com.intellij.psi.PsiFileFactory
import org.jetbrains.kotlin.idea.KotlinLanguage


/**
 * Author: Arze
 * Date: 2022/6/2 15:23
 * Description:
 * History:
 * <author> <time> <version> <desc>
 * Arze 2022/6/2 1.0
 */

fun String.headToLower(): String {
    val buffer = StringBuffer()
    if (!isNullOrEmpty()) {
        val part1 = this.subSequence(0, 1).toString()
        val part2 = this.subSequence(1, this.length).toString()
        buffer.append(part1.toLowerCase())
        buffer.append(part2)
    }
    return buffer.toString()
}

fun String.headToUpperCase(): String {
    val buffer = StringBuffer()
    if (!isNullOrEmpty()) {
        val part1 = this.subSequence(0, 1).toString()
        val part2 = this.subSequence(1, this.length).toString()
        buffer.append(part1.toUpperCase())
        buffer.append(part2)
    }
    return buffer.toString()
}

fun String.replaceComponent(): String {
    val buffer = StringBuffer()
    if (!isNullOrEmpty()) {
        val splits = this.split("_")
        splits.forEach{ buffer.append(it.headToUpperCase()) }
    }
    return buffer.toString()
}

fun String.save(srcDir: PsiDirectory, subDirPath: String, fileName: String) {
    try {
        val destDir = subDirPath.split(".").toDir(srcDir)
        val psiFile = PsiFileFactory
            .getInstance(srcDir.project)
            .createFileFromText(fileName, KotlinLanguage.INSTANCE, this)
        destDir.add(psiFile)
    } catch (exc: Exception) {
        exc.printStackTrace()
    }
}

fun List<String>.toDir(srcDir: PsiDirectory): PsiDirectory {
    var result = srcDir
    forEach {
        result = result.findSubdirectory(it) ?: result.createSubdirectory(it)
    }
    return result
}