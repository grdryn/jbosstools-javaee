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
package org.jboss.tools.struts.validators.model.handlers;

import java.util.*;
import org.jboss.tools.common.model.*;
import org.jboss.tools.common.meta.action.*;
import org.jboss.tools.common.meta.action.impl.AbstractHandler;

public class CreateDependencyHandler extends AbstractHandler {
    protected SpecialWizard wizard;
    public CreateDependencyHandler() {}

    public boolean isEnabled(XModelObject object) {
        return object != null && object.isObjectEditable();
    }

    public void executeHandler(XModelObject object, Properties p) throws XModelException {
        if(!isEnabled(object)) return;
		wizard = SpecialWizardFactory.createSpecialWizard("org.jboss.tools.struts.validator.ui.wizard.depends.DependencyWizard");
		if(wizard==null) throw new NullPointerException("Cannot find wizard class 'org.jboss.tools.struts.validator.ui.wizard.depends.DependencyWizard'.");
        if(p == null) p = new Properties();
        p.setProperty("title", "Edit Validation Rules List");
        p.setProperty("value", object.getAttributeValue("depends"));
        p.put("model", object.getModel());
        wizard.setObject(p);
        if(wizard.execute() != 0) return;
        object.getModel().changeObjectAttribute(object, "depends", "" + p.getProperty("value"));
    }

}
