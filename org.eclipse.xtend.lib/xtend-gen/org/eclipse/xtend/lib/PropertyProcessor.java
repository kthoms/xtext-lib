package org.eclipse.xtend.lib;

import org.eclipse.xtend.lib.annotations.AccessorsProcessor;
import org.eclipse.xtend.lib.macro.AbstractFieldProcessor;
import org.eclipse.xtend.lib.macro.TransformationContext;
import org.eclipse.xtend.lib.macro.declaration.MutableFieldDeclaration;
import org.eclipse.xtend.lib.macro.declaration.Visibility;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * @since 2.7
 * @noextend
 * @noreference
 */
@Deprecated
@SuppressWarnings("all")
public class PropertyProcessor extends AbstractFieldProcessor {
  @Override
  public void doTransform(final MutableFieldDeclaration it, @Extension final TransformationContext context) {
    @Extension
    final AccessorsProcessor.Util util = new AccessorsProcessor.Util(context);
    boolean _hasGetter = util.hasGetter(it);
    boolean _not = (!_hasGetter);
    if (_not) {
      util.addGetter(it, Visibility.PUBLIC);
    }
    if (((!it.isFinal()) && (!util.hasSetter(it)))) {
      util.addSetter(it, Visibility.PUBLIC);
    }
    String _firstLower = StringExtensions.toFirstLower(it.getSimpleName());
    String _plus = ("_" + _firstLower);
    it.setSimpleName(_plus);
  }
}
