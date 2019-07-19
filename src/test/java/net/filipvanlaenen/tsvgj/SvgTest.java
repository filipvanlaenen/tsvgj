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
     * Test verifying that a simple SVG document with a red unit circle in a view
     * box is exported correctly to a string.
     */
    @Test
    void redUnitCircleInAViewBoxIsConvertedCorrectlyToString() {
        Svg svg = new Svg().width(TWO_THOUSAND).height(THOUSAND).viewBox(-1, -1, 2, 1);
        svg.addElement(new Circle().cx(0).cy(0).r(1).fill(RED));
        String actual = svg.asString();
        String expected = "<svg height=\"1000\" viewBox=\"-1 -1 2 1\" width=\"2000\" xmlns=\"http://www.w3.org/2000/svg\">\n"
                + "  <circle cx=\"0\" cy=\"0\" fill=\"#FF0000\" r=\"1\"/>\n" + "</svg>";
        assertEquals(expected, actual);
    }
}
