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
     * The magic number 0.5.
     */
    private static final double HALF = 0.5D;

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
     * Test verifying that a rectangle using a hexadecimal integer for the fill color is exported correctly to a string.
     */
    @Test
    void rectangleWithHexadecimalFillColorIsConvertedCorrectlyToString() {
        Rect rect = new Rect().x(0).y(1).width(2).height(THREE).fill(RED);
        String actual = rect.asString();
        String expected = "<rect fill=\"#FF0000\" height=\"3\" width=\"2\" x=\"0\" y=\"1\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a rectangle with stroke none is exported correctly to a string.
     */
    @Test
    void rectangleWithStrokeNoneIsConvertedCorrectlyToString() {
        Rect rect = new Rect().x(0).y(1).width(2).height(THREE).fill(RED).stroke(NoneValue.NONE);
        String actual = rect.asString();
        String expected = "<rect fill=\"#FF0000\" height=\"3\" stroke=\"none\" width=\"2\" x=\"0\" y=\"1\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a rectangle using a hexadecimal integer for the stroke color is exported correctly to a
     * string.
     */
    @Test
    void rectangleWithHexadecimalStrokeColorIsConvertedCorrectlyToString() {
        Rect rect = new Rect().x(0).y(1).width(2).height(THREE).stroke(RED).strokeWidth(HALF);
        String actual = rect.asString();
        String expected = "<rect height=\"3\" stroke=\"#FF0000\" stroke-width=\"0.5\" width=\"2\" x=\"0\" y=\"1\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a rectangle using a pattern as fill is exported correctly.
     */
    @Test
    void rectangleFilledWithPatternShouldBeConvertedCorrectlyToString() {
        PaintServerElement fillPattern = new Pattern();
        fillPattern.setId(1);
        Rect rect = new Rect().x(0).y(1).width(2).height(THREE).fill(fillPattern);
        String actual = rect.asString();
        String expected = "<rect fill=\"url(#pattern-1)\" height=\"3\" width=\"2\" x=\"0\" y=\"1\"/>";
        assertEquals(expected, actual);
    }
}
