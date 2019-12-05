package net.filipvanlaenen.tsvgj.internal;

import net.filipvanlaenen.tsvgj.ColorKeyword;

public class KeywordColorAttribute extends ColorAttribute {
    /**
     * The color keyword.
     */
    private final ColorKeyword color;

    /**
     * Constructs an attribute with a color value.
     *
     * @param name
     *            The name of the attribute.
     * @param color
     *            The color keyword.
     */
    KeywordColorAttribute(final String name, final ColorKeyword color) {
        super(name);
        this.color = color;
    }

    /**
     * Converts the attribute value to a string.
     *
     * @return A string representing the value.
     */
    @Override
    public String asString() {
        return color.toString().toLowerCase();
    }
}
