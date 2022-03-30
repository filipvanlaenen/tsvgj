package net.filipvanlaenen.tsvgj.internal;

import net.filipvanlaenen.bltxmlepj.Attribute;

/**
 * A class representing a color attribute, with the code provided as an integer.
 */
public final class HexadecimalColorAttribute implements Attribute {
    /**
     * The color as an integer.
     */
    private final Integer color;

    /**
     * Constructor taking the color as an integer as a parameter.
     *
     * @param color
     *            The color as an integer.
     */
    public HexadecimalColorAttribute(final Integer color) {
        this.color = color;
    }

    @Override
    public String asString() {
        return String.format("#%06X", color);
    }
}
