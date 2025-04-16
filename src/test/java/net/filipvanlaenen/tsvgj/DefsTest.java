package net.filipvanlaenen.tsvgj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Defs</code> class.
 */
public class DefsTest {
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
     * The marker used to refer to in the tests.
     */
    private Marker marker;
    /**
     * The mask used to refer to in the tests.
     */
    private Mask mask;
    /**
     * The SVG object to run the tests on.
     */
    private Svg svg;
    /**
     * The pattern used to refer to in the tests.
     */
    private Pattern pattern;

    /**
     * Creates a basic SVG object with a registered marker, mask and pattern to run tests on.
     */
    @BeforeEach
    void createSvg() {
        marker = new Marker().refX(0).refY(1).markerHeight(2).markerWidth(THREE).viewBox(FOUR, FIVE, SIX, SEVEN);
        mask = new Mask().x(0).y(1).height(2).width(THREE);
        pattern = new Pattern().x(0).y(1).width(2).height(THREE);
        Rect rect = new Rect().x(FOUR).y(FIVE).width(SIX).height(SEVEN).fill(ColorKeyword.RED);
        marker.addElement(rect);
        mask.addElement(rect);
        pattern.addElement(rect);
        svg = new Svg();
        svg.registerElementForReference(marker);
        svg.registerElementForReference(mask);
        svg.registerElementForReference(pattern);
    }

    /**
     * Appends defs to the expected string.
     *
     * @param sb The StringBuffer to append to.
     */
    private void appendDefs(final StringBuilder sb) {
        sb.append("  <defs>\n");
        sb.append("    <marker id=\"marker-1\" markerHeight=\"2\" markerWidth=\"3\" refX=\"0\" refY=\"1\""
                + " viewBox=\"4 5 6 7\">\n");
        sb.append("      <rect fill=\"red\" height=\"7\" width=\"6\" x=\"4\" y=\"5\"/>\n");
        sb.append("    </marker>\n");
        sb.append("    <mask height=\"2\" id=\"mask-1\" width=\"3\" x=\"0\" y=\"1\">\n");
        sb.append("      <rect fill=\"red\" height=\"7\" width=\"6\" x=\"4\" y=\"5\"/>\n");
        sb.append("    </mask>\n");
        sb.append("    <pattern height=\"3\" id=\"pattern-1\" width=\"2\" x=\"0\" y=\"1\">\n");
        sb.append("      <rect fill=\"red\" height=\"7\" width=\"6\" x=\"4\" y=\"5\"/>\n");
        sb.append("    </pattern>\n");
        sb.append("  </defs>\n");
    }

    /**
     * Verifying that elements can be registered in the SVG document.
     */
    @Test
    void elementsShouldBeAddedToDefsInSvg() {
        String actual = svg.asString();
        StringBuilder sb = new StringBuilder();
        sb.append("<svg xmlns=\"http://www.w3.org/2000/svg\">\n");
        appendDefs(sb);
        sb.append("</svg>");
        String expected = sb.toString();
        assertEquals(expected, actual);
    }

    /**
     * Verifying that a pattern that has been added is referenced correctly when it is used in a circle.
     */
    @Test
    void patternIsReferencedCorrectlyFromCircle() {
        svg.addElement(new Circle().cx(0).cy(0).r(1).fill(pattern).markerMid(marker).mask(mask));
        String actual = svg.asString();
        StringBuilder sb = new StringBuilder();
        sb.append("<svg xmlns=\"http://www.w3.org/2000/svg\">\n");
        appendDefs(sb);
        sb.append("  <circle cx=\"0\" cy=\"0\" fill=\"url(#pattern-1)\" marker-mid=\"url(#marker-1)\""
                + " mask=\"url(#mask-1)\" r=\"1\"/>\n");
        sb.append("</svg>");
        String expected = sb.toString();
        assertEquals(expected, actual);
    }

    /**
     * Verifying that a pattern that has been added is referenced correctly when it is used in a rectangle.
     */
    @Test
    void patternIsReferencedCorrectlyFromRectangle() {
        svg.addElement(new Rect().x(0).y(1).width(2).height(THREE).fill(pattern).markerMid(marker).mask(mask));
        String actual = svg.asString();
        StringBuilder sb = new StringBuilder();
        sb.append("<svg xmlns=\"http://www.w3.org/2000/svg\">\n");
        appendDefs(sb);
        sb.append("  <rect fill=\"url(#pattern-1)\" height=\"3\" marker-mid=\"url(#marker-1)\" mask=\"url(#mask-1)\""
                + " width=\"2\" x=\"0\" y=\"1\"/>\n");
        sb.append("</svg>");
        String expected = sb.toString();
        assertEquals(expected, actual);
    }
}
