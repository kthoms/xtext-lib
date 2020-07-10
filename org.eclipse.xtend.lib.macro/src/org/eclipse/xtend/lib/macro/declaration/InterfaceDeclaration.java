/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/

package org.eclipse.xtend.lib.macro.declaration;

import com.google.common.annotations.Beta;

/**
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
public interface InterfaceDeclaration extends TypeDeclaration, TypeParameterDeclarator {
	
	/**
	 * @return whether this class is marked <code>strictfp</code>
	 */
	boolean isStrictFloatingPoint();
	
	/**
	 * @return the extended interfaces
	 */
	Iterable<? extends TypeReference> getExtendedInterfaces();
	
}