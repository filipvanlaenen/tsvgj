package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.tsvgj.internal.Attributes;

/**
 * A class representing text.
 *
 * @see <a href="https://www.w3.org/TR/SVG/text.html#TextElement">Text — SVG 2:
 *      11.2. The ‘text’ and ‘tspan’ elements</a>
 */
public class Text implements GraphicsElement {
    /**
     * The attributes.
     */
    private final Attributes attributes = new Attributes();

    /**
     * The content.
     */
    private final String content;

    /**
     * Constructs a text element with a string as its content.
     *
     * @param content
     *            A string.
     */
    public Text(final String content) {
        this.content = content;
    }

    /**
     * Sets the fill color as a hexadecimal integer.
     *
     * @param fill
     *            The fill color as a hexadecimal integer.
     * @return The instance called.
     */
    public Text fill(final Integer fill) {
        attributes.addColorAttribute("fill", fill);
        return this;
    }

    /**
     * Sets the fill color using a color keyword.
     *
     * @param fill
     *            The fill color using a color keyword.
     * @return The instance called.
     */
    public Text fill(final ColorKeyword fill) {
        attributes.addColorAttribute("fill", fill);
        return this;
    }

    /**
     * Sets the font family for the text.
     *
     * @param fontFamily
     *            The font family for the text.
     * @return The instance called.
     */
    public Text fontFamily(final String fontFamily) {
        attributes.addStringAttribute("font-family", fontFamily);
        return this;
    }

    /**
     * Sets the font size for the text.
     *
     * @param fontSize
     *            The font size for the text.
     * @return The instance called.
     */
    public Text fontSize(final Number fontSize) {
        attributes.addNumericAttribute("font-size", fontSize);
        return this;
    }

    /**
     * Sets the font weight for the text.
     *
     * @param fontWeight
     *            The font weight for the text.
     * @return The instance called.
     */
    public Text fontWeight(final FontWeightValue fontWeight) {
        attributes.addEnumerationAttribute("font-weight", fontWeight);
        return this;
    }

    /**
     * Sets the value for the text anchor.
     *
     * @param textAnchor
     *            The text anchor for the text.
     * @return The instance called.
     */
    public Text textAnchor(final TextAnchorValue textAnchor) {
        attributes.addEnumerationAttribute("text-anchor", textAnchor);
        return this;
    }

    /**
     * Adds a transformation to the text.
     *
     * @param transformation
     *            The specification of the transformation.
     * @return The instance called.
     */
    public Text transform(final Transform transformation) {
        attributes.addTransformationAttribute("transform", transformation);
        return this;
    }

    /**
     * Sets the x coordinate of the text.
     *
     * @param x
     *            The x coordinate of the text.
     * @return The instance called.
     */
    public Text x(final Number x) {
        attributes.addNumericAttribute("x", x);
        return this;
    }

    /**
     * Sets the y coordinate of the text.
     *
     * @param y
     *            The y coordinate of the text.
     * @return The instance called.
     */
    public Text y(final Number y) {
        attributes.addNumericAttribute("y", y);
        return this;
    }

    /**
     * Returns a string representation of the text with the provided indentation.
     *
     * @param indent
     *            The indentation.
     * @return A string representation of the text with the provided indentation.
     */
    @Override
    public String asString(final String indent) {
        return indent + "<text" + attributes.asString() + ">" + xmlEscape(content) + "</text>";
    }

    /**
     * Escape special XML characters in a string. The special XML characters that
     * will be escaped are <code>&lt;</code>, <code>&gt;</code> and
     * <code>&amp;</code>.
     *
     * @param string
     *            The original text.
     * @return The text with special XML characters escaped.
     */
    private String xmlEscape(final String string) {
        return string.replaceAll("&", "&amp;").replaceAll("<", "&lt;").replaceAll(">", "&gt;");
    }

}
