package net.filipvanlaenen.tsvgj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Line</code> class.
 */
public class LineTest {
    /**
     * The magic number for the color red.
     */
    private static final int RED = 0xFF0000;
    /**
     * The magic number three.
     */
    private static final int THREE = 3;
    /**
     * The magic number four.
     */
    private static final int FOUR = 4;

    /**
     * Test verifying that a red line is exported correctly to a string.
     */
    @Test
    void redLineIsConvertedCorrectlyToString() {
        Line line = new Line().x1(0).y1(1).x2(2).y2(THREE).stroke(RED).strokeWidth(FOUR);
        String actual = line.asString();
        String expected = "<line stroke=\"#FF0000\" stroke-width=\"4\" x1=\"0\" x2=\"2\" y1=\"1\" y2=\"3\"/>";
        assertEquals(expected, actual);
    }

}
