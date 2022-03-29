package net.filipvanlaenen.tsvgj.internal;

/**
 * A class representing a color attribute.
 * 
 * TODO: Should be deleted.
 */
public abstract class DeprecatedColorAttribute implements Attribute {
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
    DeprecatedColorAttribute(final String name) {
        this.name = name;
    }
}
