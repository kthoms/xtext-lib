/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtend.lib.macro.declaration;

import org.eclipse.xtext.xbase.lib.Procedures;

import com.google.common.annotations.Beta;

/**
 * A mutable type declaration.
 * 
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
public interface MutableTypeDeclaration extends MutableMemberDeclaration, TypeDeclaration {
	
	Iterable<? extends MutableMemberDeclaration> getDeclaredMembers();
	
	Iterable<? extends MutableMethodDeclaration> getDeclaredMethods();
	
	Iterable<? extends MutableFieldDeclaration> getDeclaredFields();
	
	Iterable<? extends MutableConstructorDeclaration> getDeclaredConstructors();
	
	Iterable<? extends MutableClassDeclaration> getDeclaredClasses();
	
	Iterable<? extends MutableInterfaceDeclaration> getDeclaredInterfaces();
	
	/**
	 * @since 2.8
	 */
	Iterable<? extends MutableEnumerationTypeDeclaration> getDeclaredEnumerationTypes();
	
	/**
	 * @since 2.8
	 */
	Iterable<? extends MutableAnnotationTypeDeclaration> getDeclaredAnnotationTypes();
	
	/**
	 * @since 2.8
	 */
	Iterable<? extends MutableTypeDeclaration> getDeclaredTypes();
	
	MutableFieldDeclaration findDeclaredField(String name);
	
	/**
	 * @since 2.8
	 */
	MutableTypeDeclaration findDeclaredType(String name);

	MutableMethodDeclaration findDeclaredMethod(String name, TypeReference... parameterTypes);

	MutableConstructorDeclaration findDeclaredConstructor(TypeReference... parameterTypes);
	
	/**
	 * Adds a new field with the given name. 
	 * 
	 * @param name the name of the field to be added, must be not <code>null</code>
	 * @param initializer a callback for further initialization of the created field, must be not <code>null</code>
	 * @return the created field declaration
	 * @throws UnsupportedOperationException if the underlying type declaration is not capable of containing methods.
	 * @exception IllegalArgumentException if the <code>name</code> is not a valid java identifier or the <code>initializer</code> is <code>null</code>
	 */
	MutableFieldDeclaration addField(String name, Procedures.Procedure1<MutableFieldDeclaration> initializer);

	/**
	 * Adds a new method with the given name to this type declaration.
	 * 
	 * @param name the name of the method
	 * @param initializer a call back for further initialization of the method
	 * @return the created method declaration
	 * @throws UnsupportedOperationException if the underlying type declaration is not capable of containing methods.
	 * @exception IllegalArgumentException if the <code>name</code> is not a valid java identifier or the <code>initializer</code> is <code>null</code>
	 */
	MutableMethodDeclaration addMethod(String name, Procedures.Procedure1<MutableMethodDeclaration> initializer);
	
	/**
	 * Adds a new constructor to this type declaration.
	 * 
	 * @param initializer a call back for further initialization of the constructor
	 * @return the created constructor declaration
	 * @throws UnsupportedOperationException if the underlying type declaration is not capable of containing constructors.
	 * @exception IllegalArgumentException if the <code>initializer</code> is <code>null</code>
	 */
	MutableConstructorDeclaration addConstructor(Procedures.Procedure1<MutableConstructorDeclaration> initializer);
	
	/**
	 * It is not possible to rename a type. 
	 * @exception UnsupportedOperationException always
	 */
	public void setSimpleName(String simpleName);
	
	/**
	 * It is not possible to remove a type.
	 * @throws UnsupportedOperationException always
	 */
	public void remove();
	
}
