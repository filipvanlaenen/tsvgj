package net.filipvanlaenen.tsvgj;

/**
 * An interface to mark graphics elements.
 */
public interface GraphicsElement extends SvgElement {
    /**
     * Returns a string representation of the graphics element.
     *
     * @return A string representation of the graphics element.
     */
    @Override
    String asString();
}
