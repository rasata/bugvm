/*
 * Copyright 2000-2013 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intellij.internal.psiView;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.application.ex.ApplicationManagerEx;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFile;

/**
 * Created by IntelliJ IDEA.
 * User: Nadya.Zabrodina
 * Date: 7/4/11
 * Time: 4:16 PM
 */
public class PsiViewerForContextAction extends AnAction implements DumbAware {
  @Override
  public void actionPerformed(AnActionEvent e) {

    Editor editor = CommonDataKeys.EDITOR.getData(e.getDataContext());
    PsiFile currentFile = CommonDataKeys.PSI_FILE.getData(e.getDataContext());
    new PsiViewerDialog(currentFile.getProject(), false, currentFile, editor).show();
  }

  @Override
  public void update(AnActionEvent e) {
    if (!ApplicationManagerEx.getApplicationEx().isInternal()) {
      e.getPresentation().setVisible(false);
      e.getPresentation().setEnabled(false);
      return;
    }
    final Project project = CommonDataKeys.PROJECT.getData(e.getDataContext());
    PsiFile currentFile = CommonDataKeys.PSI_FILE.getData(e.getDataContext());
    e.getPresentation().setEnabled(project != null && currentFile != null);
  }
}