package net.filipvanlaenen.tsvgj.internal;

import net.filipvanlaenen.bltxmlepj.AttributeValueEnumeration;
import net.filipvanlaenen.bltxmlepj.ElementWithElements;
import net.filipvanlaenen.tsvgj.SvgElement;

/**
 * Extension of the <code>ElementWithElements</code> class with methods specific for SVG.
 *
 * @param <E> The subclass.
 */
public abstract class SvgElementWithElements<E extends SvgElementWithElements<E>> extends ElementWithElements<E>
        implements SvgElement {
    /**
     * The ID.
     */
    private Integer id;

    /**
     * Adds an enumeration array attribute to the set of attributes.
     *
     * @param name            The name of the attribute.
     * @param enumationValues The enumeration array value of the attribute.
     */
    protected void addEnumerationArrayAttribute(final String name, final AttributeValueEnumeration... enumationValues) {
        addAttribute(name, new EnumerationArrayAttribute(enumationValues));
    }

    /**
     * Adds a numeric array attribute to the set of attributes.
     *
     * @param name    The name of the attribute.
     * @param numbers The numeric array value of the attribute.
     */
    protected void addNumericArrayAttribute(final String name, final Number... numbers) {
        addAttribute(name, new NumericArrayAttribute(numbers));
    }

    /**
     * Returns the ID of the element.
     *
     * @return The ID of the element.
     */
    @Override
    public Integer getId() {
        return id;
    }

    /**
     * Sets the ID.
     *
     * @param id The ID.
     */
    public void setId(final int id) {
        this.id = id;
        id(getReference());
    }
}
