package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.tsvgj.internal.Attributes;

/**
 * A class representing a rectangle.
 *
 * @see <a href="https://www.w3.org/TR/SVG/shapes.html#RectElement">Basic Shapes
 *      — SVG 2: 10.2. The ‘rect’ element</a>
 */
public class Rect implements ShapeElement {
    /**
     * The attributes.
     */
    private final Attributes attributes = new Attributes();

    /**
     * Sets the fill color as a hexadecimal integer.
     *
     * @param fill The fill color as a hexadecimal integer.
     * @return The instance called.
     */
    public Rect fill(final Integer fill) {
        attributes.addColorAttribute("fill", fill);
        return this;
    }

    /**
     * Sets the fill color using a color keyword.
     *
     * @param fill The fill color using a color keyword.
     * @return The instance called.
     */
    public Rect fill(final ColorKeyword fill) {
        attributes.addColorAttribute("fill", fill);
        return this;
    }

    /**
     * Sets the height of the rectangle.
     *
     * @param height The height of the rectangle.
     * @return The instance called.
     */
    public Rect height(final Number height) {
        attributes.addNumericAttribute("height", height);
        return this;
    }

    /**
     * Sets the stroke color to none.
     *
     * @param none The value none.
     * @return The instance called.
     */
    public Rect stroke(final NoneValue none) {
        attributes.addNoneValueAttribute("stroke", none);
        return this;
    }

    /**
     * Sets the stroke color using a hexadecimal integer.
     *
     * @param stroke The stroke color as a hexadecimal integer.
     * @return The instance called.
     */
    public Rect stroke(final Integer stroke) {
        attributes.addColorAttribute("stroke", stroke);
        return this;
    }

    /**
     * Sets the stroke width.
     *
     * @param strokeWidth The stroke width.
     * @return The instance called.
     */
    public Rect strokeWidth(final double strokeWidth) {
        attributes.addNumericAttribute("stroke-width", strokeWidth);
        return this;
    }

    /**
     * Sets the width of the rectangle.
     *
     * @param width The width of the rectangle.
     * @return The instance called.
     */
    public Rect width(final Number width) {
        attributes.addNumericAttribute("width", width);
        return this;
    }

    /**
     * Sets the x coordinate of the left edge of the rectangle.
     *
     * @param x The x coordinate of left edge of the rectangle.
     * @return The instance called.
     */
    public Rect x(final Number x) {
        attributes.addNumericAttribute("x", x);
        return this;
    }

    /**
     * Sets the y coordinate of the top edge of the rectangle.
     *
     * @param y The y coordinate of top edge of the rectangle.
     * @return The instance called.
     */
    public Rect y(final Number y) {
        attributes.addNumericAttribute("y", y);
        return this;
    }

    /**
     * Returns a string representation of the rectangle with the provided
     * indentation.
     *
     * @param indent The indentation.
     * @return A string representation of the rectangle with the provided
     *         indentation.
     */
    @Override
    public String asString(final String indent) {
        return indent + "<rect" + attributes.asString() + "/>";
    }
}
