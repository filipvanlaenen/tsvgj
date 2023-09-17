package net.filipvanlaenen.tsvgj.internal;

import net.filipvanlaenen.bltxmlepj.EmptyElement;
import net.filipvanlaenen.tsvgj.ColorKeyword;
import net.filipvanlaenen.tsvgj.PaintServerElement;

/**
 * Extension of the <code>EmptyElement</code> class with methods specific for SVG.
 *
 * @param <E> The subclass.
 */
public abstract class EmptySvgElement<E extends EmptySvgElement<E>> extends EmptyElement<E> {
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
}
