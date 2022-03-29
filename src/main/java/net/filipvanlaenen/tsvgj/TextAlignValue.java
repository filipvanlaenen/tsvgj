package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.bltxmlepj.AttributeValueEnumeration;

/**
 * An enumeration listing the values for the <code>text-align</code> attribute.
 *
 * @see <a href="https://www.w3.org/TR/css-text-3/#text-align-property">CSS Text
 *      Module Level 3: 6.1. Text Alignment: the text-align shorthand</a>
 */
public enum TextAlignValue implements AttributeValueEnumeration {
    /**
     * Align to the start.
     */
    START,
    /**
     * Align to the end.
     */
    END,
    /**
     * Align to the left.
     */
    LEFT,
    /**
     * Align to the right.
     */
    RIGHT,
    /**
     * Align to the center.
     */
    CENTER,
    /**
     * Justify.
     */
    JUSTIFY,
    /**
     * Align to match the parent element.
     */
    MATCH_PARENT,
    /**
     * Justify, including the last line.
     */
    JUSTIFY_ALL
}
