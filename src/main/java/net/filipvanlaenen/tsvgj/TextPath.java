package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.tsvgj.internal.ReferringAttribute;
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

    /**
     * Adds a text content child element.
     *
     * @param textContentChildElement A text content child element.
     */
    public void addElement(final TextContentChildElement textContentChildElement) {
        super.addElement(textContentChildElement);
    }

    @Override
    public String getElementName() {
        return "textPath";
    }

    /**
     * Sets the path.
     *
     * @param path The path.
     * @return The instance called.
     */
    public TextPath href(final Path path) {
        addAttribute("href", new ReferringAttribute(path));
        return this;
    }

    /**
     * Sets a shape element as the path.
     *
     * @param shapeElement The shape element to be used as a path.
     * @return The instance called.
     */
    public TextPath href(final ShapeElement shapeElement) {
        addAttribute("href", new ReferringAttribute(shapeElement));
        return this;
    }
}
