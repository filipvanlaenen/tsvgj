package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.tsvgj.internal.EmptySvgElement;

/**
 * A class representing a polygon.
 *
 * @see <a href="https://www.w3.org/TR/SVG/shapes.html#PolygonElement">Basic Shapes — SVG 2: 10.7. The ‘polygon’
 *      element</a>
 */
public final class Polygon extends EmptySvgElement<Polygon> implements ShapeElement {

    @Override
    public String getElementName() {
        return "polygon";
    }

    /**
     * Sets the fill color as a hexadecimal integer.
     *
     * @param fill The fill color as a hexadecimal integer.
     * @return The instance called.
     */
    public Polygon fill(final Integer fill) {
        addColorAttribute("fill", fill);
        return this;
    }

    /**
     * Sets the fill color using a paint server element.
     *
     * @param paintServerElement The paint server element used to fill the rectangle.
     * @return The instance called.
     */
    public Polygon fill(final PaintServerElement paintServerElement) {
        addReferringAttribute("fill", paintServerElement);
        return this;
    }

    /**
     * Sets the fill color using a color keyword.
     *
     * @param fill The fill color using a color keyword.
     * @return The instance called.
     */
    public Polygon fill(final ColorKeyword fill) {
        addColorAttribute("fill", fill);
        return this;
    }

    /**
     * Sets the end marker.
     *
     * @param marker The end marker for the polygon.
     * @return The instance called.
     */
    public Polygon markerEnd(final Marker marker) {
        addReferringAttribute("marker-end", marker);
        return this;
    }

    /**
     * Sets the middle marker.
     *
     * @param marker The middle marker for the polygon.
     * @return The instance called.
     */
    public Polygon markerMid(final Marker marker) {
        addReferringAttribute("marker-mid", marker);
        return this;
    }

    /**
     * Sets the start marker.
     *
     * @param marker The start marker for the polygon.
     * @return The instance called.
     */
    public Polygon markerStart(final Marker marker) {
        addReferringAttribute("marker-start", marker);
        return this;
    }

    /**
     * Sets the mask.
     *
     * @param mask The mask for the polygon.
     * @return The instance called.
     */
    public Polygon mask(final Mask mask) {
        addReferringAttribute("mask", mask);
        return this;
    }

    /**
     * Sets the coordinates of the points.
     *
     * @param coordinates The coordinates of the points.
     * @return The instance called.
     */
    public Polygon points(final Number... coordinates) {
        addPointsAttribute("points", coordinates);
        return this;
    }

    /**
     * Sets the stroke color to none.
     *
     * @param none The value none.
     * @return The instance called.
     */
    public Polygon stroke(final NoneValue none) {
        addEnumerationAttribute("stroke", none);
        return this;
    }

    /**
     * Sets the stroke color using a hexadecimal integer.
     *
     * @param stroke The stroke color as a hexadecimal integer.
     * @return The instance called.
     */
    public Polygon stroke(final Integer stroke) {
        addColorAttribute("stroke", stroke);
        return this;
    }

    /**
     * Sets the stroke width.
     *
     * @param strokeWidth The stroke width.
     * @return The instance called.
     */
    public Polygon strokeWidth(final double strokeWidth) {
        addNumericAttribute("stroke-width", strokeWidth);
        return this;
    }
}
