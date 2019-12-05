package net.filipvanlaenen.tsvgj.internal;

public class HexadecimalColorAttribute extends ColorAttribute {
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
    HexadecimalColorAttribute(final String name, final Integer color) {
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
