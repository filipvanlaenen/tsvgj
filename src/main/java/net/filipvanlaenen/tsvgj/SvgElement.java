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
    Integer getId();

    /**
     * Returns a reference to the element.
     *
     * @return A reference to the element.
     */
    default String getReference() {
        return getElementName() + "-" + getId().toString();
    }

    /**
     * Sets the ID.
     *
     * @param id The ID.
     */
    void setId(int id);
}
