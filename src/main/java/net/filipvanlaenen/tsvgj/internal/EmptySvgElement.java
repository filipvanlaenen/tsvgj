package net.filipvanlaenen.tsvgj.internal;

import net.filipvanlaenen.bltxmlepj.EmptyElement;
import net.filipvanlaenen.tsvgj.ColorKeyword;
import net.filipvanlaenen.tsvgj.Marker;
import net.filipvanlaenen.tsvgj.Mask;
import net.filipvanlaenen.tsvgj.PaintServerElement;
import net.filipvanlaenen.tsvgj.SvgElement;

/**
 * Extension of the <code>EmptyElement</code> class with methods specific for SVG.
 *
 * @param <E> The subclass.
 */
public abstract class EmptySvgElement<E extends EmptySvgElement<E>> extends EmptyElement<E> implements SvgElement {
    /**
     * The ID.
     */
    private Integer id;

    /**
     * Adds a color attribute to the set of attributes.
     *
     * @param name  The name of the attribute.
     * @param color The color value of the attribute as a keyword.
     */
    protected void addColorAttribute(final String name, final ColorKeyword color) {
        addAttribute(name, new KeywordColorAttribute(color));
    }

    /**
     * Adds a color attribute to the set of attributes.
     *
     * @param name  The name of the attribute.
     * @param color The color value of the attribute as an integer.
     */
    protected void addColorAttribute(final String name, final Integer color) {
        addAttribute(name, new HexadecimalColorAttribute(color));
    }

    /**
     * Adds an attribute listing points to the set of attributes.
     *
     * @param name        The name of the attribute.
     * @param coordinates The list of coordinates for the points of the attribute .
     */
    protected void addPointsAttribute(final String name, final Number... coordinates) {
        addAttribute(name, new PointsAttribute(coordinates));
    }

    /**
     * Adds a reference to a marker element to the set of attributes.
     *
     * @param name   The name of the attribute.
     * @param marker The marker element to refer to.
     */
    protected void addReferringAttribute(final String name, final Marker marker) {
        addAttribute(name, new ReferringAttribute(marker));
    }

    /**
     * Adds a reference to a mask element to the set of attributes.
     *
     * @param name The name of the attribute.
     * @param mask The mask element to refer to.
     */
    protected void addReferringAttribute(final String name, final Mask mask) {
        addAttribute(name, new ReferringAttribute(mask));
    }

    /**
     * Adds a reference to a paint server element to the set of attributes.
     *
     * @param name               The name of the attribute.
     * @param paintServerElement The paint server element to refer to.
     */
    protected void addReferringAttribute(final String name, final PaintServerElement paintServerElement) {
        addAttribute(name, new ReferringAttribute(paintServerElement));
    }

    /**
     * Sets the class.
     *
     * @param clazz The class.
     * @return The instance called.
     */
    public E clazz(final String clazz) {
        addStringAttribute("class", clazz);
        return (E) this;
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
     * Sets the onmousemove event.
     *
     * @param onmousemove The onmousemove event.
     * @return The instance called.
     */
    public E onmousemove(final String onmousemove) {
        addStringAttribute("onmousemove", onmousemove);
        return (E) this;
    }

    /**
     * Sets the onmouseout event.
     *
     * @param onmouseout The onmouseout event.
     * @return The instance called.
     */
    public E onmouseout(final String onmouseout) {
        addStringAttribute("onmouseout", onmouseout);
        return (E) this;
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
