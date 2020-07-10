/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtend.lib.macro;

import java.util.List;

import org.eclipse.xtend.lib.macro.declaration.ClassDeclaration;
import org.eclipse.xtend.lib.macro.declaration.MutableClassDeclaration;
import org.eclipse.xtext.xbase.lib.Extension;

import com.google.common.annotations.Beta;

/**
 * A convenient base class to process active annotations for classes.
 * 
 * @author Sven Efftinge
 */
@Beta
public abstract class AbstractClassProcessor implements RegisterGlobalsParticipant<ClassDeclaration>, TransformationParticipant<MutableClassDeclaration>, CodeGenerationParticipant<ClassDeclaration>, ValidationParticipant<ClassDeclaration> {

	public void doRegisterGlobals(List<? extends ClassDeclaration> annotatedClasses, @Extension RegisterGlobalsContext context) {
		for (ClassDeclaration annotatedClass : annotatedClasses) {
			doRegisterGlobals(annotatedClass, context);
		}
	}
	
	/**
	 * Called during global symbol collecting.
	 * 
	 * @param annotatedClass a source element annotated with the annotation this processor is responsible for.
	 * @param context
	 */
	public void doRegisterGlobals(ClassDeclaration annotatedClass, @Extension RegisterGlobalsContext context) {}
	
	public void doTransform(List<? extends MutableClassDeclaration> annotatedClasses, @Extension TransformationContext context) {
		for (MutableClassDeclaration annotatedClass : annotatedClasses) {
			doTransform(annotatedClass, context);
		}
	}

	/**
	 * @param annotatedClass a mutable class representation annotated with the annotation this processor is responsible for.
	 * @param context
	 */
	public void doTransform(MutableClassDeclaration annotatedClass, @Extension TransformationContext context) {}

	public void doGenerateCode(List<? extends ClassDeclaration> annotatedSourceElements, @Extension CodeGenerationContext context) {
		for (ClassDeclaration annotatedClass : annotatedSourceElements) {
			doGenerateCode(annotatedClass, context);
		}
	}
	
	/**
	 * Called during code generation. 
	 * 
	 * @param annotatedClass a source element annotated with the annotation this processor is responsible for.
	 * @param context
	 * @see CodeGenerationParticipant#doGenerateCode(List, CodeGenerationContext)
	 */
	public void doGenerateCode(ClassDeclaration annotatedClass, @Extension CodeGenerationContext context) {}
	
	public void doValidate(List<? extends ClassDeclaration> annotatedClasses, @Extension ValidationContext context) {
		for (ClassDeclaration annotatedClass : annotatedClasses) {
			doValidate(annotatedClass, context);
		}
	}

	/**
	 * Invoked by the validator
	 * @param annotatedClass the generated class that should be validated 
	 * @param context 
	 * @see #doValidate(List, ValidationContext)
	 * @since 2.7
	 */
	public void doValidate(ClassDeclaration annotatedClass, @Extension ValidationContext context) {}

}
