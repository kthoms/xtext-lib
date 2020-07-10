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
import org.eclipse.xtend2.lib.StringConcatenationClient;

import com.google.common.annotations.Beta;

/**
 * @author Sven Efftinge
 * 
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
public interface MutableFieldDeclaration extends MutableMemberDeclaration, FieldDeclaration {
	
	/**
	 * sets the 'final' property
	 * 
	 * @param isFinal
	 */
	void setFinal(boolean isFinal);

	/**
	 * sets the 'static' property
	 * 
	 * @param isStatic
	 */
	void setStatic(boolean isStatic);
	
	/**
	 * sets the 'transient' property
	 * 
	 * @param isTransient
	 */
	void setTransient(boolean isTransient);
	
	/**
	 * sets the 'volatile' property
	 * 
	 * @param isVolatile
	 */
	void setVolatile(boolean isVolatile);
	
	/**
	 * sets the 'initializer' expression of this field declaration.
	 * Automatically detaches any previously assigned initializers from this field declaration.
	 * 
	 *  If the given expression is assigned to another {@link MutableExecutableDeclaration} or {@link MutableFieldDeclaration}, it
	 *  will be detached from there as well.
	 * 
	 * @param initializer
	 */
	void setInitializer(Expression initializer);
	
	/**
	 * sets the 'initializer' expression of this field declaration.
	 * Automatically detaches any previously assigned initializers from this field declaration.
	 * 
	 * <b>The given {@link CompilationStrategy} will be executed later during code generation, not immediately.</b>
	 * 
	 * @param initializer the compilation strategy, must not be <code>null</code>
	 * @exception IllegalArgumentException if the <code>initializer</code> is <code>null</code>
	 */
	void setInitializer(CompilationStrategy initializer);

	/**
	 * sets the 'initializer' expression of this field declaration.
	 * Automatically detaches any previously assigned initializers from this field declaration.
	 * 
	 * <b>The given {@link StringConcatenationClient} will be executed later during code generation, not immediately.</b>
	 * 
	 * @param template the compilation template, must not be <code>null</code>
	 * @exception IllegalArgumentException if the <code>initializer</code> is <code>null</code>
	 */
	void setInitializer(StringConcatenationClient template);
	
	/**
	 * sets the 'constant' value of this field.
	 * Automatically detaches any previously assigned initializers from this field declaration.
	 * Also marks this field as 'static' and 'final'
	 * 
	 * @param value the constant value
	 * 
	 * @since 2.8
	 */
	void setConstantValueAsLong(long value);

	/**
	 * sets the 'constant' value of this field.
	 * Automatically detaches any previously assigned initializers from this field declaration.
	 * Also marks this field as 'static' and 'final'
	 * 
	 * @param value the constant value
	 * 
	 * @since 2.8
	 */
	void setConstantValueAsInt(int value);

	/**
	 * sets the 'constant' value of this field.
	 * Automatically detaches any previously assigned initializers from this field declaration.
	 * Also marks this field as 'static' and 'final'
	 * 
	 * @param value the constant value
	 * 
	 * @since 2.8
	 */
	void setConstantValueAsShort(short value);

	/**
	 * sets the 'constant' value of this field.
	 * Automatically detaches any previously assigned initializers from this field declaration.
	 * Also marks this field as 'static' and 'final'
	 * 
	 * @param value the constant value
	 * 
	 * @since 2.8
	 */
	void setConstantValueAsByte(byte value);

	/**
	 * sets the 'constant' value of this field.
	 * Automatically detaches any previously assigned initializers from this field declaration.
	 * Also marks this field as 'static' and 'final'
	 * 
	 * @param value the constant value
	 * 
	 * @since 2.8
	 */
	void setConstantValueAsDouble(double value);

	/**
	 * sets the 'constant' value of this field.
	 * Automatically detaches any previously assigned initializers from this field declaration.
	 * Also marks this field as 'static' and 'final'
	 * 
	 * @param value the constant value
	 * 
	 * @since 2.8
	 */
	void setConstantValueAsFloat(float value);

	/**
	 * sets the 'constant' value of this field.
	 * Automatically detaches any previously assigned initializers from this field declaration.
	 * Also marks this field as 'static' and 'final'
	 * 
	 * @param value the constant value
	 * 
	 * @since 2.8
	 */
	void setConstantValueAsChar(char value);

	/**
	 * sets the 'constant' value of this field.
	 * Automatically detaches any previously assigned initializers from this field declaration.
	 * Also marks this field as 'static' and 'final'
	 * 
	 * @param value the constant value
	 * 
	 * @since 2.8
	 */
	void setConstantValueAsBoolean(boolean value);

	/**
	 * sets the 'constant' value of this field.
	 * Automatically detaches any previously assigned initializers from this field declaration.
	 * Also marks this field as 'static' and 'final'
	 * 
	 * @param value the constant value, must not be <code>null</code>
	 * @exception IllegalArgumentException if the <code>value</code> is <code>null</code>
	 * 
	 * @since 2.8
	 */
	void setConstantValueAsString(String value);
	
	/**
	 * Indicate that this field is properly initialized by the given constructor.
	 * @param constructorDeclaration a constructor that initializes this field
	 * 
	 * @since 2.7
	 */
	void markAsInitializedBy(ConstructorDeclaration constructorDeclaration);
	
	/**
	 * sets the 'type' of this field declaration
	 * @param type the type, must be not <code>null</code>
	 * @exception IllegalArgumentException if the <code>type</code> is <code>null</code>l
	 */
	void setType(TypeReference type);
}
