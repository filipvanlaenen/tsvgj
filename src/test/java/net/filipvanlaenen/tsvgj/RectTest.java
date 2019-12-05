package net.filipvanlaenen.tsvgj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Rect</code> class.
 */
public class RectTest {
    /**
     * The magic number for the color red.
     */
    private static final int RED = 0xFF0000;
    /**
     * The magic number three.
     */
    private static final int THREE = 3;

    /**
     * Test verifying that a red rectangle is exported correctly to a string.
     */
    @Test
    void redRectangleIsConvertedCorrectlyToString() {
        Rect rect = new Rect().x(0).y(1).width(2).height(THREE).fill(ColorKeyword.RED);
        String actual = rect.asString();
        String expected = "<rect fill=\"red\" height=\"3\" width=\"2\" x=\"0\" y=\"1\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a rectangle using a hexadecimal integer for the fill
     * color is exported correctly to a string.
     */
    @Test
    void rectangleWithHexadecimalFillColorIsConvertedCorrectlyToString() {
        Rect rect = new Rect().x(0).y(1).width(2).height(THREE).fill(RED);
        String actual = rect.asString();
        String expected = "<rect fill=\"#FF0000\" height=\"3\" width=\"2\" x=\"0\" y=\"1\"/>";
        assertEquals(expected, actual);
    }
}
