package net.filipvanlaenen.tsvgj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>RadialGradient</code> class.
 */
public class RadialGradientTest {
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
     * Test verifying that a radial gradient with a stop is exported correctly.
     */
    @Test
    void radialGradientWithStopExportedCorrectly() {
        RadialGradient radialGradient = new RadialGradient().cx(1).cy(2).r(THREE);
        radialGradient.addElement(new Stop().offset(FOUR).stopColor(ColorKeyword.RED));
        StringBuilder sb = new StringBuilder();
        sb.append("<radialGradient cx=\"1\" cy=\"2\" r=\"3\">\n");
        sb.append("  <stop offset=\"4\" stop-color=\"red\"/>\n");
        sb.append("</radialGradient>");
        String expected = sb.toString();
        assertEquals(expected, radialGradient.asString());
    }

    /**
     * Test verifying that a radial gradient with a transform is exported correctly.
     */
    @Test
    void radialGradientWithTransformIsExportedCorrectly() {
        RadialGradient radialGradient = new RadialGradient().cx(1).cy(2).r(THREE);
        String actual = radialGradient.gradientTransform(Transform.rotate(FOUR, FIVE, SIX)).asString();
        StringBuilder sb = new StringBuilder();
        sb.append("<radialGradient cx=\"1\" cy=\"2\" gradientTransform=\"rotate(4 5,6)\" r=\"3\"/>");
        String expected = sb.toString();
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a radial gradient with units is exported correctly.
     */
    @Test
    void radialGradientWithUnitsIsExportedCorrectly() {
        RadialGradient radialGradient = new RadialGradient().cx(1).cy(2).r(THREE);
        String actual = radialGradient.gradientUnits(CoordinateSystemUnitsValue.USER_SPACE_ON_USE).asString();
        StringBuilder sb = new StringBuilder();
        sb.append("<radialGradient cx=\"1\" cy=\"2\" gradientUnits=\"userSpaceOnUse\" r=\"3\"/>");
        String expected = sb.toString();
        assertEquals(expected, actual);
    }
}
