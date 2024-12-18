package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.tsvgj.internal.SvgElementWithMixedContent;

/**
 * A class representing portion of text.
 *
 * @see <a href="https://www.w3.org/TR/SVG/text.html#TextElement">Text — SVG 2: 11.2. The ‘text’ and ‘tspan’
 *      elements</a>
 */
public final class TSpan extends SvgElementWithMixedContent<TSpan> implements GraphicsElement, TextContentChildElement {
    /**
     * Default constructor.
     */
    public TSpan() {
        super();
    }

    /**
     * Constructs a tspan element with a string as its content.
     *
     * @param content A string.
     */
    public TSpan(final String content) {
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

    /**
     * Sets the value for the dominant baseline.
     *
     * @param dominantBaseline The dominant baseline for the text.
     * @return The instance called.
     */
    public TSpan dominantBaseline(final DominantBaselineValue dominantBaseline) {
        addEnumerationAttribute("dominant-baseline", dominantBaseline);
        return this;
    }

    @Override
    public String getElementName() {
        return "tspan";
    }

    /**
     * Sets the fill color as a hexadecimal integer.
     *
     * @param fill The fill color as a hexadecimal integer.
     * @return The instance called.
     */
    public TSpan fill(final Integer fill) {
        addColorAttribute("fill", fill);
        return this;
    }

    /**
     * Sets the fill color using a color keyword.
     *
     * @param fill The fill color using a color keyword.
     * @return The instance called.
     */
    public TSpan fill(final ColorKeyword fill) {
        addColorAttribute("fill", fill);
        return this;
    }

    /**
     * Sets the font family for the text.
     *
     * @param fontFamily The font family for the text.
     * @return The instance called.
     */
    public TSpan fontFamily(final String fontFamily) {
        addStringAttribute("font-family", fontFamily);
        return this;
    }

    /**
     * Sets the font size for the text.
     *
     * @param fontSize The font size for the text.
     * @return The instance called.
     */
    public TSpan fontSize(final Number fontSize) {
        addNumericAttribute("font-size", fontSize);
        return this;
    }

    /**
     * Sets the font style for the text.
     *
     * @param fontStyle The font style for the text.
     * @return The instance called.
     */
    public TSpan fontStyle(final FontStyleValue fontStyle) {
        addEnumerationAttribute("font-style", fontStyle);
        return this;
    }

    /**
     * Sets the font weight for the text.
     *
     * @param fontWeight The font weight for the text.
     * @return The instance called.
     */
    public TSpan fontWeight(final FontWeightValue fontWeight) {
        addEnumerationAttribute("font-weight", fontWeight);
        return this;
    }

    /**
     * Sets the value for the text align.
     *
     * @param textAlign The text align for the text.
     * @return The instance called.
     */
    public TSpan textAlign(final TextAlignValue textAlign) {
        addEnumerationAttribute("text-align", textAlign);
        return this;
    }

    /**
     * Sets the value for the text anchor.
     *
     * @param textAnchor The text anchor for the text.
     * @return The instance called.
     */
    public TSpan textAnchor(final TextAnchorValue textAnchor) {
        addEnumerationAttribute("text-anchor", textAnchor);
        return this;
    }

    /**
     * Adds a transformation to the text.
     *
     * @param transformation The specification of the transformation.
     * @return The instance called.
     */
    public TSpan transform(final Transform transformation) {
        addAttribute("transform", transformation);
        return this;
    }

    /**
     * Sets the x coordinate of the text.
     *
     * @param x The x coordinate of the text.
     * @return The instance called.
     */
    public TSpan x(final Number x) {
        addNumericAttribute("x", x);
        return this;
    }

    /**
     * Sets the y coordinate of the text.
     *
     * @param y The y coordinate of the text.
     * @return The instance called.
     */
    public TSpan y(final Number y) {
        addNumericAttribute("y", y);
        return this;
    }
}
