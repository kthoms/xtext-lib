/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.xbase.lib;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;

/**
 * Allows to describe how a certain static function should be inlined by the Xbase compiler.
 * 
 * @author Sebastian Zarnekow - Initial contribution and API
 * @since 2.3
 */
@Beta
@Retention(RetentionPolicy.RUNTIME)
@Target(value = { ElementType.METHOD })
@GwtCompatible
public @interface Inline {

	/**
	 * <p>
	 * The inline format string. Placeholders like {@code $1, $2} etc can be used where the {@code 1..n} parameters of
	 * the inlined method are used for {@code $1} to {@code $n} and the {@link #imported()} types are used for
	 * subsequent indices. The next index {@code $n} can be used to insert all type parameters of the original
	 * declaration. And finally the last indices refer to the upper bound substitute of the type parameters
	 * individually.
	 * </p>
	 * <p>
	 * So the order is arguments, imports, all type parameters at once incl. brackets and upper bounds of the individual
	 * type parameters without brackets
	 * </p>
	 * <p>
	 * For the following signature <br/>
	 * {@code @Inline(value=".." imported = BigDecimal.class) public void <T1, T2> myMethod(String p1, String p2)}
	 * </p>
	 * <ul>
	 * <li>
	 * {@code $1} refers to {@code p1}</li>
	 * <li>
	 * {@code $2} refers to {@code p2}</li>
	 * <li>
	 * {@code $3} refers to {@code BigDecimal}</li>
	 * <li>
	 * {@code $4} refers to {@code <T1, T2>}</li>
	 * <li>
	 * {@code $5} refers to the upper bound of {@code T1}</li>
	 * <li>
	 * {@code $6} refers to the upper bound of {@code T2}</li>
	 * </ul>
	 * 
	 */
	String value();

	/**
	 * Types that should be imported to inline the operation.
	 */
	Class<?>[] imported() default {};

	/**
	 * Whether the inlined expression is a statement expression (see <a
	 * href="http://docs.oracle.com/javase/specs/jls/se5.0/html/statements.html#14.8">14.8 - Statement Expressions in
	 * Java Language Specification, Third Edition</a> )
	 */
	boolean statementExpression() default false;

	/**
	 * Whether the compiled Java is a constant expression operator. (see <a
	 * href="http://docs.oracle.com/javase/specs/jls/se7/html/jls-15.html#jls-15.28">15.28. Constant Expressions in Java
	 * Language Specification, Third Edition</a>
	 * 
	 * @since 2.5
	 */
	boolean constantExpression() default false;

}
