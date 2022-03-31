package net.filipvanlaenen.tsvgj.internal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import net.filipvanlaenen.tsvgj.ColorKeyword;

/**
 * Unit tests on the <code>KeywordColorAttribute</code> class.
 */
public class KeywordColorAttributeTest {
    /**
     * Test verifying that a keyword color is exported correctly to a string.
     */
    @Test
    void shouldConvertCorrectlyToString() {
        assertEquals("aliceblue", new KeywordColorAttribute(ColorKeyword.ALICEBLUE).asString());
    }
}
