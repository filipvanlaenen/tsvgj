package net.filipvanlaenen.tsvgj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Svg</code> class.
 */
public class SvgTest {
    /**
     * The magic number for the color red.
     */
    private static final int RED = 0xFF0000;
    /**
     * The magic number thousand.
     */
    private static final int THOUSAND = 1000;
    /**
     * The magic number two thousand.
     */
    private static final int TWO_THOUSAND = 2000;
    /**
     * The magic number 0.5.
     */
    private static final double A_HALF = 0.5D;
    /**
     * The magic number -0.5.
     */
    private static final double MINUS_A_HALF = -0.5D;

    /**
     * Test verifying that a SVG fragment is exported correctly to a string.
     */
    @Test
    void svgFragmentIsConvertedCorrectlyToString() {
        Svg svg = new Svg(false);
        assertEquals("<svg/>", svg.asString());
    }

    /**
     * Test verifying that a SVG fragment with preserveAspectRatio is exported correctly to a string.
     */
    @Test
    void svgFragmentWithPreserveAspectRatioIsConvertedCorrectlyToString() {
        Svg svg = new Svg(false).preserveAspectRatio(PreserveAspectRatioAlignValue.X_MAX_Y_MAX,
                PreserveAspectRatioMeetOrSliceValue.MEET);
        assertEquals("<svg preserveAspectRatio=\"xMaxYMax meet\"/>", svg.asString());
    }

    /**
     * Test verifying that a SVG fragment with an image is exported correctly to a string.
     */
    @Test
    void svgFragmentWithImageShouldBeConvertedCorrectlyToString() {
        Svg svg = new Svg(false);
        svg.addElement(new Image().href("foo.png"));
        assertEquals("<svg>\n  <image href=\"foo.png\"/>\n</svg>", svg.asString());
    }

    /**
     * Test verifying that a SVG fragment with a linked image is exported correctly to a string.
     */
    @Test
    void svgFragmentWithLinkedImageShouldBeConvertedCorrectlyToString() {
        Svg svg = new Svg(false);
        A a = new A().href("foo.html");
        a.addElement(new Image().href("foo.png"));
        svg.addElement(a);
        assertEquals("<svg>\n  <a href=\"foo.html\">\n    <image href=\"foo.png\"/>\n  </a>\n</svg>", svg.asString());
    }

    /**
     * Test verifying that a simple SVG document with a red unit circle in a view box is exported correctly to a string.
     */
    @Test
    void redUnitCircleInAViewBoxIsConvertedCorrectlyToString() {
        Svg svg = new Svg().width(TWO_THOUSAND).height(THOUSAND).viewBox(-1, -1, 2, 1);
        svg.addElement(new Circle().cx(0).cy(0).r(1).fill(RED));
        String actual = svg.asString();
        String expected =
                "<svg height=\"1000\" viewBox=\"-1 -1 2 1\" width=\"2000\"" + " xmlns=\"http://www.w3.org/2000/svg\">\n"
                        + "  <circle cx=\"0\" cy=\"0\" fill=\"#FF0000\" r=\"1\"/>\n" + "</svg>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that an SVG document with two red unit circles in a view box is exported correctly to a string.
     */
    @Test
    void twoRedUnitCirclesInAViewBoxAreConvertedCorrectlyToString() {
        Svg svg = new Svg().width(TWO_THOUSAND).height(THOUSAND).viewBox(-1, -1, 2, 1);
        svg.addElement(new Circle().cx(MINUS_A_HALF).cy(0).r(A_HALF).fill(RED));
        svg.addElement(new Circle().cx(A_HALF).cy(0).r(A_HALF).fill(RED));
        String actual = svg.asString();
        String expected =
                "<svg height=\"1000\" viewBox=\"-1 -1 2 1\" width=\"2000\"" + " xmlns=\"http://www.w3.org/2000/svg\">\n"
                        + "  <circle cx=\"-0.5\" cy=\"0\" fill=\"#FF0000\" r=\"0.5\"/>\n"
                        + "  <circle cx=\"0.5\" cy=\"0\" fill=\"#FF0000\" r=\"0.5\"/>\n" + "</svg>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a simple SVG document with a text in a view box is exported correctly to a string.
     */
    @Test
    void textInAViewBoxIsConvertedCorrectlyToString() {
        Svg svg = new Svg().width(TWO_THOUSAND).height(THOUSAND).viewBox(-1, -1, 2, 1);
        Text text = new Text("Lorem ipsum").x(0).y(1).fill(ColorKeyword.RED).fontSize(2).fontFamily("Times New Roman");
        svg.addElement(text);
        String actual = svg.asString();
        StringBuilder sb = new StringBuilder();
        sb.append("<svg height=\"1000\" viewBox=\"-1 -1 2 1\" width=\"2000\" xmlns=\"http://www.w3.org/2000/svg\">\n");
        sb.append("  <text fill=\"red\" font-family=\"Times New Roman\" font-size=\"2\" x=\"0\"");
        sb.append(" y=\"1\">Lorem ipsum</text>\n");
        sb.append("</svg>");
        String expected = sb.toString();
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a simple SVG document with a text in a grouping in a view box is exported correctly to a
     * string.
     */
    @Test
    void textInAGroupingInAViewBoxIsConvertedCorrectlyToString() {
        Svg svg = new Svg().width(TWO_THOUSAND).height(THOUSAND).viewBox(-1, -1, 2, 1);
        G g = new G();
        Text text = new Text("Lorem ipsum").x(0).y(1).fill(ColorKeyword.RED).fontSize(2).fontFamily("Times New Roman");
        g.addElement(text);
        svg.addElement(g);
        String actual = svg.asString();
        StringBuilder sb = new StringBuilder();
        sb.append("<svg height=\"1000\" viewBox=\"-1 -1 2 1\" width=\"2000\" xmlns=\"http://www.w3.org/2000/svg\">\n");
        sb.append("  <g>\n");
        sb.append("    <text fill=\"red\" font-family=\"Times New Roman\" font-size=\"2\" x=\"0\"");
        sb.append(" y=\"1\">Lorem ipsum</text>\n");
        sb.append("  </g>\n");
        sb.append("</svg>");
        String expected = sb.toString();
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a pattern can be registered for reference.
     */
    @Test
    void patternShouldBeRegisteredForReference() {
        Svg svg = new Svg().width(TWO_THOUSAND).height(THOUSAND).viewBox(-1, -1, 2, 1);
        Pattern pattern = new Pattern().x(0).y(0).width(1).height(1);
        Rect patternRect = new Rect().x(0).y(0).width(1).height(1).fill(ColorKeyword.RED);
        pattern.addElement(patternRect);
        svg.registerElementForReference(pattern);
        Rect rect = new Rect().x(0).y(0).width(1).height(1).fill(pattern);
        svg.addElement(rect);
        String actual = svg.asString();
        StringBuilder sb = new StringBuilder();
        sb.append("<svg height=\"1000\" viewBox=\"-1 -1 2 1\" width=\"2000\" xmlns=\"http://www.w3.org/2000/svg\">\n");
        sb.append("  <defs>\n");
        sb.append("    <pattern height=\"1\" id=\"pattern-1\" width=\"1\" x=\"0\" y=\"0\">\n");
        sb.append("      <rect fill=\"red\" height=\"1\" width=\"1\" x=\"0\" y=\"0\"/>\n");
        sb.append("    </pattern>\n");
        sb.append("  </defs>\n");
        sb.append("  <rect fill=\"url(#pattern-1)\" height=\"1\" width=\"1\" x=\"0\" y=\"0\"/>\n");
        sb.append("</svg>");
        String expected = sb.toString();
        assertEquals(expected, actual);
    }
}
