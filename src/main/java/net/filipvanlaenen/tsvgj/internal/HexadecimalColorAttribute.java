package net.filipvanlaenen.tsvgj.internal;

import net.filipvanlaenen.bltxmlepj.Attribute;

public class HexadecimalColorAttribute implements Attribute {
    /**
     * The color as an integer.
     */
    private final Integer color;

    public HexadecimalColorAttribute(final Integer color) {
        this.color = color;
    }

    @Override
    public String asString() {
        return String.format("#%06X", color);
    }
}
