package net.filipvanlaenen.tsvgj.internal;

import net.filipvanlaenen.bltxmlepj.Attribute;
import net.filipvanlaenen.tsvgj.ColorKeyword;

/**
 * A class representing a color attribute using a keyword.
 */
public final class KeywordColorAttribute implements Attribute {
    /**
     * The color keyword.
     */
    private final ColorKeyword color;

    /**
     * Constructor taking the color as a keyword as its parameter.
     *
     * @param color
     *            The color as a keyword.
     */
    public KeywordColorAttribute(final ColorKeyword color) {
        this.color = color;
    }

    @Override
    public String asString() {
        return color.toString().toLowerCase();
    }
}
