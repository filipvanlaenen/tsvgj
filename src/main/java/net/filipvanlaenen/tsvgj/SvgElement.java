package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.bltxmlepj.Element;

/**
 * Top interface for all SVG element types.
 */
public interface SvgElement extends Element {
    /**
     * Returns the ID of the element.
     *
     * @return The ID of the element.
     */
    public Integer getId();

    /**
     * Returns a reference to the element.
     *
     * @return A reference to the element.
     */
    public default String getReference() {
        return getElementName() + "-" + getId().toString();
    }

    /**
     * Sets the ID.
     *
     * @param id The ID.
     */
    public void setId(final int id);
}
