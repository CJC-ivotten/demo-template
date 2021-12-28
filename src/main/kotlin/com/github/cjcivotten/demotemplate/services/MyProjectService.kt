package com.github.cjcivotten.demotemplate.services

import com.intellij.openapi.project.Project
import com.github.cjcivotten.demotemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
