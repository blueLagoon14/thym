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
package org.eclipse.thym.ui.plugins.navigator.internal;

import org.eclipse.core.expressions.PropertyTester;

public class PluginActionProperyTester extends PropertyTester{

	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		if(receiver instanceof HybridPluginFolder) {
			return ((HybridPluginFolder) receiver).getPlugin() != null;
		}
		return false;
	}

}
