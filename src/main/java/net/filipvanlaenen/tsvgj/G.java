package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.tsvgj.internal.Elements;

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
    private final Elements elements = new Elements();

    /**
     * Adds a shape element.
     *
     * @param shape
     *            A shape element.
     */
    public void addElement(final ShapeElement shape) {
        elements.add(shape);
    }

    /**
     * Adds a structural element.
     *
     * @param structuralElement
     *            A structural element.
     */
    public void addElement(final StructuralElement structuralElement) {
        elements.add(structuralElement);
    }

    /**
     * Adds a text.
     *
     * @param text
     *            A text.
     */
    public void addElement(final Text text) {
        elements.add(text);
    }

    /**
     * Returns a string representation of the grouping element with the provided
     * indentation.
     *
     * @param indent
     *            The indentation.
     * @return A string representation of the grouping element with the provided
     *         indentation.
     */
    public String asString(final String indent) {
        return indent + "<g" + (elements.isEmpty() ? "/>" : ">\n" + elements.asString(indent + "  ") + indent + "</g>");
    }

    @Override
    public String getElementName() {
        return "g";
    }
}
