package net.filipvanlaenen.tsvgj.internal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import net.filipvanlaenen.tsvgj.ColorKeyword;

/**
 * Unit tests on the <code>SvgElementWithAttributesAndContent</code> class.
 */
public class SvgElementWithAttributesAndContentTest {
    /**
     * Hexadecimal number for testing purposes.
     */
    private static final int HEXADECIMAL_NUMBER_0X123456 = 0x123456;

    /**
     * Local subclass of <code>ElementWithAttributesAndElements</code> for testing
     * purposes.
     */
    private class MySvgElementWithAttributesAndContent extends SvgElementWithAttributesAndContent {
        /**
         * Constructor taking the content as its parameter.
         *
         * @param content
         *            The content.
         */
        protected MySvgElementWithAttributesAndContent(final String content) {
            super(content);
        }

        @Override
        public String getElementName() {
            return "e";
        }
    }

    /**
     * Tests that an element with a color keyword attribute is exported correctly.
     */
    @Test
    void elementWithColorKeywordAttributeIsExportedCorrectly() {
        MySvgElementWithAttributesAndContent element = new MySvgElementWithAttributesAndContent(null);
        element.addColorAttribute("foo", ColorKeyword.ALICEBLUE);
        assertEquals("<e foo=\"aliceblue\"/>", element.asString());
    }

    /**
     * Tests that an element with an integer color attribute is exported correctly.
     */
    @Test
    void elementWithIntegerColorAttributeIsExportedCorrectly() {
        MySvgElementWithAttributesAndContent element = new MySvgElementWithAttributesAndContent(null);
        element.addColorAttribute("foo", HEXADECIMAL_NUMBER_0X123456);
        assertEquals("<e foo=\"#123456\"/>", element.asString());
    }
}
