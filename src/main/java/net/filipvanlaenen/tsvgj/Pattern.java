package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.tsvgj.internal.SvgElementWithElements;

/**
 * A class representing a pattern.
 *
 * @see <a href="https://www.w3.org/TR/SVG/pservers.html#PatternElement">Paint Servers: Solid Colors, Gradients, and
 *      Patterns — SVG 2: 14.3. Patterns</a>
 */
public final class Pattern extends SvgElementWithElements<RadialGradient> implements PaintServerElement {
    /**
     * The ID of the pattern element.
     */
    private Integer id;

    /**
     * Adds a shape element.
     *
     * @param shape A shape element.
     */
    public void addElement(final ShapeElement shape) {
        super.addElement(shape);
    }

    @Override
    public String getElementName() {
        return "pattern";
    }

    /**
     * Returns a reference to the pattern.
     *
     * @return A reference to the pattern.
     */
    @Override
    public String getReference() {
        return "pattern-" + id.toString();
    }

    /**
     * Sets the height of the pattern.
     *
     * @param height The height of the pattern.
     * @return The instance called.
     */
    public Pattern height(final Number height) {
        addNumericAttribute("height", height);
        return this;
    }

    /**
     * Sets the ID for the pattern.
     *
     * @param id The ID for the pattern.
     */
    @Override
    public void setId(final int id) {
        this.id = id;
        id(getReference());
    }

    /**
     * Adds a transformation to the pattern.
     *
     * @param transformation The specification of the transformation.
     * @return The instance called.
     */
    public Pattern patternTransform(final Transform transformation) {
        addAttribute("patternTransform", transformation);
        return this;
    }

    /**
     * Sets the value for the pattern units.
     *
     * @param patternUnits The units for the pattern.
     * @return The instance called.
     */
    public Pattern patternUnits(final CoordinateSystemUnitsValue patternUnits) {
        addEnumerationAttribute("patternUnits", patternUnits);
        return this;
    }

    /**
     * Sets the width of the pattern.
     *
     * @param width The width of the pattern.
     * @return The instance called.
     */
    public Pattern width(final Number width) {
        addNumericAttribute("width", width);
        return this;
    }

    /**
     * Sets the x coordinate of the left edge of the pattern.
     *
     * @param x The x coordinate of left edge of the pattern.
     * @return The instance called.
     */
    public Pattern x(final Number x) {
        addNumericAttribute("x", x);
        return this;
    }

    /**
     * Sets the y coordinate of the top edge of the pattern.
     *
     * @param y The y coordinate of top edge of the pattern.
     * @return The instance called.
     */
    public Pattern y(final Number y) {
        addNumericAttribute("y", y);
        return this;
    }
}
