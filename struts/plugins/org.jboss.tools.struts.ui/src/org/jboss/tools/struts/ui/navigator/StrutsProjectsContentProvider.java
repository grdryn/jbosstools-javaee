/*******************************************************************************
 * Copyright (c) 2007 Exadel, Inc. and Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Exadel, Inc. and Red Hat, Inc. - initial API and implementation
 ******************************************************************************/ 
package org.jboss.tools.struts.ui.navigator;

import org.eclipse.core.resources.IProject;
import org.jboss.tools.common.model.project.IModelNature;
import org.jboss.tools.common.model.util.EclipseResourceUtil;
import org.jboss.tools.common.model.ui.views.navigator.NavigatorContentProvider;
import org.jboss.tools.struts.StrutsProjectUtil;

public class StrutsProjectsContentProvider extends NavigatorContentProvider {

	protected IModelNature getModelNature(IProject project) {
		return EclipseResourceUtil.getModelNature(project, StrutsProjectUtil.STRUTS_NATURE_ID);
	}
	
	protected String getFilteredTreeName() {
		return "StrutsProjects";
	}	

}
