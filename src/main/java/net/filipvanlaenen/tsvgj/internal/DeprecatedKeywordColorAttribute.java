package net.filipvanlaenen.tsvgj.internal;

import net.filipvanlaenen.tsvgj.ColorKeyword;

/**
 * A class representing a color attribute using a color keyword.
 * 
 * TODO: Should be deleted.
 */
public class DeprecatedKeywordColorAttribute extends DeprecatedColorAttribute {
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
    DeprecatedKeywordColorAttribute(final String name, final ColorKeyword color) {
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
