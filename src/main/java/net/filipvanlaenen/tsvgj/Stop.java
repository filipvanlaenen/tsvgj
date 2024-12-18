package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.tsvgj.internal.EmptySvgElement;

/**
 * A class representing a stop element.
 *
 * @see <a href="https://www.w3.org/TR/SVG/pservers.html#StopElement">Paint Servers: Solid Colors, Gradients, and
 *      Patterns — SVG 2: 14.2.4. Gradient stops</a>
 */
public final class Stop extends EmptySvgElement<Stop> implements ShapeElement {
    @Override
    public String getElementName() {
        return "stop";
    }

    /**
     * Sets position of the stop.
     *
     * @param offset The position of the stop.
     * @return The instance called.
     */
    public Stop offset(final Number offset) {
        addNumericAttribute("offset", offset);
        return this;
    }

    /**
     * Sets the color of the stop using a hexadecimal integer.
     *
     * @param stopColor The color of the stop as a hexadecimal integer.
     * @return The instance called.
     */
    public Stop stopColor(final Integer stopColor) {
        addColorAttribute("stop-color", stopColor);
        return this;
    }

    /**
     * Sets the color of the stop using a color keyword.
     *
     * @param stopColor The color of the stop using a color keyword.
     * @return The instance called.
     */
    public Stop stopColor(final ColorKeyword stopColor) {
        addColorAttribute("stop-color", stopColor);
        return this;
    }
}
