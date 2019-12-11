package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.tsvgj.internal.Attributes;

/**
 * A class representing a circle.
 *
 * @see <a href="https://www.w3.org/TR/SVG/shapes.html#CircleElement">Basic
 *      Shapes — SVG 2: 10.3. The ‘circle’ element</a>
 *
 */
public class Circle implements ShapeElement {
    /**
     * The attributes.
     */
    private final Attributes attributes = new Attributes();

    /**
     * Sets the x coordinate of the center.
     *
     * @param cx
     *            The x coordinate of the center.
     * @return The instance called.
     */
    public Circle cx(final Number cx) {
        attributes.addNumericAttribute("cx", cx);
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
        attributes.addNumericAttribute("cy", cy);
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
        attributes.addColorAttribute("fill", fill);
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
        attributes.addColorAttribute("fill", fill);
        return this;
    }

    /**
     * Sets the opacity.
     *
     * @param opacity
     *            The opacity.
     * @return The instance called.
     */
    public Circle opacity(final double opacity) {
        attributes.addNumericAttribute("opacity", opacity);
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
        attributes.addNumericAttribute("r", r);
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
        attributes.addColorAttribute("stroke", stroke);
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
        attributes.addColorAttribute("stroke", stroke);
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
        attributes.addNumericAttribute("stroke-width", strokeWidth);
        return this;
    }

    /**
     * Returns a string representation of the circle with the provided indentation.
     *
     * @return A string representation of the circle with the provided indentation.
     */
    @Override
    public String asString(final String indent) {
        return indent + "<circle" + attributes.asString() + "/>";
    }
}
