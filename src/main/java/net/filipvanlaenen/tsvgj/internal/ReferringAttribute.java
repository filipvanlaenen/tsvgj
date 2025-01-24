package net.filipvanlaenen.tsvgj.internal;

import net.filipvanlaenen.bltxmlepj.Attribute;
import net.filipvanlaenen.tsvgj.SvgElement;

/**
 * A class representing an attribute referring to an element.
 */
public final class ReferringAttribute implements Attribute {
    /**
     * The element the attribute refers to.
     */
    private final SvgElement element;

    /**
     * Constructor using the element to which to refer as its parameter.
     *
     * @param element The element to refer to.
     */
    public ReferringAttribute(final SvgElement element) {
        this.element = element;
    }

    @Override
    public String asString() {
        return "url(#" + element.getReference() + ")";
    }
}
