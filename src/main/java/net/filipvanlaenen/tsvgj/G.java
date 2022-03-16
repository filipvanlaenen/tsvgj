package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.bltxmlepj.ElementWithElements;

/**
 * A class representing a grouping.
 *
 * @see <a href="https://www.w3.org/TR/SVG/struct.html#GElement">Document
 *      Structure — SVG 2: 5.2.2. The ‘g’ element</a>
 */
public final class G extends ElementWithElements implements StructuralElement {
    /**
     * Adds a shape element.
     *
     * @param shape
     *            A shape element.
     */
    public void addElement(final ShapeElement shape) {
        super.addElement(shape);
    }

    /**
     * Adds a structural element.
     *
     * @param structuralElement
     *            A structural element.
     */
    public void addElement(final StructuralElement structuralElement) {
        super.addElement(structuralElement);
    }

    /**
     * Adds a text.
     *
     * @param text
     *            A text.
     */
    public void addElement(final Text text) {
        super.addElement(text);
    }

    @Override
    public String getElementName() {
        return "g";
    }
}
