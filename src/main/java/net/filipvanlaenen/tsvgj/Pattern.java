package net.filipvanlaenen.tsvgj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.filipvanlaenen.tsvgj.internal.Attributes;

/**
 * A class representing a pattern.
 *
 * @see <a href= "https://www.w3.org/TR/SVG/pservers.html#PatternElement">Paint
 *      Servers: Solid Colors, Gradients, and Patterns — SVG 2: 14.3.
 *      Patterns</a>
 */
public class Pattern implements ElementType {
    /**
     * The attributes.
     */
    private final Attributes attributes = new Attributes();
    /**
     * A list with the elements.
     */
    private final List<ElementType> elements = new ArrayList<ElementType>();

    /**
     * Adds a shape element.
     *
     * @param shape A shape element.
     */
    public void addElement(final ShapeElement shape) {
        this.elements.add(shape);
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
     * Returns a string representation of the elements with the provided
     * indentation.
     *
     * @param indent The indentation.
     * @return A string representation of the elements with the provided
     *         indentation.
     */
    private String elementsAsString(final String indent) {
        List<String> elementStrings = new ArrayList<String>();
        Iterator<ElementType> elementIterator = elements.iterator();
        while (elementIterator.hasNext()) {
            ElementType element = elementIterator.next();
            elementStrings.add(element.asString(indent));
        }
        if (elementStrings.isEmpty()) {
            return "";
        } else {
            return String.join("\n", elementStrings) + "\n";
        }
    }

    /**
     * Returns a string representation of the pattern with the provided indentation.
     *
     * @param indent The indentation.
     * @return A string representation of the pattern with the provided indentation.
     */
    @Override
    public String asString(final String indent) {
        return indent + "<pattern" + attributes.asString()
                + (elements.isEmpty() ? "/>" : ">\n" + elementsAsString(indent + "  ") + indent + "</pattern>");
    }
}
