package net.filipvanlaenen.tsvgj.internal;

import net.filipvanlaenen.bltxmlepj.ElementWithAttributesAndElements;

public abstract class SvgElementWithAttributesAndElements extends ElementWithAttributesAndElements {
    /**
     * Adds a numeric array attribute to the set of attributes.
     *
     * @param name
     *            The name of the attribute.
     * @param numbers
     *            The numeric array value of the attribute.
     */
    public void addNumericArrayAttribute(final String name, final Number... numbers) {
        addAttribute(name, new NumericArrayAttribute(numbers));
    }
}
