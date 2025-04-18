package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.tsvgj.internal.SvgElementWithElements;

/**
 * Class representing the root element of an SVG document.
 *
 * @see <a href="https://www.w3.org/TR/SVG/struct.html#SVGElement">Document Structure — SVG 2: 5.1.4. The ‘svg’
 *      element</a>
 */
public final class Svg extends SvgElementWithElements<Svg> implements StructuralElement {
    /**
     * The definitions element.
     */
    private Defs defs;

    /**
     * Default constructor. Assumes the SVG element is a stand-alone document.
     */
    public Svg() {
        this(true);
    }

    /**
     * Constructor with a parameter to indicate whether the SVG element is a stand-alone document or not.
     *
     * @param standalone True if the SVG element is a stand-alone document.
     */
    public Svg(final boolean standalone) {
        if (standalone) {
            addStringAttribute("xmlns", "http://www.w3.org/2000/svg");
        }
    }

    /**
     * Adds a link element.
     *
     * @param a An link element.
     */
    public void addElement(final A a) {
        super.addElement(a);
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
     * Adds a style element.
     *
     * @param style A style element.
     */
    public void addElement(final Style style) {
        super.addElement(style);
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
     * Ensures that there's a defs element defined.
     */
    private void ensureDefs() {
        if (defs == null) {
            defs = new Defs();
            addElement(defs);
        }
    }

    @Override
    public String getElementName() {
        return "svg";
    }

    /**
     * Sets the height.
     *
     * @param height The height.
     * @return The instance called.
     */
    public Svg height(final Number height) {
        addNumericAttribute("height", height);
        return this;
    }

    /**
     * Sets the preserveAspectRatio attribute.
     *
     * @param align       The align part of the preserveAspectRatio attribute.
     * @param meetOrSlice The meet or slice part of the preserveAspectRatio attribute.
     * @return The instance called.
     */
    public Svg preserveAspectRatio(final PreserveAspectRatioAlignValue align,
            final PreserveAspectRatioMeetOrSliceValue meetOrSlice) {
        addEnumerationArrayAttribute("preserveAspectRatio", align, meetOrSlice);
        return this;
    }

    /**
     * Registers a marker element for reference.
     *
     * @param marker The marker element to register.
     */
    public void registerElementForReference(final Marker marker) {
        ensureDefs();
        defs.addElement(marker);
    }

    /**
     * Registers a mask element for reference.
     *
     * @param mask The mask element to register.
     */
    public void registerElementForReference(final Mask mask) {
        ensureDefs();
        defs.addElement(mask);
    }

    /**
     * Registers a paint server element for reference.
     *
     * @param paintServerElement The paint server element to register.
     */
    public void registerElementForReference(final PaintServerElement paintServerElement) {
        ensureDefs();
        defs.addElement(paintServerElement);
    }

    /**
     * Sets the view box attribute, a list of four numbers (minX, minY, width and height).
     *
     * @param minX   The x coordinate of the top left corner.
     * @param minY   The y coordinate of the top left corner.
     * @param width  The width of the view box.
     * @param height The height of the view box.
     * @return The instance called.
     */
    public Svg viewBox(final Number minX, final Number minY, final Number width, final Number height) {
        addNumericArrayAttribute("viewBox", minX, minY, width, height);
        return this;
    }

    /**
     * Sets the width.
     *
     * @param width The width.
     * @return The instance called.
     */
    public Svg width(final Number width) {
        addNumericAttribute("width", width);
        return this;
    }
}
