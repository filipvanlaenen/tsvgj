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
     * Test verifying that a line with a hexadecimal color is exported correctly to a string.
     */
    @Test
    void lineWithHexadecimalColorStrokeIsConvertedCorrectlyToString() {
        Line line = new Line().x1(0).y1(1).x2(2).y2(THREE).stroke(RED).strokeWidth(FOUR);
        String actual = line.asString();
        String expected = "<line stroke=\"#FF0000\" stroke-width=\"4\" x1=\"0\" x2=\"2\" y1=\"1\" y2=\"3\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a line with a keyword color is exported correctly to a string.
     */
    @Test
    void lineWithKeywordColorStrokeIsConvertedCorrectlyToString() {
        Line line = new Line().x1(0).y1(1).x2(2).y2(THREE).stroke(ColorKeyword.RED).strokeWidth(FOUR);
        String actual = line.asString();
        String expected = "<line stroke=\"red\" stroke-width=\"4\" x1=\"0\" x2=\"2\" y1=\"1\" y2=\"3\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a line with an end marker is exported correctly.
     */
    @Test
    void lineWithEndMarkerShouldBeConvertedCorrectlyToString() {
        Marker marker = new Marker();
        marker.setId(1);
        Line line = new Line().x1(0).y1(1).x2(2).y2(THREE).stroke(ColorKeyword.RED).strokeWidth(FOUR).markerEnd(marker);
        String actual = line.asString();
        String expected =
                "<line marker-end=\"url(#marker-1)\" stroke=\"red\" stroke-width=\"4\" x1=\"0\" x2=\"2\" y1=\"1\""
                        + " y2=\"3\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a line with an middle marker is exported correctly.
     */
    @Test
    void lineWithMiddleMarkerShouldBeConvertedCorrectlyToString() {
        Marker marker = new Marker();
        marker.setId(1);
        Line line = new Line().x1(0).y1(1).x2(2).y2(THREE).stroke(ColorKeyword.RED).strokeWidth(FOUR).markerMid(marker);
        String actual = line.asString();
        String expected =
                "<line marker-mid=\"url(#marker-1)\" stroke=\"red\" stroke-width=\"4\" x1=\"0\" x2=\"2\" y1=\"1\""
                        + " y2=\"3\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a line with an start marker is exported correctly.
     */
    @Test
    void lineWithStartMarkerShouldBeConvertedCorrectlyToString() {
        Marker marker = new Marker();
        marker.setId(1);
        Line line =
                new Line().x1(0).y1(1).x2(2).y2(THREE).stroke(ColorKeyword.RED).strokeWidth(FOUR).markerStart(marker);
        String actual = line.asString();
        String expected =
                "<line marker-start=\"url(#marker-1)\" stroke=\"red\" stroke-width=\"4\" x1=\"0\" x2=\"2\" y1=\"1\""
                        + " y2=\"3\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a line with a mask is exported correctly.
     */
    @Test
    void lineWithMaskShouldBeConvertedCorrectlyToString() {
        Mask mask = new Mask();
        mask.setId(1);
        Line line = new Line().x1(0).y1(1).x2(2).y2(THREE).stroke(ColorKeyword.RED).strokeWidth(FOUR).mask(mask);
        String actual = line.asString();
        String expected = "<line mask=\"url(#mask-1)\" stroke=\"red\" stroke-width=\"4\" x1=\"0\" x2=\"2\" y1=\"1\""
                + " y2=\"3\"/>";
        assertEquals(expected, actual);
    }
}
