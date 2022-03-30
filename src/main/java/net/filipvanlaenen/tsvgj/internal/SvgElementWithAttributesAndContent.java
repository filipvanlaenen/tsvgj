package net.filipvanlaenen.tsvgj.internal;

import net.filipvanlaenen.bltxmlepj.ElementWithAttributesAndContent;
import net.filipvanlaenen.tsvgj.ColorKeyword;

/**
 * Extension of the <code>ElementWithAttributesAndContent</code> class with
 * methods specific for SVG.
 */
public abstract class SvgElementWithAttributesAndContent extends ElementWithAttributesAndContent {
    /**
     * Constructor taking the content as its parameter.
     *
     * @param content
     *            The content.
     */
    protected SvgElementWithAttributesAndContent(final String content) {
        super(content);
    }

    /**
     * Adds a color attribute to the set of attributes.
     *
     * @param name
     *            The name of the attribute.
     * @param color
     *            The color value of the attribute as a keyword.
     */
    protected void addColorAttribute(final String name, final ColorKeyword color) {
        addAttribute(name, new KeywordColorAttribute(color));
    }

    /**
     * Adds a color attribute to the set of attributes.
     *
     * @param name
     *            The name of the attribute.
     * @param color
     *            The color value of the attribute as an integer.
     */
    protected void addColorAttribute(final String name, final Integer color) {
        addAttribute(name, new HexadecimalColorAttribute(color));
    }
}
