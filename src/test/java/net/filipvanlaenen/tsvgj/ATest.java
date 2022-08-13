package net.filipvanlaenen.tsvgj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>A</code> class.
 */
public class ATest {
    /**
     * The magic number for the color red.
     */
    private static final int RED = 0xFF0000;

    /**
     * Test verifying that a link with an image is exported correctly to a string.
     */
    @Test
    void aLinkWithAnImageShouldBeConvertedCorrectlyToString() {
        A a = new A().href("foo.html");
        a.addElement(new Image().href("foo.png"));
        assertEquals("<a href=\"foo.html\">\n  <image href=\"foo.png\"/>\n</a>", a.asString());
    }

    /**
     * Test verifying that a link with a circle is exported correctly to a string.
     */
    @Test
    void aLinkWithACircleShouldBeConvertedCorrectlyToString() {
        A a = new A().href("foo.html");
        a.addElement(new Circle().cx(0).cy(1).r(2).fill(RED));
        assertEquals("<a href=\"foo.html\">\n  <circle cx=\"0\" cy=\"1\" fill=\"#FF0000\" r=\"2\"/>\n</a>",
                a.asString());
    }

    /**
     * Test verifying that a link with a circle in a group is exported correctly to a string.
     */
    @Test
    void aLinkWithACircleInAGroupShouldBeConvertedCorrectlyToString() {
        A a = new A().href("foo.html");
        G g = new G();
        g.addElement(new Circle().cx(0).cy(1).r(2).fill(RED));
        a.addElement(g);
        StringBuilder sb = new StringBuilder();
        sb.append("<a href=\"foo.html\">\n");
        sb.append("  <g>\n");
        sb.append("    <circle cx=\"0\" cy=\"1\" fill=\"#FF0000\" r=\"2\"/>\n");
        sb.append("  </g>\n");
        sb.append("</a>");
        String expected = sb.toString();
        assertEquals(expected, a.asString());
    }

    /**
     * Test verifying that a link with text is exported correctly to a string.
     */
    @Test
    void aLinkWithTextShouldBeConvertedCorrectlyToString() {
        A a = new A().href("foo.html");
        a.addElement(new Text("Foo").x(0).y(1).fill(ColorKeyword.RED).fontSize(2).fontFamily("Times New Roman"));
        StringBuilder sb = new StringBuilder();
        sb.append("<a href=\"foo.html\">\n");
        sb.append("  <text fill=\"red\" font-family=\"Times New Roman\" font-size=\"2\" x=\"0\" y=\"1\">Foo</text>\n");
        sb.append("</a>");
        String expected = sb.toString();
        assertEquals(expected, a.asString());
    }
}
