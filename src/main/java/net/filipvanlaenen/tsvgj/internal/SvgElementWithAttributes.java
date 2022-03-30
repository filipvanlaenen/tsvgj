package net.filipvanlaenen.tsvgj.internal;

import net.filipvanlaenen.bltxmlepj.ElementWithAttributes;
import net.filipvanlaenen.tsvgj.ColorKeyword;
import net.filipvanlaenen.tsvgj.PaintServerElement;

/**
 * Extension of the <code>ElementWithAttributes</code> class with methods
 * specific for SVG.
 */
public abstract class SvgElementWithAttributes extends ElementWithAttributes {
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

    /**
     * Adds a reference to a paint server element to the set of attributes.
     *
     * @param name
     *            The name of the attribute.
     * @param paintServerElement
     *            The paint server element to refer to.
     */
    public void addReferringAttribute(final String name, final PaintServerElement paintServerElement) {
        addAttribute(name, new ReferringAttribute(paintServerElement));
    }
}
