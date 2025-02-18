package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.tsvgj.internal.SvgElementWithContent;

/**
 * A class representing a script element.
 *
 * @see <a href="https://www.w3.org/TR/SVG/interact.html#ScriptElement">Document Structure — SVG 2: 15.10. The ‘script’
 *      element</a>
 */
public final class Script extends SvgElementWithContent<Script> {
    /**
     * Constructs a script element without content.
     */
    public Script() {
        super(null);
    }

    /**
     * Constructs a script element with a string as its content.
     *
     * @param content A string.
     */
    public Script(final String content) {
        super(content);
    }

    @Override
    public String getElementName() {
        return "script";
    }

    /**
     * Sets the hyperreference to an external resource containing script code.
     *
     * @param href The hyperreference to an external resource containing script code.
     * @return The instance called.
     */
    public Script href(final String href) {
        addStringAttribute("href", href);
        return this;
    }

    /**
     * Sets the type.
     *
     * @param javaScriptMimeTypeValue The JavaScript MIME type.
     * @return The instance called.
     */
    public Script type(final JavaScriptMimeTypeValue javaScriptMimeTypeValue) {
        addEnumerationAttribute("type", javaScriptMimeTypeValue);
        return this;
    }
}
