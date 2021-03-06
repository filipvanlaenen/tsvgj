package net.filipvanlaenen.tsvgj;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>G</code> class.
 */
public class GTest {
    /**
     * The magic number for the color red.
     */
    private static final int RED = 0xFF0000;

    /**
     * Test verifying that an empty grouping is exported correctly to a string.
     */
    @Test
    void emptyGroupingIsConvertedCorrectlyToString() {
        G g = new G();
        assertEquals("<g/>", g.asString());
    }

    /**
     * Test verifying that a circle in a grouping is exported correctly to a string.
     */
    @Test
    void redCircleInAGroupingIsConvertedCorrectlyToString() {
        Circle circle = new Circle().cx(0).cy(1).r(2).fill(RED);
        G g = new G();
        g.addElement(circle);
        String actual = g.asString();
        String expected = "<g>\n  <circle cx=\"0\" cy=\"1\" fill=\"#FF0000\" r=\"2\"/>\n</g>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a circle in a grouping in a grouping is exported
     * correctly to a string.
     */
    @Test
    void redCircleInAGroupingInAGroupingIsConvertedCorrectlyToString() {
        Circle circle = new Circle().cx(0).cy(1).r(2).fill(RED);
        G outer = new G();
        G inner = new G();
        outer.addElement(inner);
        inner.addElement(circle);
        String actual = outer.asString();
        String expected = "<g>\n  <g>\n    <circle cx=\"0\" cy=\"1\" fill=\"#FF0000\" r=\"2\"/>\n  </g>\n</g>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a text in a grouping is exported correctly to a string.
     */
    @Test
    void textInAGroupingIsConvertedCorrectlyToString() {
        Text text = new Text("Lorem ipsum").x(0).y(1).fill(ColorKeyword.RED).fontSize(2).fontFamily("Times New Roman");
        G g = new G();
        g.addElement(text);
        String actual = g.asString();
        StringBuilder sb = new StringBuilder();
        sb.append("<g>\n");
        sb.append("  <text fill=\"red\" font-family=\"Times New Roman\" font-size=\"2\" x=\"0\"");
        sb.append(" y=\"1\">Lorem ipsum</text>\n");
        sb.append("</g>");
        String expected = sb.toString();
        assertEquals(expected, actual);
    }
}
