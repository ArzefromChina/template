package com.github.arzefromchina.template.services

import com.intellij.openapi.project.Project
import org.jetbrains.plugins.template.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}