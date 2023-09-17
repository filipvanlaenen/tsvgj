package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.tsvgj.internal.EmptySvgElement;

/**
 * A class representing an image.
 *
 * @see <a href="https://www.w3.org/TR/SVG/embedded.html#ImageElement">Embedded Content — SVG 2: 12.3. The ‘image’
 *      element</a>
 */
public final class Image extends EmptySvgElement<Image> implements GraphicsElement {

    @Override
    public String getElementName() {
        return "image";
    }

    /**
     * Sets the height of the image.
     *
     * @param height The height of the image.
     * @return The instance called.
     */
    public Image height(final Number height) {
        addNumericAttribute("height", height);
        return this;
    }

    /**
     * Sets the hyperreference for the image.
     *
     * @param href The hyperreference for the image.
     * @return The instance called.
     */
    public Image href(final String href) {
        addStringAttribute("href", href);
        return this;
    }

    /**
     * Sets the width of the image.
     *
     * @param width The width of the image.
     * @return The instance called.
     */
    public Image width(final Number width) {
        addNumericAttribute("width", width);
        return this;
    }

    /**
     * Sets the x coordinate of the left edge of the image.
     *
     * @param x The x coordinate of left edge of the image.
     * @return The instance called.
     */
    public Image x(final Number x) {
        addNumericAttribute("x", x);
        return this;
    }

    /**
     * Sets the y coordinate of the top edge of the image.
     *
     * @param y The y coordinate of top edge of the image.
     * @return The instance called.
     */
    public Image y(final Number y) {
        addNumericAttribute("y", y);
        return this;
    }
}
