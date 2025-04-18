package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.tsvgj.internal.EmptySvgElement;

/**
 * A class representing a rectangle.
 *
 * @see <a href="https://www.w3.org/TR/SVG/shapes.html#RectElement">Basic Shapes — SVG 2: 10.2. The ‘rect’ element</a>
 */
public final class Rect extends EmptySvgElement<Rect> implements ShapeElement {

    @Override
    public String getElementName() {
        return "rect";
    }

    /**
     * Sets the fill color as a hexadecimal integer.
     *
     * @param fill The fill color as a hexadecimal integer.
     * @return The instance called.
     */
    public Rect fill(final Integer fill) {
        addColorAttribute("fill", fill);
        return this;
    }

    /**
     * Sets the fill color using a paint server element.
     *
     * @param paintServerElement The paint server element used to fill the rectangle.
     * @return The instance called.
     */
    public Rect fill(final PaintServerElement paintServerElement) {
        addReferringAttribute("fill", paintServerElement);
        return this;
    }

    /**
     * Sets the fill color using a color keyword.
     *
     * @param fill The fill color using a color keyword.
     * @return The instance called.
     */
    public Rect fill(final ColorKeyword fill) {
        addColorAttribute("fill", fill);
        return this;
    }

    /**
     * Sets the height of the rectangle.
     *
     * @param height The height of the rectangle.
     * @return The instance called.
     */
    public Rect height(final Number height) {
        addNumericAttribute("height", height);
        return this;
    }

    /**
     * Sets the end marker.
     *
     * @param marker The end marker for the rectangle.
     * @return The instance called.
     */
    public Rect markerEnd(final Marker marker) {
        addReferringAttribute("marker-end", marker);
        return this;
    }

    /**
     * Sets the middle marker.
     *
     * @param marker The middle marker for the rectangle.
     * @return The instance called.
     */
    public Rect markerMid(final Marker marker) {
        addReferringAttribute("marker-mid", marker);
        return this;
    }

    /**
     * Sets the start marker.
     *
     * @param marker The start marker for the rectangle.
     * @return The instance called.
     */
    public Rect markerStart(final Marker marker) {
        addReferringAttribute("marker-start", marker);
        return this;
    }

    /**
     * Sets the mask.
     *
     * @param mask The mask for the rectangle.
     * @return The instance called.
     */
    public Rect mask(final Mask mask) {
        addReferringAttribute("mask", mask);
        return this;
    }

    /**
     * Sets the stroke color to none.
     *
     * @param none The value none.
     * @return The instance called.
     */
    public Rect stroke(final NoneValue none) {
        addEnumerationAttribute("stroke", none);
        return this;
    }

    /**
     * Sets the stroke color using a hexadecimal integer.
     *
     * @param stroke The stroke color as a hexadecimal integer.
     * @return The instance called.
     */
    public Rect stroke(final Integer stroke) {
        addColorAttribute("stroke", stroke);
        return this;
    }

    /**
     * Sets the stroke width.
     *
     * @param strokeWidth The stroke width.
     * @return The instance called.
     */
    public Rect strokeWidth(final double strokeWidth) {
        addNumericAttribute("stroke-width", strokeWidth);
        return this;
    }

    /**
     * Sets the width of the rectangle.
     *
     * @param width The width of the rectangle.
     * @return The instance called.
     */
    public Rect width(final Number width) {
        addNumericAttribute("width", width);
        return this;
    }

    /**
     * Sets the x coordinate of the left edge of the rectangle.
     *
     * @param x The x coordinate of left edge of the rectangle.
     * @return The instance called.
     */
    public Rect x(final Number x) {
        addNumericAttribute("x", x);
        return this;
    }

    /**
     * Sets the y coordinate of the top edge of the rectangle.
     *
     * @param y The y coordinate of top edge of the rectangle.
     * @return The instance called.
     */
    public Rect y(final Number y) {
        addNumericAttribute("y", y);
        return this;
    }
}
