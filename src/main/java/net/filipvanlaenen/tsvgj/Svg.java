package net.filipvanlaenen.tsvgj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.filipvanlaenen.tsvgj.internal.Attributes;

/**
 * Class representing the root element of an SVG document.
 */
public class Svg implements StructuralElement {

    /**
     * The attributes.
     */
    private final Attributes attributes = new Attributes();
    /**
     * A list with the elements.
     */
    private final List<ElementType> elements = new ArrayList<ElementType>();
    private Defs defs;

    /**
     * Sets the height.
     *
     * @param height The height.
     * @return The instance called.
     */
    public Svg height(final Number height) {
        attributes.addNumericAttribute("height", height);
        return this;
    }

    /**
     * Sets the width.
     *
     * @param width The width.
     * @return The instance called.
     */
    public Svg width(final Number width) {
        attributes.addNumericAttribute("width", width);
        return this;
    }

    /**
     * Sets the view box attribute, a list of four numbers (minX, minY, width and
     * height).
     *
     * @param minX   The x coordinate of the top left corner.
     * @param minY   The y coordinate of the top left corner.
     * @param width  The width of the view box.
     * @param height The height of the view box.
     * @return The instance called.
     */
    public Svg viewBox(final Number minX, final Number minY, final Number width, final Number height) {
        attributes.addNumericArrayAttribute("viewBox", new Number[] { minX, minY, width, height });
        return this;
    }

    /**
     * Adds a shape element.
     *
     * @param shape A shape element.
     */
    public void addElement(final ShapeElement shape) {
        this.elements.add(shape);
    }

    /**
     * Adds a structural element.
     *
     * @param structuralElement A structural element.
     */
    public void addElement(final StructuralElement structuralElement) {
        this.elements.add(structuralElement);
    }

    /**
     * Adds a text element.
     *
     * @param text A text element.
     */
    public void addElement(final Text text) {
        this.elements.add(text);
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
     * Returns a string representation of the SVG document.
     *
     * @param indent The indentation.
     * @return A string representation of the SVG document.
     */
    public String asString(final String indent) {
        return indent + "<svg" + attributes.asString() + " xmlns=\"http://www.w3.org/2000/svg\""
                + (elements.isEmpty() ? "/>" : ">\n" + elementsAsString(indent + "  ") + indent + "</svg>");
    }

    public void registerElementForReference(PaintServerElement paintServerElement) {
        if (defs == null) {
            defs = new Defs();
            this.elements.add(defs);
        }
        defs.addElement(paintServerElement);
    }
}
