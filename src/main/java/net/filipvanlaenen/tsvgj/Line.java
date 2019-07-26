package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.tsvgj.internal.Attributes;

/**
 * A class representing a line.
 *
 * @see <a href="https://www.w3.org/TR/SVG/shapes.html#LineElement">Basic Shapes
 *      — SVG 2: 10.5. The ‘line’ element</a>
 */
public class Line implements ShapeElement {
    /**
     * The attributes.
     */
    private final Attributes attributes = new Attributes();

    /**
     * Sets the stroke color of the line.
     *
     * @param stroke
     *            The stroke color of the line.
     * @return The instance called.
     */
    public Line stroke(final Integer stroke) {
        attributes.addColorAttribute("stroke", stroke);
        return this;
    }

    /**
     * Sets the stroke width of the line.
     *
     * @param strokeWidth
     *            The stroke width of the line.
     * @return The instance called.
     */
    public Line strokeWidth(final Number strokeWidth) {
        attributes.addNumericAttribute("stroke-width", strokeWidth);
        return this;
    }

    /**
     * Sets the x1 coordinate of the line.
     *
     * @param x1
     *            The x1 coordinate of the line.
     * @return The instance called.
     */
    public Line x1(final Number x1) {
        attributes.addNumericAttribute("x1", x1);
        return this;
    }

    /**
     * Sets the x2 coordinate of the line.
     *
     * @param x2
     *            The x2 coordinate of the line.
     * @return The instance called.
     */
    public Line x2(final Number x2) {
        attributes.addNumericAttribute("x2", x2);
        return this;
    }

    /**
     * Sets the y1 coordinate of the line.
     *
     * @param y1
     *            The y1 coordinate of the line.
     * @return The instance called.
     */
    public Line y1(final Number y1) {
        attributes.addNumericAttribute("y1", y1);
        return this;
    }

    /**
     * Sets the y2 coordinate of the line.
     *
     * @param y2
     *            The y2 coordinate of the line.
     * @return The instance called.
     */
    public Line y2(final Number y2) {
        attributes.addNumericAttribute("y2", y2);
        return this;
    }

    /**
     * Returns a string representation of the line.
     *
     * @return A string representation of the line.
     */
    @Override
    public String asString() {
        return "<line" + attributes.asString() + "/>";
    }
}
