package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.tsvgj.internal.SvgElementWithAttributes;

/**
 * A class representing a rectangle.
 *
 * @see <a href="https://www.w3.org/TR/SVG/shapes.html#RectElement">Basic Shapes
 *      — SVG 2: 10.2. The ‘rect’ element</a>
 */
public class Rect extends SvgElementWithAttributes implements ShapeElement {
    /**
     * Sets the fill color as a hexadecimal integer.
     *
     * @param fill
     *            The fill color as a hexadecimal integer.
     * @return The instance called.
     */
    public Rect fill(final Integer fill) {
        addColorAttribute("fill", fill);
        return this;
    }

    /**
     * Sets the fill color using a paint server element.
     *
     * @param paintServerElement
     *            The paint server element used to fill the rectangle.
     * @return The instance called.
     */
    public Rect fill(final PaintServerElement paintServerElement) {
        addReferringAttribute("fill", paintServerElement);
        return this;
    }

    /**
     * Sets the fill color using a color keyword.
     *
     * @param fill
     *            The fill color using a color keyword.
     * @return The instance called.
     */
    public Rect fill(final ColorKeyword fill) {
        addColorAttribute("fill", fill);
        return this;
    }

    /**
     * Sets the height of the rectangle.
     *
     * @param height
     *            The height of the rectangle.
     * @return The instance called.
     */
    public Rect height(final Number height) {
        addNumericAttribute("height", height);
        return this;
    }

    /**
     * Sets the stroke color to none.
     *
     * @param none
     *            The value none.
     * @return The instance called.
     */
    public Rect stroke(final NoneValue none) {
        addEnumerationAttribute("stroke", none);
        return this;
    }

    /**
     * Sets the stroke color using a hexadecimal integer.
     *
     * @param stroke
     *            The stroke color as a hexadecimal integer.
     * @return The instance called.
     */
    public Rect stroke(final Integer stroke) {
        addColorAttribute("stroke", stroke);
        return this;
    }

    /**
     * Sets the stroke width.
     *
     * @param strokeWidth
     *            The stroke width.
     * @return The instance called.
     */
    public Rect strokeWidth(final double strokeWidth) {
        addNumericAttribute("stroke-width", strokeWidth);
        return this;
    }

    /**
     * Sets the width of the rectangle.
     *
     * @param width
     *            The width of the rectangle.
     * @return The instance called.
     */
    public Rect width(final Number width) {
        addNumericAttribute("width", width);
        return this;
    }

    /**
     * Sets the x coordinate of the left edge of the rectangle.
     *
     * @param x
     *            The x coordinate of left edge of the rectangle.
     * @return The instance called.
     */
    public Rect x(final Number x) {
        addNumericAttribute("x", x);
        return this;
    }

    /**
     * Sets the y coordinate of the top edge of the rectangle.
     *
     * @param y
     *            The y coordinate of top edge of the rectangle.
     * @return The instance called.
     */
    public Rect y(final Number y) {
        addNumericAttribute("y", y);
        return this;
    }

    @Override
    public String getElementName() {
        return "rect";
    }
}
