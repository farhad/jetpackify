package io.github.farhad.jetpackify

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

class AddRoomDependenciesAction : AnAction() {

    override fun actionPerformed(event: AnActionEvent) {
        Messages.showMessageDialog(event.project, "Hello, World!", "Here I am:", Messages.getInformationIcon())
    }

}