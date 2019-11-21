package net.filipvanlaenen.tsvgj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Path</code> class.
 */
public class PathTest {
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
     * Test verifying that a path describing a red line is exported correctly to a
     * string.
     */
    @Test
    void redLineIsConvertedCorrectlyToString() {
        Path path = new Path().moveTo(0, 1).lineTo(THREE, FOUR).stroke(RED).strokeWidth(FOUR);
        String actual = path.asString();
        String expected = "<path d=\"M 0 1 L 3 4\" stroke=\"#FF0000\" stroke-width=\"4\"/>";
        assertEquals(expected, actual);
    }
}
