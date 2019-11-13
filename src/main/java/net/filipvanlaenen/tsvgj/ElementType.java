package net.filipvanlaenen.tsvgj;

public interface ElementType {
    /**
     * Returns a string representation of the element.
     *
     * @return A string representation of the element.
     */
    default String asString() {
        return asString("");
    }

    /**
     * Returns a string representation of the element with the provided indentation.
     *
     * @param indent
     *            The indentation.
     * @return A string representation of the element with the provided indentation.
     */
    String asString(String indent);
}
