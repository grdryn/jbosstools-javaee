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
package org.jboss.tools.struts.model.handlers.page.create;

import org.jboss.tools.common.meta.action.impl.*;
import org.jboss.tools.common.model.XModelException;

public class SelectPageSupport extends SpecialWizardSupport {

    public SelectPageSupport() {}

    protected void reset() {
        String nm = getProperties().getProperty("name");
        if(nm != null) setAttributeValue(0, "name", nm);
        Object context = getProperties().get("context");
        if(context != null) setAttributeContext(0, "name", context);
    }

    public void action(String name) throws XModelException {
		if(OK.equals(name) || FINISH.equals(name)) {
            extractStepData(0);
            getProperties().setProperty("name", getAttributeValue(0, "name"));
            setFinished(true);
        } else if(CANCEL.equals(name)) {
            setStepId(-1);
            getProperties().setProperty("SelectPage.cancelled", "true");
            setFinished(true);
        }
    }

}
