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
 * 
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
public interface MutableMemberDeclaration extends MutableDeclaration, MemberDeclaration {
	
	/**
	 * Sets the JavaDoc comment for this member
	 * @param docComment
	 */
	public void setDocComment(String docComment);
	
	/**
	 * Sets the {@link Visibility} of this member.
	 * 
	 * @param visibility
	 */
	public void setVisibility(Visibility visibility);
	
	/**
	 * @return the type declaring this member
	 */
	public MutableTypeDeclaration getDeclaringType();
	
	/**
	 * Set the deprecated flag of this member. It will add or remove the {@link Deprecated} annotation
	 * if appropriate.
	 * @param deprecated {@code true} if this member should be marked as deprecated.
	 * @since 2.7
	 */
	void setDeprecated(boolean deprecated);
}
