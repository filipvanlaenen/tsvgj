package net.filipvanlaenen.tsvgj.internal;

import net.filipvanlaenen.bltxmlepj.ElementWithMixedContent;
import net.filipvanlaenen.tsvgj.ColorKeyword;
import net.filipvanlaenen.tsvgj.SvgElement;

/**
 * Extension of the <code>ElementWithMixedContent</code> class with methods specific for SVG.
 *
 * @param <E> The subclass.
 */
public abstract class SvgElementWithMixedContent<E extends SvgElementWithMixedContent<E>>
        extends ElementWithMixedContent<E> implements SvgElement {
    /**
     * The ID.
     */
    private Integer id;

    /**
     * Default constructor.
     */
    protected SvgElementWithMixedContent() {
        super();
    }

    /**
     * Constructor taking the content as its parameter.
     *
     * @param content The content.
     */
    protected SvgElementWithMixedContent(final String content) {
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

    @Override
    public void setId(final int id) {
        this.id = id;
        id(getReference());
    }
}
