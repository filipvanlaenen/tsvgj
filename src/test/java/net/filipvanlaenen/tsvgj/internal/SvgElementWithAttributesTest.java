package net.filipvanlaenen.tsvgj.internal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import net.filipvanlaenen.tsvgj.ColorKeyword;
import net.filipvanlaenen.tsvgj.PaintServerElement;
import net.filipvanlaenen.tsvgj.Pattern;

/**
 * Unit tests on the <code>SvgElementWithAttributes</code> class.
 */
public class SvgElementWithAttributesTest {
    /**
     * Hexadecimal number for testing purposes.
     */
    private static final int HEXADECIMAL_NUMBER_0X123456 = 0x123456;

    /**
     * Local subclass of <code>ElementWithAttributesAndElements</code> for testing
     * purposes.
     */
    private class MySvgElementWithAttributes extends SvgElementWithAttributes {
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
        MySvgElementWithAttributes element = new MySvgElementWithAttributes();
        element.addColorAttribute("foo", ColorKeyword.ALICEBLUE);
        assertEquals("<e foo=\"aliceblue\"/>", element.asString());
    }

    /**
     * Tests that an element with an integer color attribute is exported correctly.
     */
    @Test
    void elementWithIntegerColorAttributeIsExportedCorrectly() {
        MySvgElementWithAttributes element = new MySvgElementWithAttributes();
        element.addColorAttribute("foo", HEXADECIMAL_NUMBER_0X123456);
        assertEquals("<e foo=\"#123456\"/>", element.asString());
    }

    /**
     * Tests that an element with a referring attribute is exported correctly.
     */
    @Test
    void elementWithReferringAttributeIsExportedCorrectly() {
        MySvgElementWithAttributes element = new MySvgElementWithAttributes();
        PaintServerElement referredElement = new Pattern();
        referredElement.setId(1);
        element.addReferringAttribute("foo", referredElement);
        assertEquals("<e foo=\"url(#pattern-1)\"/>", element.asString());
    }
}
