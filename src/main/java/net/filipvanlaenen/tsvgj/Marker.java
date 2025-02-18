package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.tsvgj.internal.SvgElementWithElements;

/**
 * Class representing a marker element.
 *
 * @see <a href="https://www.w3.org/TR/SVG/painting.html#MarkerElement">Document Structure — SVG 2: 13.7.1. The ‘marker’
 *      element</a>
 */
public final class Marker extends SvgElementWithElements<Marker> {
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
        return "marker";
    }

    /**
     * Sets the height of the marker.
     *
     * @param markerHeight The height of the marker.
     * @return The instance called.
     */
    public Marker markerHeight(final Number markerHeight) {
        addNumericAttribute("markerHeight", markerHeight);
        return this;
    }

    /**
     * Sets the value for the marker units.
     *
     * @param markerUnits The marker units.
     * @return The instance called.
     */
    public Marker markerUnits(final MarkerUnitsValue markerUnits) {
        addEnumerationAttribute("markerUnits", markerUnits);
        return this;
    }

    /**
     * Sets the width of the marker.
     *
     * @param markerWidth The width of the marker.
     * @return The instance called.
     */
    public Marker markerWidth(final Number markerWidth) {
        addNumericAttribute("markerWidth", markerWidth);
        return this;
    }

    /**
     * Sets the preserveAspectRatio attribute.
     *
     * @param align       The align part of the preserveAspectRatio attribute.
     * @param meetOrSlice The meet or slice part of the preserveAspectRatio attribute.
     * @return The instance called.
     */
    public Marker preserveAspectRatio(final PreserveAspectRatioAlignValue align,
            final PreserveAspectRatioMeetOrSliceValue meetOrSlice) {
        addEnumerationArrayAttribute("preserveAspectRatio", align, meetOrSlice);
        return this;
    }

    /**
     * Sets the x coordinate of the reference point of the marker.
     *
     * @param refX The x coordinate of the reference point of the marker.
     * @return The instance called.
     */
    public Marker refX(final Number refX) {
        addNumericAttribute("refX", refX);
        return this;
    }

    /**
     * Sets the y coordinate of the reference point of the marker.
     *
     * @param refY The y coordinate of the reference point of the marker.
     * @return The instance called.
     */
    public Marker refY(final Number refY) {
        addNumericAttribute("refY", refY);
        return this;
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
    public Marker viewBox(final Number minX, final Number minY, final Number width, final Number height) {
        addNumericArrayAttribute("viewBox", minX, minY, width, height);
        return this;
    }
}
