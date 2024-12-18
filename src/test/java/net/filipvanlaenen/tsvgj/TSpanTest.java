package net.filipvanlaenen.tsvgj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>TSpan</code> class.
 */
public class TSpanTest {
    /**
     * The magic number for the color red.
     */
    private static final int RED = 0xFF0000;
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
     * Test verifying that a piece of red text is exported correctly to a string.
     */
    @Test
    void redTSpanIsConvertedCorrectlyToString() {
        TSpan tspan =
                new TSpan("Lorem ipsum").x(0).y(1).fill(ColorKeyword.RED).fontSize(2).fontFamily("Times New Roman");
        String actual = tspan.asString();
        String expected = "<tspan fill=\"red\" font-family=\"Times New Roman\" font-size=\"2\" x=\"0\""
                + " y=\"1\">Lorem ipsum</tspan>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a piece of text with the fill color specified as a hexadecimal integer is exported correctly
     * to a string.
     */
    @Test
    void TSpanWithHexadecimalFillColorIsConvertedCorrectlyToString() {
        TSpan tspan = new TSpan("Lorem ipsum").x(0).y(1).fill(RED).fontSize(2).fontFamily("Times New Roman");
        String actual = tspan.asString();
        String expected = "<tspan fill=\"#FF0000\" font-family=\"Times New Roman\" font-size=\"2\" x=\"0\""
                + " y=\"1\">Lorem ipsum</tspan>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that the dominant baseline is exported correctly.
     */
    @Test
    void dominantBaselineIsExportedCorrectlyToString() {
        TSpan tspan = new TSpan("Lorem ipsum").x(0).y(1).fill(RED).fontSize(2).fontFamily("Times New Roman")
                .dominantBaseline(DominantBaselineValue.AUTO);
        String actual = tspan.asString();
        String expected =
                "<tspan dominant-baseline=\"auto\" fill=\"#FF0000\" font-family=\"Times New Roman\" font-size=\"2\""
                        + " x=\"0\" y=\"1\">Lorem ipsum</tspan>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that the text align is exported correctly.
     */
    @Test
    void TSpanAlignIsExportedCorrectlyToString() {
        TSpan tspan = new TSpan("Lorem ipsum").x(0).y(1).fill(RED).fontSize(2).fontFamily("Times New Roman")
                .textAlign(TextAlignValue.CENTER);
        String actual = tspan.asString();
        String expected = "<tspan fill=\"#FF0000\" font-family=\"Times New Roman\" font-size=\"2\""
                + " text-align=\"center\" x=\"0\" y=\"1\">Lorem ipsum</tspan>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that the text anchor is exported correctly.
     */
    @Test
    void TSpanAnchorIsExportedCorrectlyToString() {
        TSpan tspan = new TSpan("Lorem ipsum").x(0).y(1).fill(RED).fontSize(2).fontFamily("Times New Roman")
                .textAnchor(TextAnchorValue.MIDDLE);
        String actual = tspan.asString();
        String expected = "<tspan fill=\"#FF0000\" font-family=\"Times New Roman\" font-size=\"2\""
                + " text-anchor=\"middle\" x=\"0\" y=\"1\">Lorem ipsum</tspan>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a transformation is exported correctly.
     */
    @Test
    void transformationIsExportedCorrectlyToString() {
        TSpan tspan = new TSpan("Lorem ipsum").x(0).y(1).fill(RED).fontSize(2).fontFamily("Times New Roman")
                .transform(Transform.rotate(THREE, FOUR, FIVE));
        String actual = tspan.asString();
        String expected = "<tspan fill=\"#FF0000\" font-family=\"Times New Roman\" font-size=\"2\""
                + " transform=\"rotate(3 4,5)\" x=\"0\" y=\"1\">Lorem ipsum</tspan>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that the font style is exported correctly.
     */
    @Test
    void fontStyletIsExportedCorrectlyToString() {
        TSpan tspan = new TSpan("Lorem ipsum").x(0).y(1).fill(RED).fontSize(2).fontFamily("Times New Roman")
                .fontStyle(FontStyleValue.NORMAL);
        String actual = tspan.asString();
        String expected = "<tspan fill=\"#FF0000\" font-family=\"Times New Roman\" font-size=\"2\""
                + " font-style=\"normal\" x=\"0\" y=\"1\">Lorem ipsum</tspan>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that the font weight is exported correctly.
     */
    @Test
    void fontWeightIsExportedCorrectlyToString() {
        TSpan tspan = new TSpan("Lorem ipsum").x(0).y(1).fill(RED).fontSize(2).fontFamily("Times New Roman")
                .fontWeight(FontWeightValue.BOLD);
        String actual = tspan.asString();
        String expected = "<tspan fill=\"#FF0000\" font-family=\"Times New Roman\" font-size=\"2\""
                + " font-weight=\"bold\" x=\"0\" y=\"1\">Lorem ipsum</tspan>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that the numeric font weight is exported correctly.
     */
    @Test
    void numericFontWeightIsExportedCorrectlyToString() {
        TSpan tspan = new TSpan("Lorem ipsum").x(0).y(1).fill(RED).fontSize(2).fontFamily("Times New Roman")
                .fontWeight(FontWeightValue.W300);
        String actual = tspan.asString();
        String expected = "<tspan fill=\"#FF0000\" font-family=\"Times New Roman\" font-size=\"2\" font-weight=\"300\""
                + " x=\"0\" y=\"1\">Lorem ipsum</tspan>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a piece of text containing special XML characters is encoded correctly.
     */
    @Test
    void specialXmlCharactersAreEncodedCorrectly() {
        TSpan tspan = new TSpan("<&>").x(0).y(1).fill(RED).fontSize(2).fontFamily("Times New Roman");
        String actual = tspan.asString();
        String expected = "<tspan fill=\"#FF0000\" font-family=\"Times New Roman\" font-size=\"2\" x=\"0\""
                + " y=\"1\">&lt;&amp;&gt;</tspan>";
        assertEquals(expected, actual);
    }

    @Test
    public void tspanWithTSpanChildElementIsExportedCorrectly() {
        TSpan tspan = new TSpan();
        tspan.addElement(new TSpan("Foo"));
        String actual = tspan.asString();
        String expected = "<tspan>\n" + "  <tspan>Foo</tspan>\n" + "</tspan>";
        assertEquals(expected, actual);
    }
}
