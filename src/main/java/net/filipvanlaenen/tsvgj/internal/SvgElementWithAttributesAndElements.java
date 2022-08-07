package net.filipvanlaenen.tsvgj.internal;

import net.filipvanlaenen.bltxmlepj.AttributeValueEnumeration;
import net.filipvanlaenen.bltxmlepj.ElementWithAttributesAndElements;

/**
 * Extension of the <code>ElementWithAttributesAndElements</code> class with
 * methods specific for SVG.
 */
public abstract class SvgElementWithAttributesAndElements extends ElementWithAttributesAndElements {
    /**
     * Adds an enumeration array attribute to the set of attributes.
     *
     * @param name
     *            The name of the attribute.
     * @param enumationValues
     *            The enumeration array value of the attribute.
     */
    protected void addEnumerationArrayAttribute(final String name, final AttributeValueEnumeration... enumationValues) {
        addAttribute(name, new EnumerationArrayAttribute(enumationValues));
    }
    /**
     * Adds a numeric array attribute to the set of attributes.
     *
     * @param name
     *            The name of the attribute.
     * @param numbers
     *            The numeric array value of the attribute.
     */
    protected void addNumericArrayAttribute(final String name, final Number... numbers) {
        addAttribute(name, new NumericArrayAttribute(numbers));
    }
}
