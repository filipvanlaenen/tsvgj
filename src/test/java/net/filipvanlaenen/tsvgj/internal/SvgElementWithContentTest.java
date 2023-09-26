package net.filipvanlaenen.tsvgj.internal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import net.filipvanlaenen.tsvgj.ColorKeyword;

/**
 * Unit tests on the <code>SvgElementWithContent</code> class.
 */
public class SvgElementWithContentTest {
    /**
     * Hexadecimal number for testing purposes.
     */
    private static final int HEXADECIMAL_NUMBER_0X123456 = 0x123456;

    /**
     * Local subclass of <code>SvgElementWithContent</code> for testing purposes.
     */
    private class MySvgElementWithContent extends SvgElementWithContent<MySvgElementWithContent> {
        /**
         * Constructor taking the content as its parameter.
         *
         * @param content The content.
         */
        protected MySvgElementWithContent(final String content) {
            super(content);
        }

        @Override
        public String getElementName() {
            return "e";
        }
    }

    /**
     * Test verifying that a class is exported correctly.
     */
    @Test
    void classShouldBeConvertedCorrectlyToString() {
        MySvgElementWithContent e = new MySvgElementWithContent(null).clazz("qux");
        assertEquals("<e class=\"qux\"/>", e.asString());
    }

    /**
     * Tests that an element with a color keyword attribute is exported correctly.
     */
    @Test
    void elementWithColorKeywordAttributeIsExportedCorrectly() {
        MySvgElementWithContent element = new MySvgElementWithContent(null);
        element.addColorAttribute("foo", ColorKeyword.ALICEBLUE);
        assertEquals("<e foo=\"aliceblue\"/>", element.asString());
    }

    /**
     * Tests that an element with an integer color attribute is exported correctly.
     */
    @Test
    void elementWithIntegerColorAttributeIsExportedCorrectly() {
        MySvgElementWithContent element = new MySvgElementWithContent(null);
        element.addColorAttribute("foo", HEXADECIMAL_NUMBER_0X123456);
        assertEquals("<e foo=\"#123456\"/>", element.asString());
    }

    /**
     * Test verifying that onmousemove is exported correctly.
     */
    @Test
    void onmousemoveShouldBeConvertedCorrectlyToString() {
        MySvgElementWithContent e = new MySvgElementWithContent(null).onmousemove("bar()");
        assertEquals("<e onmousemove=\"bar()\"/>", e.asString());
    }

    /**
     * Test verifying that onmouseout is exported correctly.
     */
    @Test
    void onmouseoutShouldBeConvertedCorrectlyToString() {
        MySvgElementWithContent e = new MySvgElementWithContent(null).onmouseout("bar()");
        assertEquals("<e onmouseout=\"bar()\"/>", e.asString());
    }
}
