package net.filipvanlaenen.tsvgj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Mask</code> class.
 */
public class MaskTest {
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
     * Basic mask to run tests on.
     */
    private Mask mask;

    /**
     * Creates a basic mask to run tests on.
     */
    @BeforeEach
    void createMask() {
        mask = new Mask().x(0).y(1).width(2).height(THREE);
        Rect rect = new Rect().x(FOUR).y(FIVE).width(SIX).height(SEVEN).fill(ColorKeyword.RED);
        mask.addElement(rect);
    }

    /**
     * Test verifying that a mask with a rectangle is exported correctly.
     */
    @Test
    void maskWithARectangleIsExportedCorrectly() {
        String actual = mask.asString();
        StringBuilder sb = new StringBuilder();
        sb.append("<mask height=\"3\" width=\"2\" x=\"0\" y=\"1\">\n");
        sb.append("  <rect fill=\"red\" height=\"7\" width=\"6\" x=\"4\" y=\"5\"/>\n");
        sb.append("</mask>");
        String expected = sb.toString();
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a mask with a group with a rectangle is exported correctly.
     */
    @Test
    void maskWithAGroupWithARectangleIsExportedCorrectly() {
        Mask myMask = new Mask().x(0).y(1).width(2).height(THREE);
        G g = new G();
        Rect rect = new Rect().x(FOUR).y(FIVE).width(SIX).height(SEVEN).fill(ColorKeyword.RED);
        g.addElement(rect);
        myMask.addElement(g);
        String actual = myMask.asString();
        StringBuilder sb = new StringBuilder();
        sb.append("<mask height=\"3\" width=\"2\" x=\"0\" y=\"1\">\n");
        sb.append("  <g>\n");
        sb.append("    <rect fill=\"red\" height=\"7\" width=\"6\" x=\"4\" y=\"5\"/>\n");
        sb.append("  </g>\n");
        sb.append("</mask>");
        String expected = sb.toString();
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a mask with mask units is exported correctly.
     */
    @Test
    void maskWithMaskUnitsIsExportedCorrectly() {
        String actual = mask.maskUnits(CoordinateSystemUnitsValue.USER_SPACE_ON_USE).asString();
        StringBuilder sb = new StringBuilder();
        sb.append("<mask height=\"3\" maskUnits=\"userSpaceOnUse\" width=\"2\" x=\"0\" y=\"1\">\n");
        sb.append("  <rect fill=\"red\" height=\"7\" width=\"6\" x=\"4\" y=\"5\"/>\n");
        sb.append("</mask>");
        String expected = sb.toString();
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a mask with mask content units is exported correctly.
     */
    @Test
    void maskWithMaskContentUnitsIsExportedCorrectly() {
        String actual = mask.maskContentUnits(CoordinateSystemUnitsValue.USER_SPACE_ON_USE).asString();
        StringBuilder sb = new StringBuilder();
        sb.append("<mask height=\"3\" maskContentUnits=\"userSpaceOnUse\" width=\"2\" x=\"0\" y=\"1\">\n");
        sb.append("  <rect fill=\"red\" height=\"7\" width=\"6\" x=\"4\" y=\"5\"/>\n");
        sb.append("</mask>");
        String expected = sb.toString();
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that the setter for ID is wired correctly to the getter for the reference.
     */
    @Test
    void setIdShouldBeWiredCorrectlyToGetReference() {
        mask.setId(1);
        assertEquals("mask-1", mask.getReference());
    }

    /**
     * Test verifying that when an ID is set, it is also exported as an attribute.
     */
    @Test
    void setIdShouldSetIdAttribute() {
        Mask actual = new Mask();
        actual.setId(1);
        assertEquals("<mask id=\"mask-1\"/>", actual.asString());
    }
}
