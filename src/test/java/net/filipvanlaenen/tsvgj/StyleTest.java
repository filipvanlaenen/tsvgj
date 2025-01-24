package net.filipvanlaenen.tsvgj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Style</code> class.
 */
public class StyleTest {
    /**
     * Test verifying that a simple style with text is exported correctly.
     */
    @Test
    void simpleStyleWithTextIsConvertedCorrectlyToString() {
        Style style = new Style(".foo { text-align: center}");
        assertEquals("<style>.foo { text-align: center}</style>", style.asString());
    }
}
