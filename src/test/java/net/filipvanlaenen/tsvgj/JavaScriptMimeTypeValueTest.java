package net.filipvanlaenen.tsvgj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>JavaScriptMimeTypeValue</code> class.
 */
public class JavaScriptMimeTypeValueTest {
    /**
     * Test verifying that the value for a JavaScript MIME type is exported correctly.
     */
    @Test
    public void shouldExportValueOfApplicationJavaScriptCorrectly() {
        assertEquals("application/javascript", JavaScriptMimeTypeValue.APPLICATION_JAVASCRIPT.asString());
    }
}
