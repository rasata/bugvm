/*
 * Copyright (C) 2015 RoboVM AB
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/gpl-2.0.html>.
 */
package com.bugvm.idea.components;

import com.intellij.ProjectTopics;
import com.intellij.compiler.CompilerWorkspaceConfiguration;
import com.intellij.compiler.server.BuildManager;
import com.intellij.compiler.server.BuildProcessParametersProvider;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.externalSystem.model.ExternalSystemDataKeys;
import com.intellij.openapi.externalSystem.util.ExternalSystemApiUtil;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleComponent;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.roots.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.plugins.gradle.compiler.GradleBuildProcessParametersProvider;
import org.jetbrains.plugins.gradle.util.GradleConstants;
import com.bugvm.idea.BugVmPlugin;

/**
 * Adds or updates the BugVM SDK to a module, sets compiler flags.
 */
public class BugVmSdkUpdateComponent implements ModuleComponent {
    private final Module module;
    private final Project project;

    public BugVmSdkUpdateComponent(Module module, final Project project) {
        this.module = module;
        this.project = project;

        // register a listener on root model changes
        project.getMessageBus().connect().subscribe(ProjectTopics.PROJECT_ROOTS, new ModuleRootAdapter() { public void rootsChanged(ModuleRootEvent event) {
            for(Module module: ModuleManager.getInstance(project).getModules()) {
                updateModule(module);
            }
        } });
    }

    @Override
    public void projectOpened() {
    }

    @Override
    public void projectClosed() {
    }

    @Override
    public void moduleAdded() {
        updateModule(module);
    }

    private void updateModule(final Module moduleToUpdate) {
        if(!BugVmPlugin.isBugVmModule(moduleToUpdate)) {
            return;
        }
        ApplicationManager.getApplication().invokeLater(new Runnable() {
            @Override
            public void run() {
                ApplicationManager.getApplication().runWriteAction(new Runnable() {
                    @Override
                    public void run() {
                        // module might already have been disposed, need to fetch it
                        // by name
                        Module module = ModuleManager.getInstance(project).findModuleByName(moduleToUpdate.getName());
                        if(module != null) {
                            ModuleRootManager manager = ModuleRootManager.getInstance(module);
                            ModifiableRootModel model = manager.getModifiableModel();
                            Sdk sdk = BugVmPlugin.getSdk();
                            if (sdk != null && !sdk.equals(model.getSdk())) {
                                model.setSdk(sdk);
                                model.commit();
                            }
                        }
                    }
                });
            }
        });
    }

    @Override
    public void initComponent() {
    }

    @Override
    public void disposeComponent() {

    }

    @NotNull
    @Override
    public String getComponentName() {
        return "BugVmSdkUpdateComponent";
    }
}