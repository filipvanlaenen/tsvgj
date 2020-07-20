package net.filipvanlaenen.tsvgj;

import java.util.ArrayList;
import java.util.List;

/**
 * A class representing a grouping.
 *
 * @see <a href="https://www.w3.org/TR/SVG/struct.html#GElement">Document
 *      Structure — SVG 2: 5.2.2. The ‘g’ element</a>
 */
public class G implements StructuralElement {

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
     * Adds a structural element.
     *
     * @param structuralElement A structural element.
     */
    public void addElement(final StructuralElement structuralElement) {
        this.elements.add(structuralElement);
    }

    /**
     * Adds a text.
     *
     * @param text A text.
     */
    public void addElement(final Text text) {
        this.elements.add(text);
    }

    /**
     * Returns a string representation of the grouping element with the provided
     * indentation.
     *
     * @param indent The indentation.
     * @return A string representation of the grouping element with the provided
     *         indentation.
     */
    public String asString(final String indent) {
        return indent + "<g" + (elements.isEmpty() ? "/>"
                : ">\n" + elementsAsString(indent + "  ", elements.iterator()) + indent + "</g>");
    }
}
