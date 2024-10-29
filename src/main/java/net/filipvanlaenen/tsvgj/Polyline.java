package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.tsvgj.internal.EmptySvgElement;

/**
 * A class representing a polyline.
 *
 * @see <a href="https://www.w3.org/TR/SVG/shapes.html#PolylineElement">Basic Shapes — SVG 2: 10.6. The ‘polyline’
 *      element</a>
 */
public final class Polyline extends EmptySvgElement<Polyline> implements ShapeElement {
    @Override
    public String getElementName() {
        return "polyline";
    }

    /**
     * Sets the coordinates of the points.
     *
     * @param coordinates The coordinates of the points.
     * @return The instance called.
     */
    public Polyline points(final Number... coordinates) {
        addPointsAttribute("points", coordinates);
        return this;
    }

    /**
     * Sets the stroke color of the line using a hexadecimal integer.
     *
     * @param stroke The stroke color of the line as a hexadecimal integer.
     * @return The instance called.
     */
    public Polyline stroke(final Integer stroke) {
        addColorAttribute("stroke", stroke);
        return this;
    }

    /**
     * Sets the stroke color of the line using a color keyword.
     *
     * @param stroke The stroke color of the line using a color keyword.
     * @return The instance called.
     */
    public Polyline stroke(final ColorKeyword stroke) {
        addColorAttribute("stroke", stroke);
        return this;
    }

    /**
     * Sets the stroke width of the line.
     *
     * @param strokeWidth The stroke width of the line.
     * @return The instance called.
     */
    public Polyline strokeWidth(final Number strokeWidth) {
        addNumericAttribute("stroke-width", strokeWidth);
        return this;
    }
}
