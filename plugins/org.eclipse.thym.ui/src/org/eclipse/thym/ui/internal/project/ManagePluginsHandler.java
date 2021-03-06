/*******************************************************************************
 * Copyright (c) 2017 Red Hat, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * 	Contributors:
 * 		 Red Hat Inc. - initial API and implementation and/or initial documentation
 *******************************************************************************/
package org.eclipse.thym.ui.internal.project;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.thym.ui.plugins.internal.LaunchCordovaPluginWizardAction;

public class ManagePluginsHandler extends AbstractCordovaHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		new LaunchCordovaPluginWizardAction().run();
		return null;
		
	}

}
