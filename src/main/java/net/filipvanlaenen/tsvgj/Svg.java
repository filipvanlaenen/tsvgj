package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.tsvgj.internal.DeprecatedAttributes;
import net.filipvanlaenen.tsvgj.internal.DeprecatedElements;

/**
 * Class representing the root element of an SVG document.
 *
 * @see <a href="https://www.w3.org/TR/SVG/struct.html#SVGElement">Document
 *      Structure — SVG 2: 5.1.4. The ‘svg’ element</a>
 */
public class Svg implements StructuralElement {
    /**
     * The attributes.
     */
    private final DeprecatedAttributes attributes = new DeprecatedAttributes();
    /**
     * A list with the elements.
     */
    private final DeprecatedElements elements = new DeprecatedElements();
    /**
     * The definitions element.
     */
    private Defs defs;

    /**
     * Sets the height.
     *
     * @param height
     *            The height.
     * @return The instance called.
     */
    public Svg height(final Number height) {
        attributes.addNumericAttribute("height", height);
        return this;
    }

    /**
     * Sets the width.
     *
     * @param width
     *            The width.
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
     * @param minX
     *            The x coordinate of the top left corner.
     * @param minY
     *            The y coordinate of the top left corner.
     * @param width
     *            The width of the view box.
     * @param height
     *            The height of the view box.
     * @return The instance called.
     */
    public Svg viewBox(final Number minX, final Number minY, final Number width, final Number height) {
        attributes.addNumericArrayAttribute("viewBox", new Number[] {minX, minY, width, height});
        return this;
    }

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
     * Adds a text element.
     *
     * @param text
     *            A text element.
     */
    public void addElement(final Text text) {
        elements.add(text);
    }

    /**
     * Returns a string representation of the SVG document.
     *
     * @param indent
     *            The indentation.
     * @return A string representation of the SVG document.
     */
    public String asString(final String indent) {
        return indent + "<svg" + attributes.asString() + " xmlns=\"http://www.w3.org/2000/svg\""
                + (elements.isEmpty() ? "/>" : ">\n" + elements.asString(indent + "  ") + indent + "</svg>");
    }

    @Override
    public String getElementName() {
        return "svg";
    }

    /**
     * Registers a paint server element for reference.
     *
     * @param paintServerElement
     *            The paint server element to register.
     */
    public void registerElementForReference(final PaintServerElement paintServerElement) {
        if (defs == null) {
            defs = new Defs();
            elements.add(defs);
        }
        defs.addElement(paintServerElement);
    }
}
