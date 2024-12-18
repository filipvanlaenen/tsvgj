package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.tsvgj.internal.SvgElementWithElements;

/**
 * A class representing a radial gradient.
 *
 * @see <a href="https://www.w3.org/TR/SVG/pservers.html#RadialGradientElement">Paint Servers: Solid Colors, Gradients,
 *      and Patterns — SVG 2: 14.2.3. Radial gradients</a>
 */
public final class RadialGradient extends SvgElementWithElements<RadialGradient> implements PaintServerElement {
    /**
     * The ID of the radial gradient element.
     */
    private Integer id;

    /**
     * Adds a stop element.
     *
     * @param stop A stop element.
     */
    public void addElement(final Stop stop) {
        super.addElement(stop);
    }

    @Override
    public String getElementName() {
        return "radialGradient";
    }

    /**
     * Returns a reference to the radial gradient.
     *
     * @return A reference to the radial gradient.
     */
    @Override
    public String getReference() {
        return "radial-gradient-" + id.toString();
    }

    /**
     * Sets the ID for the radial gradient.
     *
     * @param id The ID for the radial gradient.
     */
    @Override
    public void setId(final int id) {
        this.id = id;
        id(getReference());
    }

    /**
     * Adds a transformation to the radial gradient.
     *
     * @param transformation The specification of the transformation.
     * @return The instance called.
     */
    public RadialGradient gradientTransform(final Transform transformation) {
        addAttribute("gradientTransform", transformation);
        return this;
    }

    /**
     * Sets the value for the radial gradient units.
     *
     * @param gradientUnits The units for the radial gradient.
     * @return The instance called.
     */
    public RadialGradient gradientUnits(final CoordinateSystemUnitsValue gradientUnits) {
        addEnumerationAttribute("gradientUnits", gradientUnits);
        return this;
    }

    /**
     * Sets the radius of the circle of the pattern.
     *
     * @param r The radius of the circle of the pattern.
     * @return The instance called.
     */
    public RadialGradient r(final Number r) {
        addNumericAttribute("r", r);
        return this;
    }

    /**
     * Sets the x coordinate for the center of the circle of the pattern.
     *
     * @param cx The x coordinate for the center of the circle of the pattern.
     * @return The instance called.
     */
    public RadialGradient cx(final Number cx) {
        addNumericAttribute("cx", cx);
        return this;
    }

    /**
     * Sets the y coordinate for the center of the circle of the pattern.
     *
     * @param cy The y coordinate for the center of the circle of the pattern.
     * @return The instance called.
     */
    public RadialGradient cy(final Number cy) {
        addNumericAttribute("cy", cy);
        return this;
    }
}
