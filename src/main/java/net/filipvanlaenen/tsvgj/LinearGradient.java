package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.tsvgj.internal.SvgElementWithElements;

/**
 * A class representing a linear gradient.
 *
 * @see <a href="https://www.w3.org/TR/SVG/pservers.html#LinearGradients">Paint Servers: Solid Colors, Gradients, and
 *      Patterns — SVG 2: 14.2.2. Linear gradients</a>
 */
public final class LinearGradient extends SvgElementWithElements<LinearGradient> implements PaintServerElement {
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
        return "linearGradient";
    }

    /**
     * Adds a transformation to the linear gradient.
     *
     * @param transformation The specification of the transformation.
     * @return The instance called.
     */
    public LinearGradient gradientTransform(final Transform transformation) {
        addAttribute("gradientTransform", transformation);
        return this;
    }

    /**
     * Sets the value for the linear gradient units.
     *
     * @param gradientUnits The units for the linear gradient.
     * @return The instance called.
     */
    public LinearGradient gradientUnits(final CoordinateSystemUnitsValue gradientUnits) {
        addEnumerationAttribute("gradientUnits", gradientUnits);
        return this;
    }

    /**
     * Sets the first x coordinate for the linear gradient.
     *
     * @param x1 The first x coordinate for the linear gradient.
     * @return The instance called.
     */
    public LinearGradient x1(final Number x1) {
        addNumericAttribute("x1", x1);
        return this;
    }

    /**
     * Sets the second x coordinate for the linear gradient.
     *
     * @param x2 The second x coordinate for the linear gradient.
     * @return The instance called.
     */
    public LinearGradient x2(final Number x2) {
        addNumericAttribute("x2", x2);
        return this;
    }

    /**
     * Sets the first y coordinate for the linear gradient.
     *
     * @param y1 The first y coordinate for the linear gradient.
     * @return The instance called.
     */
    public LinearGradient y1(final Number y1) {
        addNumericAttribute("y1", y1);
        return this;
    }

    /**
     * Sets the second y coordinate for the linear gradient.
     *
     * @param y2 The second y coordinate for the linear gradient.
     * @return The instance called.
     */
    public LinearGradient y2(final Number y2) {
        addNumericAttribute("y2", y2);
        return this;
    }
}
