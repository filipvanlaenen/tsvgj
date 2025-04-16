package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.tsvgj.internal.SvgElementWithElements;

/**
 * A class representing definitions.
 *
 * @see <a href="https://www.w3.org/TR/SVG/struct.html#DefsElement">Document Structure — SVG 2: 5.4.2. The ‘defs’
 *      element</a>
 */
public final class Defs extends SvgElementWithElements<Defs> implements StructuralElement {
    /**
     * Counter to assign IDs to marker elements.
     */
    private int markerIdCounter = 0;
    /**
     * Counter to assign IDs to mask elements.
     */
    private int maskIdCounter = 0;
    /**
     * Counter to assign IDs to paint server elements.
     */
    private int paintServerElementIdCounter = 0;

    /**
     * Adds a marker element.
     *
     * @param marker A marker element.
     */
    public void addElement(final Marker marker) {
        super.addElement(marker);
        marker.setId(++markerIdCounter);
    }

    /**
     * Adds a mask element.
     *
     * @param mask A mask element.
     */
    public void addElement(final Mask mask) {
        super.addElement(mask);
        mask.setId(++maskIdCounter);
    }

    /**
     * Adds a paint server element.
     *
     * @param paintServerElement A paint server element.
     */
    public void addElement(final PaintServerElement paintServerElement) {
        super.addElement(paintServerElement);
        paintServerElement.setId(++paintServerElementIdCounter);
    }

    @Override
    public String getElementName() {
        return "defs";
    }
}
