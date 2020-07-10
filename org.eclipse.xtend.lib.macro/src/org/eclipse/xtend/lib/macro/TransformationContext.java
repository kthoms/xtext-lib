/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtend.lib.macro;

import org.eclipse.xtend.lib.macro.file.FileLocations;
import org.eclipse.xtend.lib.macro.file.FileSystemSupport;
import org.eclipse.xtend.lib.macro.services.AnnotationReferenceProvider;
import org.eclipse.xtend.lib.macro.services.Associator;
import org.eclipse.xtend.lib.macro.services.ProblemSupport;
import org.eclipse.xtend.lib.macro.services.Tracability;
import org.eclipse.xtend.lib.macro.services.TypeLookup;
import org.eclipse.xtend.lib.macro.services.TypeReferenceProvider;

import com.google.common.annotations.Beta;

/**
 * Services provided during transformation phase
 * 
 * @author Sven Efftinge
 * 
 * @see TransformationParticipant
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
public interface TransformationContext extends Tracability, ProblemSupport, TypeReferenceProvider, TypeLookup, FileSystemSupport, FileLocations, AnnotationReferenceProvider, Associator {

}
