/*******************************************************************************
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.xbase.lib;

import com.google.common.annotations.GwtCompatible;

/**
 * This exception is thrown if a method was invoked directly though it is usually inlined by the compiler by means of
 * the {@link Inline @Inline annotation} and executed in a custom manner by the interpreter.
 * 
 * @author Sebastian Zarnekow - Initial contribution and API
 * @since 2.6
 */
@GwtCompatible
class HardcodedInInterpreterException extends RuntimeException {

	private static final long serialVersionUID = 1L;

}
