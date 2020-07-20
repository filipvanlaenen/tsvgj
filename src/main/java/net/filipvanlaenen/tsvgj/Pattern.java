package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.tsvgj.internal.Attributes;
import net.filipvanlaenen.tsvgj.internal.Elements;

/**
 * A class representing a pattern.
 *
 * @see <a href= "https://www.w3.org/TR/SVG/pservers.html#PatternElement">Paint
 *      Servers: Solid Colors, Gradients, and Patterns — SVG 2: 14.3.
 *      Patterns</a>
 */
public class Pattern implements PaintServerElement {
    /**
     * The attributes.
     */
    private final Attributes attributes = new Attributes();
    /**
     * A list with the elements.
     */
    private final Elements elements = new Elements();
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
        elements.add(shape);
    }

    /**
     * Sets the height of the pattern.
     *
     * @param height The height of the pattern.
     * @return The instance called.
     */
    public Pattern height(final Number height) {
        attributes.addNumericAttribute("height", height);
        return this;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Adds a transformation to the pattern.
     *
     * @param transformation The specification of the transformation.
     * @return The instance called.
     */
    public Pattern patternTransform(final Transform transformation) {
        attributes.addTransformationAttribute("patternTransform", transformation);
        return this;
    }

    /**
     * Sets the value for the pattern units.
     *
     * @param patternUnits The units for the pattern.
     * @return The instance called.
     */
    public Pattern patternUnits(final PatternUnitsValue patternUnits) {
        attributes.addEnumerationAttribute("patternUnits", patternUnits);
        return this;
    }

    /**
     * Sets the width of the pattern.
     *
     * @param width The width of the pattern.
     * @return The instance called.
     */
    public Pattern width(final Number width) {
        attributes.addNumericAttribute("width", width);
        return this;
    }

    /**
     * Sets the x coordinate of the left edge of the pattern.
     *
     * @param x The x coordinate of left edge of the pattern.
     * @return The instance called.
     */
    public Pattern x(final Number x) {
        attributes.addNumericAttribute("x", x);
        return this;
    }

    /**
     * Sets the y coordinate of the top edge of the pattern.
     *
     * @param y The y coordinate of top edge of the pattern.
     * @return The instance called.
     */
    public Pattern y(final Number y) {
        attributes.addNumericAttribute("y", y);
        return this;
    }

    /**
     * Returns a string representation of the pattern with the provided indentation.
     *
     * @param indent The indentation.
     * @return A string representation of the pattern with the provided indentation.
     */
    @Override
    public String asString(final String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent);
        sb.append("<pattern");
        if (id != null) {
            sb.append(" id=\"");
            sb.append(getReference());
            sb.append("\"");
        }
        sb.append(attributes.asString());
        if (elements.isEmpty()) {
            sb.append("/>");
        } else {
            sb.append(">\n");
            sb.append(elements.asString(indent + "  "));
            sb.append(indent);
            sb.append("</pattern>");
        }
        return sb.toString();
    }

    @Override
    public String getReference() {
        return "pattern-" + id.toString();
    }
}
