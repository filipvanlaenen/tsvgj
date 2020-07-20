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
    private Svg svg;
    private Pattern pattern;

    /**
     * Creates a basic SVG object with a registered pattern to run tests on.
     */
    @BeforeEach
    void createSvgWithPattern() {
        pattern = new Pattern().x(0).y(1).width(2).height(THREE);
        Rect rect = new Rect().x(FOUR).y(FIVE).width(SIX).height(SEVEN).fill(ColorKeyword.RED);
        pattern.addElement(rect);
        svg = new Svg();
        svg.registerElementForReference(pattern);
    }

    /**
     * Verifying that a pattern can be added to the SVG document.
     */
    @Test
    void patternIsAddedToDefsInSvg() {
        String actual = svg.asString();
        StringBuilder sb = new StringBuilder();
        sb.append("<svg xmlns=\"http://www.w3.org/2000/svg\">\n");
        sb.append("  <defs>\n");
        sb.append("    <pattern id=\"pattern-1\" height=\"3\" width=\"2\" x=\"0\" y=\"1\">\n");
        sb.append("      <rect fill=\"red\" height=\"7\" width=\"6\" x=\"4\" y=\"5\"/>\n");
        sb.append("    </pattern>\n");
        sb.append("  </defs>\n");
        sb.append("</svg>");
        String expected = sb.toString();
        assertEquals(expected, actual);
    }

    /**
     * Verifying that a pattern that has been added is referenced correctly when it
     * is used.
     */
    @Test
    void patternIsReferencedCorrectly() {
        svg.addElement(new Circle().cx(0).cy(0).r(1).fill(pattern));
        String actual = svg.asString();
        StringBuilder sb = new StringBuilder();
        sb.append("<svg xmlns=\"http://www.w3.org/2000/svg\">\n");
        sb.append("  <defs>\n");
        sb.append("    <pattern id=\"pattern-1\" height=\"3\" width=\"2\" x=\"0\" y=\"1\">\n");
        sb.append("      <rect fill=\"red\" height=\"7\" width=\"6\" x=\"4\" y=\"5\"/>\n");
        sb.append("    </pattern>\n");
        sb.append("  </defs>\n");
        sb.append("  <circle cx=\"0\" cy=\"0\" fill=\"url(#pattern-1)\" r=\"1\"/>\n");
        sb.append("</svg>");
        String expected = sb.toString();
        assertEquals(expected, actual);
    }
}
