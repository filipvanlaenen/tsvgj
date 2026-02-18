package net.filipvanlaenen.tsvgj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Polyline</code> class.
 */
public class PolylineTest {
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
     * The magic number eight.
     */
    private static final int EIGHT = 8;
    /**
     * The magic number nine.
     */
    private static final int NINE = 9;
    /**
     * The magic number ten.
     */
    private static final int TEN = 10;
    /**
     * The magic number eleven.
     */
    private static final int ELEVEN = 11;

    /**
     * Test verifying that a polyline with a hexadecimal color is exported correctly to a string.
     */
    @Test
    void polylineWithHexadecimalColorStrokeIsConvertedCorrectlyToString() {
        Polyline polyline = new Polyline().points(0, 1, 2, THREE, FOUR, FIVE).stroke(RED).strokeWidth(FOUR);
        String actual = polyline.asString();
        String expected = "<polyline points=\"0,1 2,3 4,5\" stroke=\"#FF0000\" stroke-width=\"4\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a polyline with a keyword color is exported correctly to a string.
     */
    @Test
    void polylineWithKeywordColorStrokeIsConvertedCorrectlyToString() {
        Polyline polyline = new Polyline().points(0, 1, 2, THREE, FOUR, FIVE).stroke(ColorKeyword.RED)
                .strokeDashArray(SIX, SEVEN, EIGHT).strokeDashOffset(NINE).strokeOpacity(TEN).strokeWidth(ELEVEN);
        String actual = polyline.asString();
        String expected = "<polyline points=\"0,1 2,3 4,5\" stroke=\"red\" stroke-dasharray=\"6 7 8\""
                + " stroke-dashoffset=\"9\" stroke-opacity=\"10\" stroke-width=\"11\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a polyline with an end marker is exported correctly.
     */
    @Test
    void polylineWithEndMarkerShouldBeConvertedCorrectlyToString() {
        Marker marker = new Marker();
        marker.setId(1);
        Polyline polyline =
                new Polyline().points(0, 1, 2, THREE, FOUR, FIVE).stroke(RED).strokeWidth(FOUR).markerEnd(marker);
        String actual = polyline.asString();
        String expected = "<polyline marker-end=\"url(#marker-1)\" points=\"0,1 2,3 4,5\" stroke=\"#FF0000\""
                + " stroke-width=\"4\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a polyline with a middle marker is exported correctly.
     */
    @Test
    void polylineWithMiddleMarkerShouldBeConvertedCorrectlyToString() {
        Marker marker = new Marker();
        marker.setId(1);
        Polyline polyline =
                new Polyline().points(0, 1, 2, THREE, FOUR, FIVE).stroke(RED).strokeWidth(FOUR).markerMid(marker);
        String actual = polyline.asString();
        String expected = "<polyline marker-mid=\"url(#marker-1)\" points=\"0,1 2,3 4,5\" stroke=\"#FF0000\""
                + " stroke-width=\"4\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a polyline with a start marker is exported correctly.
     */
    @Test
    void polylineWithStartMarkerShouldBeConvertedCorrectlyToString() {
        Marker marker = new Marker();
        marker.setId(1);
        Polyline polyline =
                new Polyline().points(0, 1, 2, THREE, FOUR, FIVE).stroke(RED).strokeWidth(FOUR).markerStart(marker);
        String actual = polyline.asString();
        String expected = "<polyline marker-start=\"url(#marker-1)\" points=\"0,1 2,3 4,5\" stroke=\"#FF0000\""
                + " stroke-width=\"4\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a polyline with a mask is exported correctly.
     */
    @Test
    void polylineWithMaskShouldBeConvertedCorrectlyToString() {
        Mask mask = new Mask();
        mask.setId(1);
        Polyline polyline = new Polyline().points(0, 1, 2, THREE, FOUR, FIVE).stroke(RED).strokeWidth(FOUR).mask(mask);
        String actual = polyline.asString();
        String expected =
                "<polyline mask=\"url(#mask-1)\" points=\"0,1 2,3 4,5\" stroke=\"#FF0000\" stroke-width=\"4\"/>";
        assertEquals(expected, actual);
    }
}
