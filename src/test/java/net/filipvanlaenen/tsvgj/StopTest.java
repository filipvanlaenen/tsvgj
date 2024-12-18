package net.filipvanlaenen.tsvgj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Stop</code> class.
 */
public class StopTest {
    /**
     * The magic number for the color red.
     */
    private static final int RED = 0xFF0000;

    /**
     * Test verifying that a stop with a hexadecimal color is exported correctly to a string.
     */
    @Test
    void stopWithHexadecimalColorIsConvertedCorrectlyToString() {
        Stop stop = new Stop().offset(1).stopColor(RED);
        String actual = stop.asString();
        String expected = "<stop offset=\"1\" stop-color=\"#FF0000\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a stop with a keyword color is exported correctly to a string.
     */
    @Test
    void stopWithKeywordColorIsConvertedCorrectlyToString() {
        Stop stop = new Stop().offset(1).stopColor(ColorKeyword.RED);
        String actual = stop.asString();
        String expected = "<stop offset=\"1\" stop-color=\"red\"/>";
        assertEquals(expected, actual);
    }
}
