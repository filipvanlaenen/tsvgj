package net.filipvanlaenen.tsvgj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Pattern</code> class.
 */
public class PatternTest {
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
     * Basic pattern to run tests on.
     */
    private Pattern pattern;

    /**
     * Creates a basic pattern to run tests on.
     */
    @BeforeEach
    void createPattern() {
        pattern = new Pattern().x(0).y(1).width(2).height(THREE);
        Rect rect = new Rect().x(FOUR).y(FIVE).width(SIX).height(SEVEN).fill(ColorKeyword.RED);
        pattern.addElement(rect);
    }

    /**
     * Test verifying that a pattern with a rectangle is exported correctly.
     */
    @Test
    void patternWithARectangleIsExportedCorrectly() {
        String actual = pattern.asString();
        StringBuilder sb = new StringBuilder();
        sb.append("<pattern height=\"3\" width=\"2\" x=\"0\" y=\"1\">\n");
        sb.append("  <rect fill=\"red\" height=\"7\" width=\"6\" x=\"4\" y=\"5\"/>\n");
        sb.append("</pattern>");
        String expected = sb.toString();
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a pattern with a transform is exported correctly.
     */
    @Test
    void patternWithTransformIsExportedCorrectly() {
        String actual = pattern.patternTransform(Transform.rotate(EIGHT, NINE, TEN)).asString();
        StringBuilder sb = new StringBuilder();
        sb.append("<pattern height=\"3\" patternTransform=\"rotate(8 9,10)\" width=\"2\" x=\"0\" y=\"1\">\n");
        sb.append("  <rect fill=\"red\" height=\"7\" width=\"6\" x=\"4\" y=\"5\"/>\n");
        sb.append("</pattern>");
        String expected = sb.toString();
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a pattern with pattern units is exported correctly.
     */
    @Test
    void patternWithPatternUnitsIsExportedCorrectly() {
        String actual = pattern.patternUnits(PatternUnitsValue.USER_SPACE_ON_USE).asString();
        StringBuilder sb = new StringBuilder();
        sb.append("<pattern height=\"3\" patternUnits=\"userSpaceOnUse\" width=\"2\" x=\"0\" y=\"1\">\n");
        sb.append("  <rect fill=\"red\" height=\"7\" width=\"6\" x=\"4\" y=\"5\"/>\n");
        sb.append("</pattern>");
        String expected = sb.toString();
        assertEquals(expected, actual);
    }
}
