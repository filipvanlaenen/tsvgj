package net.filipvanlaenen.tsvgj.internal;

import net.filipvanlaenen.bltxmlepj.ElementWithContent;
import net.filipvanlaenen.tsvgj.ColorKeyword;

/**
 * Extension of the <code>ElementWithContent</code> class with methods specific for SVG.
 *
 * @param <E> The subclass.
 */
public abstract class SvgElementWithContent<E extends SvgElementWithContent<E>> extends ElementWithContent<E> {

    /**
     * Constructor taking the content as its parameter.
     *
     * @param content The content.
     */
    protected SvgElementWithContent(final String content) {
        super(content);
    }

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
}
