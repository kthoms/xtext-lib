/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/

package org.eclipse.xtend.lib.macro.declaration;

import org.eclipse.xtend.lib.macro.expression.Expression;

import com.google.common.annotations.Beta;

/**
 * A common super type for {@link MethodDeclaration} and {@link ConstructorDeclaration}
 * 
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
public interface ExecutableDeclaration extends TypeParameterDeclarator {
	
	/**
	 * @return whether this is a varArs declaration.
	 */
	boolean isVarArgs();
	
	/**
	 * @return the body, might be null for external elements as well as abstract methods.
	 */
	Expression getBody();
	
	/**
	 * @return the declared parameters
	 */
	Iterable<? extends ParameterDeclaration> getParameters();
	
	/**
	 * @return the declared exceptions
	 */
	Iterable<? extends TypeReference> getExceptions();
}