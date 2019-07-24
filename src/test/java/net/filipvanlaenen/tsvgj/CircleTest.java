package net.filipvanlaenen.tsvgj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Circle</code> class.
 */
public class CircleTest {
    /**
     * The magic number for the color red.
     */
    private static final int RED = 0xFF0000;
    /**
     * The magic number 0.5.
     */
    private static final double HALF = 0.5D;

    /**
     * Test verifying that a red circle is exported correctly to a string.
     */
    @Test
    void redCircleIsConvertedCorrectlyToString() {
        Circle circle = new Circle().cx(0).cy(1).r(2).fill(RED);
        String actual = circle.asString();
        String expected = "<circle cx=\"0\" cy=\"1\" fill=\"#FF0000\" r=\"2\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a red circle with opacity 0.5 is exported correctly to a
     * string.
     */
    @Test
    void redCircleHalfOpaqueIsConvertedCorrectlyToString() {
        Circle circle = new Circle().cx(0).cy(1).r(2).fill(RED).opacity(HALF);
        String actual = circle.asString();
        String expected = "<circle cx=\"0\" cy=\"1\" fill=\"#FF0000\" opacity=\"0.5\" r=\"2\"/>";
        assertEquals(expected, actual);
    }
}
