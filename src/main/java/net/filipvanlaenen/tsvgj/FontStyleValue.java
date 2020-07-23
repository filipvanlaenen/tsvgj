package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.tsvgj.internal.AttributeValueEnumeration;

/**
 * An enumeration listing the values for the <code>font-style</code> attribute.
 *
 * @see <a href="https://www.w3.org/TR/css-fonts-3/#font-style-prop">CSS Fonts
 *      Module Level 3: 3.4. Font style: the font-style property</a>
 */
public enum FontStyleValue implements AttributeValueEnumeration {
    /**
     * Normal text.
     */
    NORMAL,
    /**
     * Italic text.
     */
    ITALIC,
    /**
     * Oblique text.
     */
    OBLIQUE
}
