package net.filipvanlaenen.tsvgj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Line</code> class.
 */
public class LineTest {

    /**
     * Test verifying that a red line is exported correctly to a string.
     */
    @Test
    void redLineIsConvertedCorrectlyToString() {
        Line line = new Line().x1(0).y1(1).x2(2).y2(3).stroke(0xFF0000).strokeWidth(4);
        String actual = line.asString();
        String expected = "<line stroke=\"#FF0000\" stroke-width=\"4\" x1=\"0\" x2=\"2\" y1=\"1\" y2=\"3\"/>";
        assertEquals(expected, actual);
    }

}
