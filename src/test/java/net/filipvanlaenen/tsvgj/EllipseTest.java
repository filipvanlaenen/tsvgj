package net.filipvanlaenen.tsvgj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Ellipse</code> class.
 */
public class EllipseTest {
    /**
     * The magic number for the color red.
     */
    private static final int RED = 0xFF0000;
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
     * Test verifying that an ellipse with a color specified as a hexadecimal integer is exported correctly to a string.
     */
    @Test
    void ellipseWithHexadecimalColorIsConvertedCorrectlyToString() {
        Ellipse ellipse = new Ellipse().cx(0).cy(1).rx(2).ry(THREE).fill(RED);
        String actual = ellipse.asString();
        String expected = "<ellipse cx=\"0\" cy=\"1\" fill=\"#FF0000\" rx=\"2\" ry=\"3\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that an ellipse with a color specified using a color keyword is exported correctly to a string.
     */
    @Test
    void ellipseWithKeywordColorIsConvertedCorrectlyToString() {
        Ellipse ellipse = new Ellipse().cx(0).cy(1).rx(2).ry(THREE).fill(ColorKeyword.BLUE);
        String actual = ellipse.asString();
        String expected = "<ellipse cx=\"0\" cy=\"1\" fill=\"blue\" rx=\"2\" ry=\"3\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a red ellipse with opacity 0.5 is exported correctly to a string.
     */
    @Test
    void redEllipseHalfOpaqueIsConvertedCorrectlyToString() {
        Ellipse ellipse = new Ellipse().cx(0).cy(1).rx(2).ry(THREE).fill(ColorKeyword.BLUE).opacity(HALF);
        String actual = ellipse.asString();
        String expected = "<ellipse cx=\"0\" cy=\"1\" fill=\"blue\" opacity=\"0.5\" rx=\"2\" ry=\"3\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a red ellipse with fill opacity 0.5 is exported correctly to a string.
     */
    @Test
    void redEllipseFillHalfOpaqueIsConvertedCorrectlyToString() {
        Ellipse ellipse = new Ellipse().cx(0).cy(1).rx(2).ry(THREE).fill(ColorKeyword.BLUE).fillOpacity(HALF);
        String actual = ellipse.asString();
        String expected = "<ellipse cx=\"0\" cy=\"1\" fill=\"blue\" fill-opacity=\"0.5\" rx=\"2\" ry=\"3\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a red ellipse with a stroke and stroke width but no fill is exported correctly to a string.
     */
    @Test
    void redOutlinedEllipseIsConvertedCorrectlyToString() {
        Ellipse ellipse = new Ellipse().cx(0).cy(1).rx(2).ry(THREE).fill(NoneValue.NONE).stroke(ColorKeyword.BLUE)
                .strokeWidth(HALF);
        String actual = ellipse.asString();
        String expected =
                "<ellipse cx=\"0\" cy=\"1\" fill=\"none\" rx=\"2\" ry=\"3\" stroke=\"blue\" stroke-width=\"0.5\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that an ellipse with a hexadecimal stroke color and a stroke width is exported correctly to a
     * string.
     */
    @Test
    void hexadecimalColorOutlinedEllipseIsConvertedCorrectlyToString() {
        Ellipse ellipse = new Ellipse().cx(0).cy(1).rx(2).ry(THREE).stroke(RED).strokeWidth(HALF);
        String actual = ellipse.asString();
        String expected = "<ellipse cx=\"0\" cy=\"1\" rx=\"2\" ry=\"3\" stroke=\"#FF0000\" stroke-width=\"0.5\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that an ellipse using a pattern as fill is exported correctly.
     */
    @Test
    void ellipseFilledWithPatternShouldBeConvertedCorrectlyToString() {
        PaintServerElement fillPattern = new Pattern();
        fillPattern.setId(1);
        Ellipse ellipse = new Ellipse().cx(0).cy(1).rx(2).ry(THREE).fill(fillPattern);
        String actual = ellipse.asString();
        String expected = "<ellipse cx=\"0\" cy=\"1\" fill=\"url(#pattern-1)\" rx=\"2\" ry=\"3\"/>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a transformation is exported correctly.
     */
    @Test
    void transformationIsExportedCorrectlyToString() {
        Ellipse ellipse =
                new Ellipse().cx(0).cy(1).rx(2).ry(THREE).fill(RED).transform(Transform.rotate(THREE, FOUR, FIVE));
        String actual = ellipse.asString();
        String expected = "<ellipse cx=\"0\" cy=\"1\" fill=\"#FF0000\" rx=\"2\" ry=\"3\" transform=\"rotate(3 4,5)\"/>";
        assertEquals(expected, actual);
    }
}
