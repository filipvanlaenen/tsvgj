package net.filipvanlaenen.tsvgj.internal;

import net.filipvanlaenen.tsvgj.PaintServerElement;

/**
 * A class representing an attribute referring to a paint server element.
 */
public class ReferringAttribute implements Attribute {
    /**
     * The paint server element the attribute refers to.
     */
    private final PaintServerElement paintServerElement;

    /**
     * Constructor using the paint server element to which to refer as its
     * parameter.
     *
     * @param paintServerElement The paint server element to refer to.
     */
    public ReferringAttribute(final PaintServerElement paintServerElement) {
        this.paintServerElement = paintServerElement;
    }

    /**
     * Converts the attribute value to a string.
     *
     * @return A string representing the value.
     */
    @Override
    public String asString() {
        return "url(#" + paintServerElement.getReference() + ")";
    }
}
