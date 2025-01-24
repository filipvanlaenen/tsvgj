package net.filipvanlaenen.tsvgj.internal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import net.filipvanlaenen.tsvgj.ColorKeyword;

/**
 * Unit tests on the <code>SvgElementWithMixedContent</code> class.
 */
public class SvgElementWithMixedContentTest {
    /**
     * Hexadecimal number for testing purposes.
     */
    private static final int HEXADECIMAL_NUMBER_0X123456 = 0x123456;

    /**
     * Local subclass of <code>SvgElementWithMixedContent</code> for testing purposes.
     */
    private class MySvgElementWithMixedContent extends SvgElementWithMixedContent<MySvgElementWithMixedContent> {
        /**
         * Default constructor.
         */
        protected MySvgElementWithMixedContent() {
            super();
        }

        /**
         * Constructor taking the content as its parameter.
         *
         * @param content The content.
         */
        protected MySvgElementWithMixedContent(final String content) {
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
        MySvgElementWithMixedContent e = new MySvgElementWithMixedContent().clazz("qux");
        assertEquals("<e class=\"qux\"/>", e.asString());
    }

    /**
     * Test verifying that the setter for ID is wired correctly to the getter for the reference.
     */
    @Test
    void setIdShouldBeWiredCorrectlyToGetReference() {
        MySvgElementWithMixedContent e = new MySvgElementWithMixedContent();
        e.setId(1);
        assertEquals("e-1", e.getReference());
    }

    /**
     * Test verifying that when an ID is set, it is also exported as an attribute.
     */
    @Test
    void setIdShouldSetIdAttribute() {
        MySvgElementWithMixedContent e = new MySvgElementWithMixedContent();
        e.setId(1);
        assertEquals("<e id=\"e-1\"/>", e.asString());
    }

    /**
     * Tests that an element with a color keyword attribute is exported correctly.
     */
    @Test
    void elementWithColorKeywordAttributeIsExportedCorrectly() {
        MySvgElementWithMixedContent element = new MySvgElementWithMixedContent();
        element.addColorAttribute("foo", ColorKeyword.ALICEBLUE);
        assertEquals("<e foo=\"aliceblue\"/>", element.asString());
    }

    /**
     * Tests that an element with an integer color attribute is exported correctly.
     */
    @Test
    void elementWithIntegerColorAttributeIsExportedCorrectly() {
        MySvgElementWithMixedContent element = new MySvgElementWithMixedContent();
        element.addColorAttribute("foo", HEXADECIMAL_NUMBER_0X123456);
        assertEquals("<e foo=\"#123456\"/>", element.asString());
    }

    /**
     * Test verifying that onmousemove is exported correctly.
     */
    @Test
    void onmousemoveShouldBeConvertedCorrectlyToString() {
        MySvgElementWithMixedContent e = new MySvgElementWithMixedContent().onmousemove("bar()");
        assertEquals("<e onmousemove=\"bar()\"/>", e.asString());
    }

    /**
     * Test verifying that onmouseout is exported correctly.
     */
    @Test
    void onmouseoutShouldBeConvertedCorrectlyToString() {
        MySvgElementWithMixedContent e = new MySvgElementWithMixedContent().onmouseout("bar()");
        assertEquals("<e onmouseout=\"bar()\"/>", e.asString());
    }
}
