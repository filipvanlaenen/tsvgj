package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.tsvgj.internal.SvgElementWithContent;

/**
 * A class representing an inline style sheet.
 *
 * @see <a href="https://www.w3.org/TR/SVG/styling.html#StyleElement">Document Structure — SVG 2: 6.2. Inline style
 *      sheets: the ‘style’ element</a>
 */
public class Style extends SvgElementWithContent<Style> {
    /**
     * Constructs a style element with a string as its content.
     *
     * @param content A string.
     */
    public Style(final String content) {
        super(content);
    }

    @Override
    public String getElementName() {
        return "style";
    }
}
