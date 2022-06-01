package com.github.arzefromchina.template.services

import com.intellij.openapi.project.Project
import com.github.arzefromchina.template.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
