/*******************************************************************************
 * Copyright (c) 2007-2008 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributor:
 *     Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package org.jboss.tools.jsf.vpe.jsf.test.jbide;

import org.jboss.tools.jsf.vpe.jsf.test.JsfAllTests;
import org.jboss.tools.vpe.base.test.ComponentContentTest;

/**
 * @author mareshkau
 *
 */
public class JBIDE3197Test extends ComponentContentTest {

	public JBIDE3197Test(String name) {
		super(name);
	}
	
	public void testIncorrectTags() throws Throwable {
		performContentTest("incorrectCustomTags.xhtml"); //$NON-NLS-1$
	}
	
	public void testContentCustomTagsWithSourceSupport() throws Throwable {
		performContentTest("correctCustomTags.xhtml"); //$NON-NLS-1$
	}
	
	public void testJBIDE1593() throws Throwable {
		performContentTest("show100.xhtml"); //$NON-NLS-1$
	}

	@Override
	protected String getTestProjectName() {
		return JsfAllTests.IMPORT_CUSTOM_FACELETS_PROJECT;
	}
}
