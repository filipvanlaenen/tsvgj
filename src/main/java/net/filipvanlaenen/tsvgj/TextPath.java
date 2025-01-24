package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.tsvgj.internal.SvgElementWithMixedContent;

/**
 * A class representing text on a path.
 *
 * @see <a href="https://www.w3.org/TR/SVG/text.html#TextPathElement">Text — SVG 2: 11.8.1. The ‘textPath’ element</a>
 */
public class TextPath extends SvgElementWithMixedContent<Text> implements GraphicsElement, TextContentChildElement {
    /**
     * Default constructor.
     */
    public TextPath() {
        super();
    }

    /**
     * Constructs a textPath element with a string as its content.
     *
     * @param content A string.
     */
    public TextPath(final String content) {
        super(content);
    }

    @Override
    public String getElementName() {
        return "textPath";
    }
}
