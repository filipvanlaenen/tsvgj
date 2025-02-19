package net.filipvanlaenen.tsvgj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Text</code> class.
 */
public class TextTest {
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
    void redTextIsConvertedCorrectlyToString() {
        Text text = new Text("Lorem ipsum").x(0).y(1).fill(ColorKeyword.RED).fontSize(2).fontFamily("Times New Roman");
        String actual = text.asString();
        String expected = "<text fill=\"red\" font-family=\"Times New Roman\" font-size=\"2\" x=\"0\""
                + " y=\"1\">Lorem ipsum</text>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a piece of text with the fill color specified as a hexadecimal integer is exported correctly
     * to a string.
     */
    @Test
    void textWithHexadecimalFillColorIsConvertedCorrectlyToString() {
        Text text = new Text("Lorem ipsum").x(0).y(1).fill(RED).fontSize(2).fontFamily("Times New Roman");
        String actual = text.asString();
        String expected = "<text fill=\"#FF0000\" font-family=\"Times New Roman\" font-size=\"2\" x=\"0\""
                + " y=\"1\">Lorem ipsum</text>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that the dominant baseline is exported correctly.
     */
    @Test
    void dominantBaselineIsExportedCorrectlyToString() {
        Text text = new Text("Lorem ipsum").x(0).y(1).fill(RED).fontSize(2).fontFamily("Times New Roman")
                .dominantBaseline(DominantBaselineValue.AUTO);
        String actual = text.asString();
        String expected =
                "<text dominant-baseline=\"auto\" fill=\"#FF0000\" font-family=\"Times New Roman\" font-size=\"2\""
                        + " x=\"0\" y=\"1\">Lorem ipsum</text>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that the text align is exported correctly.
     */
    @Test
    void textAlignIsExportedCorrectlyToString() {
        Text text = new Text("Lorem ipsum").x(0).y(1).fill(RED).fontSize(2).fontFamily("Times New Roman")
                .textAlign(TextAlignValue.CENTER);
        String actual = text.asString();
        String expected = "<text fill=\"#FF0000\" font-family=\"Times New Roman\" font-size=\"2\""
                + " text-align=\"center\" x=\"0\" y=\"1\">Lorem ipsum</text>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that the text anchor is exported correctly.
     */
    @Test
    void textAnchorIsExportedCorrectlyToString() {
        Text text = new Text("Lorem ipsum").x(0).y(1).fill(RED).fontSize(2).fontFamily("Times New Roman")
                .textAnchor(TextAnchorValue.MIDDLE);
        String actual = text.asString();
        String expected = "<text fill=\"#FF0000\" font-family=\"Times New Roman\" font-size=\"2\""
                + " text-anchor=\"middle\" x=\"0\" y=\"1\">Lorem ipsum</text>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a transformation is exported correctly.
     */
    @Test
    void transformationIsExportedCorrectlyToString() {
        Text text = new Text("Lorem ipsum").x(0).y(1).fill(RED).fontSize(2).fontFamily("Times New Roman")
                .transform(Transform.rotate(THREE, FOUR, FIVE));
        String actual = text.asString();
        String expected = "<text fill=\"#FF0000\" font-family=\"Times New Roman\" font-size=\"2\""
                + " transform=\"rotate(3 4,5)\" x=\"0\" y=\"1\">Lorem ipsum</text>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that the font style is exported correctly.
     */
    @Test
    void fontStyletIsExportedCorrectlyToString() {
        Text text = new Text("Lorem ipsum").x(0).y(1).fill(RED).fontSize(2).fontFamily("Times New Roman")
                .fontStyle(FontStyleValue.NORMAL);
        String actual = text.asString();
        String expected = "<text fill=\"#FF0000\" font-family=\"Times New Roman\" font-size=\"2\""
                + " font-style=\"normal\" x=\"0\" y=\"1\">Lorem ipsum</text>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that the font weight is exported correctly.
     */
    @Test
    void fontWeightIsExportedCorrectlyToString() {
        Text text = new Text("Lorem ipsum").x(0).y(1).fill(RED).fontSize(2).fontFamily("Times New Roman")
                .fontWeight(FontWeightValue.BOLD);
        String actual = text.asString();
        String expected = "<text fill=\"#FF0000\" font-family=\"Times New Roman\" font-size=\"2\""
                + " font-weight=\"bold\" x=\"0\" y=\"1\">Lorem ipsum</text>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that the numeric font weight is exported correctly.
     */
    @Test
    void numericFontWeightIsExportedCorrectlyToString() {
        Text text = new Text("Lorem ipsum").x(0).y(1).fill(RED).fontSize(2).fontFamily("Times New Roman")
                .fontWeight(FontWeightValue.W300);
        String actual = text.asString();
        String expected = "<text fill=\"#FF0000\" font-family=\"Times New Roman\" font-size=\"2\" font-weight=\"300\""
                + " x=\"0\" y=\"1\">Lorem ipsum</text>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a piece of text containing special XML characters is encoded correctly.
     */
    @Test
    void specialXmlCharactersAreEncodedCorrectly() {
        Text text = new Text("<&>").x(0).y(1).fill(RED).fontSize(2).fontFamily("Times New Roman");
        String actual = text.asString();
        String expected = "<text fill=\"#FF0000\" font-family=\"Times New Roman\" font-size=\"2\" x=\"0\""
                + " y=\"1\">&lt;&amp;&gt;</text>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that text with a span child element is encoded correctly.
     */
    @Test
    public void textWithTSpanChildElementIsExportedCorrectly() {
        Text text = new Text();
        text.addElement(new TSpan("Foo"));
        String actual = text.asString();
        String expected = "<text>\n" + "  <tspan>Foo</tspan>\n" + "</text>";
        assertEquals(expected, actual);
    }
}
