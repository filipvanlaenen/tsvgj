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
     * The magic number for the color blue.
     */
    private static final int BLUE = 0x0000FF;
    /**
     * The magic number 0.5.
     */
    private static final double HALF = 0.5D;
    /**
     * The magic number three.
     */
    private static final int THREE = 3;
    /**
     * The magic number four.
     */
    private static final int FOUR = 4;
    /**
     * The magic number five.
     */
    private static final int FIVE = 5;
    /**
     * The magic number six.
     */
    private static final int SIX = 6;
    /**
     * The magic number seven.
     */
    private static final int SEVEN = 7;

    /**
     * Test verifying that a path describing a red line is exported correctly to a string.
     */
    @Test
    void redLineIsConvertedCorrectlyToString() {
        Path path = new Path().moveTo(0, 1).lineTo(THREE, FOUR).stroke(ColorKeyword.RED).strokeWidth(FOUR);
        String actual = path.asString();
        String expected = "<path d=\"M 0 1 L 3 4\" stroke=\"red\" stroke-width=\"4\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a path describing a red sector line is exported correctly to a string.
     */
    @Test
    void redSectorLineIsConvertedCorrectlyToString() {
        Path path =
                new Path().moveTo(0, 1)
                        .arcTo(THREE, FOUR, FIVE, Path.LargeArcFlagValues.LARGE_ARC,
                                Path.SweepFlagValues.POSITIVE_ANGLE, SIX, SEVEN)
                        .stroke(ColorKeyword.RED).strokeWidth(FOUR);
        String actual = path.asString();
        String expected = "<path d=\"M 0 1 A 3 4 5 1 1 6 7\" stroke=\"red\" stroke-width=\"4\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a path describing a red triangle is exported correctly to a string.
     */
    @Test
    void redTriangleIsConvertedCorrectlyToString() {
        Path path = new Path().moveTo(0, 1).lineTo(THREE, FOUR).lineTo(FIVE, SIX).closePath().fill(ColorKeyword.RED);
        String actual = path.asString();
        String expected = "<path d=\"M 0 1 L 3 4 L 5 6 Z\" fill=\"red\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a path describing a half opaque red triangle is exported correctly to a string.
     */
    @Test
    void halfOpaqueRedTriangleIsConvertedCorrectlyToString() {
        Path path = new Path().moveTo(0, 1).lineTo(THREE, FOUR).lineTo(FIVE, SIX).closePath().fill(ColorKeyword.RED)
                .opacity(HALF);
        String actual = path.asString();
        String expected = "<path d=\"M 0 1 L 3 4 L 5 6 Z\" fill=\"red\" opacity=\"0.5\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a path describing a red triangle with no fill is exported correctly to a string.
     */
    @Test
    void redOutlinedTriangleIsConvertedCorrectlyToString() {
        Path path = new Path().moveTo(0, 1).lineTo(THREE, FOUR).lineTo(FIVE, SIX).closePath().fill(NoneValue.NONE)
                .opacity(HALF);
        String actual = path.asString();
        String expected = "<path d=\"M 0 1 L 3 4 L 5 6 Z\" fill=\"none\" opacity=\"0.5\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a path using hexadecimal integers to specify the fill and stroke color is exported correctly
     * to a string.
     */
    @Test
    void pathWithFillAndStrokeSpecifiedAsHexadecimalIntegersIsConvertedCorrectlyToString() {
        Path path = new Path().moveTo(0, 1).lineTo(THREE, FOUR).lineTo(FIVE, SIX).closePath().fill(RED).stroke(BLUE);
        String actual = path.asString();
        String expected = "<path d=\"M 0 1 L 3 4 L 5 6 Z\" fill=\"#FF0000\" stroke=\"#0000FF\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a path with an end marker is exported correctly.
     */
    @Test
    void pathWithEndMarkerShouldBeConvertedCorrectlyToString() {
        Marker marker = new Marker();
        marker.setId(1);
        Path path = new Path().moveTo(0, 1).lineTo(THREE, FOUR).stroke(ColorKeyword.RED).strokeWidth(FOUR)
                .markerEnd(marker);
        String actual = path.asString();
        String expected = "<path d=\"M 0 1 L 3 4\" marker-end=\"url(#marker-1)\" stroke=\"red\" stroke-width=\"4\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a path with an middle marker is exported correctly.
     */
    @Test
    void pathWithMiddleMarkerShouldBeConvertedCorrectlyToString() {
        Marker marker = new Marker();
        marker.setId(1);
        Path path = new Path().moveTo(0, 1).lineTo(THREE, FOUR).stroke(ColorKeyword.RED).strokeWidth(FOUR)
                .markerMid(marker);
        String actual = path.asString();
        String expected = "<path d=\"M 0 1 L 3 4\" marker-mid=\"url(#marker-1)\" stroke=\"red\" stroke-width=\"4\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a path with an start marker is exported correctly.
     */
    @Test
    void pathWithStartMarkerShouldBeConvertedCorrectlyToString() {
        Marker marker = new Marker();
        marker.setId(1);
        Path path = new Path().moveTo(0, 1).lineTo(THREE, FOUR).stroke(ColorKeyword.RED).strokeWidth(FOUR)
                .markerStart(marker);
        String actual = path.asString();
        String expected = "<path d=\"M 0 1 L 3 4\" marker-start=\"url(#marker-1)\" stroke=\"red\" stroke-width=\"4\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a path with a mask is exported correctly.
     */
    @Test
    void pathWithMaskShouldBeConvertedCorrectlyToString() {
        Mask mask = new Mask();
        mask.setId(1);
        Path path = new Path().moveTo(0, 1).lineTo(THREE, FOUR).stroke(ColorKeyword.RED).strokeWidth(FOUR).mask(mask);
        String actual = path.asString();
        String expected = "<path d=\"M 0 1 L 3 4\" mask=\"url(#mask-1)\" stroke=\"red\" stroke-width=\"4\"/>";
        assertEquals(expected, actual);
    }
}
