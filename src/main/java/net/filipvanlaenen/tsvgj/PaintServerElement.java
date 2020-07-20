package net.filipvanlaenen.tsvgj;

/**
 * An interface to mark paint server elements.
 *
 * @see <a href=
 *      "https://www.w3.org/TR/SVG/painting.html#TermPaintServerElement">Painting:
 *      Filling, Stroking and Marker Symbols — SVG 2: 13.2. Specifying paint –
 *      paint server element</a>
 */
public interface PaintServerElement extends ElementType {
    /**
     * Returns a reference to the paint server element.
     *
     * @return A reference to the paint server element.
     */
    String getReference();

    /**
     * Sets the ID for the paint server element.
     *
     * @param id The ID for the paint server element.
     */
    void setId(int id);
}
