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
import org.eclipse.xtend.lib.macro.file.MutableFileSystemSupport;
import org.eclipse.xtend.lib.macro.services.GlobalTypeLookup;
import org.eclipse.xtend.lib.macro.services.Tracability;

import com.google.common.annotations.Beta;

/**
 * Provides services for the code generation phase.
 * 
 * @see CodeGenerationParticipant
 * 
 * @author Sven Efftinge
 * @noimplement This interface is not intended to be implemented by clients.
 */
@Beta
public interface CodeGenerationContext extends MutableFileSystemSupport, FileLocations, GlobalTypeLookup, Tracability {

}
