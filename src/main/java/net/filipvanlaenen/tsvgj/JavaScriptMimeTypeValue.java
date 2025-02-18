package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.bltxmlepj.AttributeValueEnumeration;

/**
 * An enumeration for all the JavaScript MIME types.
 */
public enum JavaScriptMimeTypeValue implements AttributeValueEnumeration {
    /**
     * The <code>application/ecmascript</code> type.
     */
    APPLICATION_ECMASCRIPT("application/ecmascript"),
    /**
     * The <code>application/javascript</code> type.
     */
    APPLICATION_JAVASCRIPT("application/javascript"),
    /**
     * The <code>application/x-ecmascript</code> type.
     */
    APPLICATION_X_ECMASCRIPT("application/x-ecmascript"),
    /**
     * The <code>application/x-javascript</code> type.
     */
    APPLICATION_X_JAVASCRIPT("application/x-javascript"),
    /**
     * The <code>text/ecmascript</code> type.
     */
    TEXT_ECMASCRIPT("text/ecmascript"),
    /**
     * The <code>text/javascript</code> type.
     */
    TEXT_JAVASCRIPT("text/javascript"),
    /**
     * The <code>text/javascript1.0</code> type.
     */
    TEXT_JAVASCRIPT_1_0("text/javascript1.0"),
    /**
     * The <code>text/javascript1.1</code> type.
     */
    TEXT_JAVASCRIPT_1_1("text/javascript1.1"),
    /**
     * The <code>text/javascript1.2</code> type.
     */
    TEXT_JAVASCRIPT_1_2("text/javascript1.2"),
    /**
     * The <code>text/javascript1.3</code> type.
     */
    TEXT_JAVASCRIPT_1_3("text/javascript1.3"),
    /**
     * The <code>text/javascript1.4</code> type.
     */
    TEXT_JAVASCRIPT_1_4("text/javascript1.4"),
    /**
     * The <code>text/javascript1.5</code> type.
     */
    TEXT_JAVASCRIPT_1_5("text/javascript1.5"),
    /**
     * The <code>text/livescript</code> type.
     */
    TEXT_LIVESCRIPT("text/livescript"),
    /**
     * The <code>text/jscript</code> type.
     */
    TEXT_JSCRIPT("text/jscript"),
    /**
     * The <code>text/x-ecmascript</code> type.
     */
    TEXT_X_ECMASCRIPT("text/x-ecmascript"),
    /**
     * The <code>text/x-javascript</code> type.
     */
    TEXT_X_JAVASCRIPT("text/x-javascript");

    /**
     * The value as it should be exported to a string.
     */
    private String stringValue;

    /**
     * Constructor taking the string value as its parameter.
     *
     * @param stringValue The string value.
     */
    JavaScriptMimeTypeValue(final String stringValue) {
        this.stringValue = stringValue;
    }

    @Override
    public String asString() {
        return stringValue;
    }
}
