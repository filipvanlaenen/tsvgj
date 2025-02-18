package net.filipvanlaenen.tsvgj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>TextPath</code> class.
 */
public class TextPathTest {
    /**
     * The magic number three.
     */
    private static final int THREE = 3;
    /**
     * The magic number four.
     */
    private static final int FOUR = 4;

    /**
     * Test verifying that a text path referring to a path is exported correctly.
     */
    @Test
    void textPathReferringToPathShouldBeConvertedCorrectlyToString() {
        Path path = new Path().moveTo(0, 1).lineTo(THREE, FOUR).stroke(ColorKeyword.RED).strokeWidth(FOUR);
        path.setId(1);
        TextPath textPath = new TextPath("Foo").href(path);
        String actual = textPath.asString();
        String expected = "<textPath href=\"url(#path-1)\">Foo</textPath>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a text path referring to a shape element is exported correctly.
     */
    @Test
    void textPathReferringToShapeElementShouldBeConvertedCorrectlyToString() {
        Circle circle = new Circle().cx(0).cy(1).r(2).fill(ColorKeyword.RED);
        circle.setId(1);
        TextPath textPath = new TextPath("Foo").href(circle);
        String actual = textPath.asString();
        String expected = "<textPath href=\"url(#circle-1)\">Foo</textPath>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that text path with a span child element is encoded correctly.
     */
    @Test
    public void textPathWithTSpanChildElementShouldBeExportedCorrectly() {
        Path path = new Path().moveTo(0, 1).lineTo(THREE, FOUR).stroke(ColorKeyword.RED).strokeWidth(FOUR);
        path.setId(1);
        TextPath textPath = new TextPath().href(path);
        textPath.addElement(new TSpan("Foo"));
        String actual = textPath.asString();
        String expected = "<textPath href=\"url(#path-1)\">\n" + "  <tspan>Foo</tspan>\n" + "</textPath>";
        assertEquals(expected, actual);
    }
}
