package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.tsvgj.internal.SvgElementWithElements;

/**
 * A class representing a mask.
 *
 * @see <a href="https://www.w3.org/TR/SVG/linking.html#AElement">CSS Masking Module Level 1 — 9.1. The mask element</a>
 */
public final class Mask extends SvgElementWithElements<Mask> {
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

    @Override
    public String getElementName() {
        return "mask";
    }

    /**
     * Sets the height of the largest possible offscreen buffer.
     *
     * @param height The height of the largest possible offscreen buffer.
     * @return The instance called.
     */
    public Mask height(final Number height) {
        addNumericAttribute("height", height);
        return this;
    }

    /**
     * Sets the value for the mask content units.
     *
     * @param maskContentUnits The units for the mask content.
     * @return The instance called.
     */
    public Mask maskContentUnits(final CoordinateSystemUnitsValue maskContentUnits) {
        addEnumerationAttribute("maskContentUnits", maskContentUnits);
        return this;
    }

    /**
     * Sets the value for the mask units.
     *
     * @param maskUnits The units for the mask.
     * @return The instance called.
     */
    public Mask maskUnits(final CoordinateSystemUnitsValue maskUnits) {
        addEnumerationAttribute("maskUnits", maskUnits);
        return this;
    }

    /**
     * Sets the width of the largest possible offscreen buffer.
     *
     * @param width The width of the largest possible offscreen buffer.
     * @return The instance called.
     */
    public Mask width(final Number width) {
        addNumericAttribute("width", width);
        return this;
    }

    /**
     * Sets the x coordinate of one corner of the rectangle for the largest possible offscreen buffer.
     *
     * @param x The x coordinate of one corner of the rectangle for the largest possible offscreen buffer.
     * @return The instance called.
     */
    public Mask x(final Number x) {
        addNumericAttribute("x", x);
        return this;
    }

    /**
     * Sets the y coordinate of one corner of the rectangle for the largest possible offscreen buffer.
     *
     * @param y The y coordinate of of one corner of the rectangle for the largest possible offscreen buffer.
     * @return The instance called.
     */
    public Mask y(final Number y) {
        addNumericAttribute("y", y);
        return this;
    }
}
