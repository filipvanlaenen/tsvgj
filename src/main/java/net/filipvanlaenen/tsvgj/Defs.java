package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.bltxmlepj.ElementWithElements;

/**
 * A class representing definitions.
 *
 * @see <a href="https://www.w3.org/TR/SVG/struct.html#DefsElement">Document
 *      Structure — SVG 2: 5.4.2. The ‘defs’ element</a>
 */
public final class Defs extends ElementWithElements implements StructuralElement {
    /**
     * Counter to assign IDs to paint server elements.
     */
    private int paintServerElementIdCounter = 0;

    /**
     * Adds a paint server element.
     *
     * @param paintServerElement
     *            A paint server element.
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
