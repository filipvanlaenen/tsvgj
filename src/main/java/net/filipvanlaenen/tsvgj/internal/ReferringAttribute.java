package net.filipvanlaenen.tsvgj.internal;

import net.filipvanlaenen.bltxmlepj.Attribute;
import net.filipvanlaenen.tsvgj.PaintServerElement;

/**
 * A class representing an attribute referring to an element.
 */
public final class ReferringAttribute implements Attribute {
    /**
     * The paint server element the attribute refers to.
     */
    private final PaintServerElement paintServerElement;

    /**
     * Constructor using the paint server element to which to refer as its parameter.
     *
     * @param paintServerElement The paint server element to refer to.
     */
    public ReferringAttribute(final PaintServerElement paintServerElement) {
        this.paintServerElement = paintServerElement;
    }

    @Override
    public String asString() {
        return "url(#" + paintServerElement.getReference() + ")";
    }
}
