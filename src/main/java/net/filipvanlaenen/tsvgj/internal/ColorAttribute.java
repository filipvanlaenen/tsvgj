package net.filipvanlaenen.tsvgj.internal;

/**
 * A class representing a color attribute.
 */
public abstract class ColorAttribute implements Attribute {
    /**
     * The name of the attribute.
     */
    private final String name;

    /**
     * Constructs a color attribute.
     *
     * @param name
     *            The name of the attribute.
     */
    ColorAttribute(final String name) {
        this.name = name;
    }
}
