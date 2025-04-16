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
     * Test verifying that a circle with a color specified as a hexadecimal integer is exported correctly to a string.
     */
    @Test
    void circleWithHexadecimalColorIsConvertedCorrectlyToString() {
        Circle circle = new Circle().cx(0).cy(1).r(2).fill(RED);
        String actual = circle.asString();
        String expected = "<circle cx=\"0\" cy=\"1\" fill=\"#FF0000\" r=\"2\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a circle with a color specified using a color keyword is exported correctly to a string.
     */
    @Test
    void circleWithKeywordColorIsConvertedCorrectlyToString() {
        Circle circle = new Circle().cx(0).cy(1).r(2).fill(ColorKeyword.BLUE);
        String actual = circle.asString();
        String expected = "<circle cx=\"0\" cy=\"1\" fill=\"blue\" r=\"2\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a red circle with opacity 0.5 is exported correctly to a string.
     */
    @Test
    void redCircleHalfOpaqueIsConvertedCorrectlyToString() {
        Circle circle = new Circle().cx(0).cy(1).r(2).fill(ColorKeyword.BLUE).opacity(HALF);
        String actual = circle.asString();
        String expected = "<circle cx=\"0\" cy=\"1\" fill=\"blue\" opacity=\"0.5\" r=\"2\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a red circle with fill opacity 0.5 is exported correctly to a string.
     */
    @Test
    void redCircleFillHalfOpaqueIsConvertedCorrectlyToString() {
        Circle circle = new Circle().cx(0).cy(1).r(2).fill(ColorKeyword.BLUE).fillOpacity(HALF);
        String actual = circle.asString();
        String expected = "<circle cx=\"0\" cy=\"1\" fill=\"blue\" fill-opacity=\"0.5\" r=\"2\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a red circle with a stroke and stroke width but no fill is exported correctly to a string.
     */
    @Test
    void redOutlinedCircleIsConvertedCorrectlyToString() {
        Circle circle = new Circle().cx(0).cy(1).r(2).fill(NoneValue.NONE).stroke(ColorKeyword.BLUE).strokeWidth(HALF);
        String actual = circle.asString();
        String expected = "<circle cx=\"0\" cy=\"1\" fill=\"none\" r=\"2\" stroke=\"blue\" stroke-width=\"0.5\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a circle with a hexadecimal stroke color and a stroke width is exported correctly to a
     * string.
     */
    @Test
    void hexadecimalColorOutlinedCircleIsConvertedCorrectlyToString() {
        Circle circle = new Circle().cx(0).cy(1).r(2).stroke(RED).strokeWidth(HALF);
        String actual = circle.asString();
        String expected = "<circle cx=\"0\" cy=\"1\" r=\"2\" stroke=\"#FF0000\" stroke-width=\"0.5\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a circle with an end marker is exported correctly.
     */
    @Test
    void circleWithEndMarkerShouldBeConvertedCorrectlyToString() {
        Marker marker = new Marker();
        marker.setId(1);
        Circle circle = new Circle().cx(0).cy(1).r(2).markerEnd(marker);
        String actual = circle.asString();
        String expected = "<circle cx=\"0\" cy=\"1\" marker-end=\"url(#marker-1)\" r=\"2\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a circle with an middle marker is exported correctly.
     */
    @Test
    void circleWithMiddleMarkerShouldBeConvertedCorrectlyToString() {
        Marker marker = new Marker();
        marker.setId(1);
        Circle circle = new Circle().cx(0).cy(1).r(2).markerMid(marker);
        String actual = circle.asString();
        String expected = "<circle cx=\"0\" cy=\"1\" marker-mid=\"url(#marker-1)\" r=\"2\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a circle with an start marker is exported correctly.
     */
    @Test
    void circleWithStartMarkerShouldBeConvertedCorrectlyToString() {
        Marker marker = new Marker();
        marker.setId(1);
        Circle circle = new Circle().cx(0).cy(1).r(2).markerStart(marker);
        String actual = circle.asString();
        String expected = "<circle cx=\"0\" cy=\"1\" marker-start=\"url(#marker-1)\" r=\"2\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a circle with a mask is exported correctly.
     */
    @Test
    void circleWithMaskShouldBeConvertedCorrectlyToString() {
        Mask mask = new Mask();
        mask.setId(1);
        Circle circle = new Circle().cx(0).cy(1).r(2).mask(mask);
        String actual = circle.asString();
        String expected = "<circle cx=\"0\" cy=\"1\" mask=\"url(#mask-1)\" r=\"2\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a circle using a pattern as fill is exported correctly.
     */
    @Test
    void circleFilledWithPatternShouldBeConvertedCorrectlyToString() {
        PaintServerElement fillPattern = new Pattern();
        fillPattern.setId(1);
        Circle circle = new Circle().cx(0).cy(1).r(2).fill(fillPattern);
        String actual = circle.asString();
        String expected = "<circle cx=\"0\" cy=\"1\" fill=\"url(#pattern-1)\" r=\"2\"/>";
        assertEquals(expected, actual);
    }
}
