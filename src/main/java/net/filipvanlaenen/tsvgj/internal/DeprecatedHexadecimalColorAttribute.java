package net.filipvanlaenen.tsvgj.internal;

/**
 * A class representing a color attribute using a hexadecimal integer.
 * 
 * TODO: Should be deleted.
 */
public class DeprecatedHexadecimalColorAttribute extends DeprecatedColorAttribute {
    /**
     * The color as an integer.
     */
    private final Integer color;

    /**
     * Constructs an attribute with a color value.
     *
     * @param name
     *            The name of the attribute.
     * @param color
     *            The color as an integer.
     */
    DeprecatedHexadecimalColorAttribute(final String name, final Integer color) {
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
        return String.format("#%06X", color);
    }
}
