package net.filipvanlaenen.tsvgj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>LinearGradient</code> class.
 */
public class LinearGradientTest {
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
     * Test verifying that the setter for ID is wired correctly to the getter for the reference.
     */
    @Test
    void setIdShouldBeWiredCorrectlyToGetReference() {
        LinearGradient linearGradient = new LinearGradient();
        linearGradient.setId(1);
        assertEquals("linear-gradient-1", linearGradient.getReference());
    }

    /**
     * Test verifying that when an ID is set, it is also exported as an attribute.
     */
    @Test
    void setIdShouldSetIdAttribute() {
        LinearGradient linearGradient = new LinearGradient().x1(1).x2(2).y1(THREE).y2(FOUR);
        linearGradient.setId(1);
        assertEquals("<linearGradient id=\"linear-gradient-1\" x1=\"1\" x2=\"2\" y1=\"3\" y2=\"4\"/>",
                linearGradient.asString());
    }

    /**
     * Test verifying that a linear gradient with a stop is exported correctly.
     */
    @Test
    void linearGradientWithStopExportedCorrectly() {
        LinearGradient linearGradient = new LinearGradient().x1(1).x2(2).y1(THREE).y2(FOUR);
        linearGradient.addElement(new Stop().offset(FIVE).stopColor(ColorKeyword.RED));
        StringBuilder sb = new StringBuilder();
        sb.append("<linearGradient x1=\"1\" x2=\"2\" y1=\"3\" y2=\"4\">\n");
        sb.append("  <stop offset=\"5\" stop-color=\"red\"/>\n");
        sb.append("</linearGradient>");
        String expected = sb.toString();
        assertEquals(expected, linearGradient.asString());
    }

    /**
     * Test verifying that a linear gradient with a transform is exported correctly.
     */
    @Test
    void linearGradientWithTransformIsExportedCorrectly() {
        LinearGradient linearGradient = new LinearGradient().x1(1).x2(2).y1(THREE).y2(FOUR);
        String actual = linearGradient.gradientTransform(Transform.rotate(FIVE, SIX, SEVEN)).asString();
        StringBuilder sb = new StringBuilder();
        sb.append("<linearGradient gradientTransform=\"rotate(5 6,7)\" x1=\"1\" x2=\"2\" y1=\"3\" y2=\"4\"/>");
        String expected = sb.toString();
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a radial gradient with units is exported correctly.
     */
    @Test
    void linearGradientWithUnitsIsExportedCorrectly() {
        LinearGradient linearGradient = new LinearGradient().x1(1).x2(2).y1(THREE).y2(FOUR);
        String actual = linearGradient.gradientUnits(CoordinateSystemUnitsValue.USER_SPACE_ON_USE).asString();
        StringBuilder sb = new StringBuilder();
        sb.append("<linearGradient gradientUnits=\"userSpaceOnUse\" x1=\"1\" x2=\"2\" y1=\"3\" y2=\"4\"/>");
        String expected = sb.toString();
        assertEquals(expected, actual);
    }
}
