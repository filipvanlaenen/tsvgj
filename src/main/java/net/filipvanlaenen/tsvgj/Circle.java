package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.tsvgj.internal.EmptySvgElement;

/**
 * A class representing a circle.
 *
 * @see <a href="https://www.w3.org/TR/SVG/shapes.html#CircleElement">Basic
 *      Shapes — SVG 2: 10.3. The ‘circle’ element</a>
 */
public final class Circle extends EmptySvgElement implements ShapeElement {
    /**
     * Sets the x coordinate of the center.
     *
     * @param cx
     *            The x coordinate of the center.
     * @return The instance called.
     */
    public Circle cx(final Number cx) {
        addNumericAttribute("cx", cx);
        return this;
    }

    /**
     * Sets the y coordinate of the center.
     *
     * @param cy
     *            The y coordinate of the center.
     * @return The instance called.
     */
    public Circle cy(final Number cy) {
        addNumericAttribute("cy", cy);
        return this;
    }

    /**
     * Sets the fill color using a hexadecimal integer.
     *
     * @param fill
     *            The fill color as a hexadecimal integer.
     * @return The instance called.
     */
    public Circle fill(final Integer fill) {
        addColorAttribute("fill", fill);
        return this;
    }

    /**
     * Sets the fill color using a color keyword.
     *
     * @param fill
     *            The fill color using a color keyword.
     * @return The instance called.
     */
    public Circle fill(final ColorKeyword fill) {
        addColorAttribute("fill", fill);
        return this;
    }

    /**
     * Sets the fill color to none.
     *
     * @param none
     *            The value none.
     * @return The instance called.
     */
    public Circle fill(final NoneValue none) {
        addEnumerationAttribute("fill", none);
        return this;
    }

    /**
     * Sets the fill color using a paint server element.
     *
     * @param paintServerElement
     *            The paint server element used to fill the circle.
     * @return The instance called.
     */
    public Circle fill(final PaintServerElement paintServerElement) {
        addReferringAttribute("fill", paintServerElement);
        return this;
    }

    /**
     * Sets the fill opacity.
     *
     * @param fillOpacity
     *            The fill opacity.
     * @return The instance called.
     */
    public Circle fillOpacity(final double fillOpacity) {
        addNumericAttribute("fill-opacity", fillOpacity);
        return this;
    }

    @Override
    public String getElementName() {
        return "circle";
    }

    /**
     * Sets the opacity.
     *
     * @param opacity
     *            The opacity.
     * @return The instance called.
     */
    public Circle opacity(final double opacity) {
        addNumericAttribute("opacity", opacity);
        return this;
    }

    /**
     * Sets the radius.
     *
     * @param r
     *            The radius.
     * @return The instance called.
     */
    public Circle r(final Number r) {
        addNumericAttribute("r", r);
        return this;
    }

    /**
     * Sets the stroke color using a hexadecimal integer.
     *
     * @param stroke
     *            The stroke color as a hexadecimal integer.
     * @return The instance called.
     */
    public Circle stroke(final Integer stroke) {
        addColorAttribute("stroke", stroke);
        return this;
    }

    /**
     * Sets the stroke color using a color keyword.
     *
     * @param stroke
     *            The stroke color using a color keyword.
     * @return The instance called.
     */
    public Circle stroke(final ColorKeyword stroke) {
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
    public Circle strokeWidth(final double strokeWidth) {
        addNumericAttribute("stroke-width", strokeWidth);
        return this;
    }
}
