package net.filipvanlaenen.tsvgj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Polygon</code> class.
 */
public class PolygonTest {
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
     * The magic number 0.5.
     */
    private static final double HALF = 0.5D;

    /**
     * Test verifying that a red polygon is exported correctly to a string.
     */
    @Test
    void redPolygonIsConvertedCorrectlyToString() {
        Polygon polygon = new Polygon().points(0, 1, 2, THREE, FOUR, FIVE).fill(ColorKeyword.RED);
        String actual = polygon.asString();
        String expected = "<polygon fill=\"red\" points=\"0,1 2,3 4,5\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a polygon using a hexadecimal integer for the fill color is exported correctly to a string.
     */
    @Test
    void polygonWithHexadecimalFillColorIsConvertedCorrectlyToString() {
        Polygon polygon = new Polygon().points(0, 1, 2, THREE, FOUR, FIVE).fill(RED);
        String actual = polygon.asString();
        String expected = "<polygon fill=\"#FF0000\" points=\"0,1 2,3 4,5\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a polygon with stroke none is exported correctly to a string.
     */
    @Test
    void polygonWithStrokeNoneIsConvertedCorrectlyToString() {
        Polygon polygon = new Polygon().points(0, 1, 2, THREE, FOUR, FIVE).fill(RED).stroke(NoneValue.NONE);
        String actual = polygon.asString();
        String expected = "<polygon fill=\"#FF0000\" points=\"0,1 2,3 4,5\" stroke=\"none\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a polygon using a hexadecimal integer for the stroke color is exported correctly to a string.
     */
    @Test
    void polygonWithHexadecimalStrokeColorIsConvertedCorrectlyToString() {
        Polygon polygon = new Polygon().points(0, 1, 2, THREE, FOUR, FIVE).stroke(RED)
                .strokeDashArray(SIX, SEVEN, EIGHT).strokeDashOffset(NINE).strokeOpacity(TEN).strokeWidth(HALF);
        String actual = polygon.asString();
        String expected = "<polygon points=\"0,1 2,3 4,5\" stroke=\"#FF0000\" stroke-dasharray=\"6 7 8\""
                + " stroke-dashoffset=\"9\" stroke-opacity=\"10\" stroke-width=\"0.5\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a polygon with an end marker is exported correctly.
     */
    @Test
    void polygonWithEndMarkerShouldBeConvertedCorrectlyToString() {
        Marker marker = new Marker();
        marker.setId(1);
        Polygon polygon = new Polygon().points(0, 1, 2, THREE, FOUR, FIVE).markerEnd(marker);
        String actual = polygon.asString();
        String expected = "<polygon marker-end=\"url(#marker-1)\" points=\"0,1 2,3 4,5\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a polygon with a middle marker is exported correctly.
     */
    @Test
    void polygonWithMiddleMarkerShouldBeConvertedCorrectlyToString() {
        Marker marker = new Marker();
        marker.setId(1);
        Polygon polygon = new Polygon().points(0, 1, 2, THREE, FOUR, FIVE).markerMid(marker);
        String actual = polygon.asString();
        String expected = "<polygon marker-mid=\"url(#marker-1)\" points=\"0,1 2,3 4,5\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a polygon with a start marker is exported correctly.
     */
    @Test
    void polygonWithStartMarkerShouldBeConvertedCorrectlyToString() {
        Marker marker = new Marker();
        marker.setId(1);
        Polygon polygon = new Polygon().points(0, 1, 2, THREE, FOUR, FIVE).markerStart(marker);
        String actual = polygon.asString();
        String expected = "<polygon marker-start=\"url(#marker-1)\" points=\"0,1 2,3 4,5\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a polygon with a mask is exported correctly.
     */
    @Test
    void polygonWithMaskShouldBeConvertedCorrectlyToString() {
        Mask mask = new Mask();
        mask.setId(1);
        Polygon polygon = new Polygon().points(0, 1, 2, THREE, FOUR, FIVE).mask(mask);
        String actual = polygon.asString();
        String expected = "<polygon mask=\"url(#mask-1)\" points=\"0,1 2,3 4,5\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a polygon using a pattern as fill is exported correctly.
     */
    @Test
    void polygonFilledWithPatternShouldBeConvertedCorrectlyToString() {
        PaintServerElement fillPattern = new Pattern();
        fillPattern.setId(1);
        Polygon polygon = new Polygon().points(0, 1, 2, THREE, FOUR, FIVE).fill(fillPattern);
        String actual = polygon.asString();
        String expected = "<polygon fill=\"url(#pattern-1)\" points=\"0,1 2,3 4,5\"/>";
        assertEquals(expected, actual);
    }
}
