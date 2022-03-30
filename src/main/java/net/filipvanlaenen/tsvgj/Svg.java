package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.tsvgj.internal.SvgElementWithAttributesAndElements;

/**
 * Class representing the root element of an SVG document.
 *
 * @see <a href="https://www.w3.org/TR/SVG/struct.html#SVGElement">Document
 *      Structure — SVG 2: 5.1.4. The ‘svg’ element</a>
 */
public final class Svg extends SvgElementWithAttributesAndElements implements StructuralElement {
    /**
     * The definitions element.
     */
    private Defs defs;

    /**
     * Default constructor.
     */
    public Svg() {
        addStringAttribute("xmlns", "http://www.w3.org/2000/svg");
    }

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
     * Adds a text element.
     *
     * @param text
     *            A text element.
     */
    public void addElement(final Text text) {
        super.addElement(text);
    }

    @Override
    public String getElementName() {
        return "svg";
    }

    /**
     * Sets the height.
     *
     * @param height
     *            The height.
     * @return The instance called.
     */
    public Svg height(final Number height) {
        addNumericAttribute("height", height);
        return this;
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
            addElement(defs);
        }
        defs.addElement(paintServerElement);
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
        addNumericArrayAttribute("viewBox", minX, minY, width, height);
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
        addNumericAttribute("width", width);
        return this;
    }
}
