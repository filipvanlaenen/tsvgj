package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.tsvgj.internal.EmptySvgElement;

/**
 * A class representing an ellipse.
 *
 * @see <a href="https://www.w3.org/TR/SVG/shapes.html#EllipseElement">Basic Shapes — SVG 2: 10.4. The ‘ellipse’
 *      element</a>
 */
public final class Ellipse extends EmptySvgElement<Ellipse> implements ShapeElement {
    /**
     * Sets the x coordinate of the center.
     *
     * @param cx The x coordinate of the center.
     * @return The instance called.
     */
    public Ellipse cx(final Number cx) {
        addNumericAttribute("cx", cx);
        return this;
    }

    /**
     * Sets the y coordinate of the center.
     *
     * @param cy The y coordinate of the center.
     * @return The instance called.
     */
    public Ellipse cy(final Number cy) {
        addNumericAttribute("cy", cy);
        return this;
    }

    /**
     * Sets the fill color using a hexadecimal integer.
     *
     * @param fill The fill color as a hexadecimal integer.
     * @return The instance called.
     */
    public Ellipse fill(final Integer fill) {
        addColorAttribute("fill", fill);
        return this;
    }

    /**
     * Sets the fill color using a color keyword.
     *
     * @param fill The fill color using a color keyword.
     * @return The instance called.
     */
    public Ellipse fill(final ColorKeyword fill) {
        addColorAttribute("fill", fill);
        return this;
    }

    /**
     * Sets the fill color to none.
     *
     * @param none The value none.
     * @return The instance called.
     */
    public Ellipse fill(final NoneValue none) {
        addEnumerationAttribute("fill", none);
        return this;
    }

    /**
     * Sets the fill color using a paint server element.
     *
     * @param paintServerElement The paint server element used to fill the ellipse.
     * @return The instance called.
     */
    public Ellipse fill(final PaintServerElement paintServerElement) {
        addReferringAttribute("fill", paintServerElement);
        return this;
    }

    /**
     * Sets the fill opacity.
     *
     * @param fillOpacity The fill opacity.
     * @return The instance called.
     */
    public Ellipse fillOpacity(final double fillOpacity) {
        addNumericAttribute("fill-opacity", fillOpacity);
        return this;
    }

    @Override
    public String getElementName() {
        return "ellipse";
    }

    /**
     * Sets the opacity.
     *
     * @param opacity The opacity.
     * @return The instance called.
     */
    public Ellipse opacity(final double opacity) {
        addNumericAttribute("opacity", opacity);
        return this;
    }

    /**
     * Sets the radius in the x-direction.
     *
     * @param rx The radius in the x-direction.
     * @return The instance called.
     */
    public Ellipse rx(final Number rx) {
        addNumericAttribute("rx", rx);
        return this;
    }

    /**
     * Sets the radius in the y-direction.
     *
     * @param ry The radius in the y-direction.
     * @return The instance called.
     */
    public Ellipse ry(final Number ry) {
        addNumericAttribute("ry", ry);
        return this;
    }

    /**
     * Sets the stroke color using a hexadecimal integer.
     *
     * @param stroke The stroke color as a hexadecimal integer.
     * @return The instance called.
     */
    public Ellipse stroke(final Integer stroke) {
        addColorAttribute("stroke", stroke);
        return this;
    }

    /**
     * Sets the stroke color using a color keyword.
     *
     * @param stroke The stroke color using a color keyword.
     * @return The instance called.
     */
    public Ellipse stroke(final ColorKeyword stroke) {
        addColorAttribute("stroke", stroke);
        return this;
    }

    /**
     * Sets the stroke width.
     *
     * @param strokeWidth The stroke width.
     * @return The instance called.
     */
    public Ellipse strokeWidth(final double strokeWidth) {
        addNumericAttribute("stroke-width", strokeWidth);
        return this;
    }

    /**
     * Adds a transformation to the ellipse.
     *
     * @param transformation The specification of the transformation.
     * @return The instance called.
     */
    public Ellipse transform(final Transform transformation) {
        addAttribute("transform", transformation);
        return this;
    }
}
