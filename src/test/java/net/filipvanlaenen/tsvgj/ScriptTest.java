package net.filipvanlaenen.tsvgj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Script</code> class.
 */
public class ScriptTest {
    /**
     * Test verifying that a script element with text is exported correctly.
     */
    @Test
    void scriptWithTextIsConvertedCorrectlyToString() {
        Script script = new Script("function foo(evt) {}").type(JavaScriptMimeTypeValue.APPLICATION_JAVASCRIPT);
        assertEquals("<script type=\"application/javascript\">function foo(evt) {}</script>", script.asString());
    }

    /**
     * Test verifying that a script element with text is exported correctly.
     */
    @Test
    void scriptWithHrefIsConvertedCorrectlyToString() {
        Script script = new Script().href("_js/foo.js").type(JavaScriptMimeTypeValue.APPLICATION_JAVASCRIPT);
        assertEquals("<script href=\"_js/foo.js\" type=\"application/javascript\"/>", script.asString());
    }
}
