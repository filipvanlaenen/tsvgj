package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.tsvgj.internal.SvgElementWithAttributesAndElements;

/**
 * A class representing a link.
 *
 * @see <a href="https://www.w3.org/TR/SVG/linking.html#AElement">Linking — SVG 2: 16.2. Links out of SVG content: the
 *      ‘a’ element</a>
 */
public class A extends SvgElementWithAttributesAndElements {
    @Override
    public String getElementName() {
        return "a";
    }

    /**
     * Adds an image element.
     *
     * @param image An image element.
     */
    public void addElement(final Image image) {
        super.addElement(image);
    }

    /**
     * Adds a shape element.
     *
     * @param shape A shape element.
     */
    public void addElement(final ShapeElement shape) {
        super.addElement(shape);
    }

    /**
     * Adds a structural element.
     *
     * @param structuralElement A structural element.
     */
    public void addElement(final StructuralElement structuralElement) {
        super.addElement(structuralElement);
    }

    /**
     * Adds a text element.
     *
     * @param text A text element.
     */
    public void addElement(final Text text) {
        super.addElement(text);
    }

    /**
     * Sets the hyperreference for the link.
     *
     * @param href The hyperreference for the link.
     * @return The instance called.
     */
    public A href(final String href) {
        addStringAttribute("href", href);
        return this;
    }
}
