package net.filipvanlaenen.tsvgj.internal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>SvgElementWithAttributesAndElements</code> class.
 */
public class SvgElementWithAttributesAndElementsTest {
    /**
     * The magic number three.
     */
    private static final int THREE = 3;

    /**
     * Local subclass of <code>ElementWithAttributesAndElements</code> for testing
     * purposes.
     */
    private class MySvgElementWithAttributesAndElements extends SvgElementWithAttributesAndElements {
        @Override
        public String getElementName() {
            return "e";
        }
    }

    /**
     * Tests that an element with a numeric array attribute is exported correctly.
     */
    @Test
    void elementWithNumericArrayAttributeIsExportedCorrectly() {
        MySvgElementWithAttributesAndElements element = new MySvgElementWithAttributesAndElements();
        element.addNumericArrayAttribute("foo", 1, 2, THREE);
        assertEquals("<e foo=\"1 2 3\"/>", element.asString());
    }
}
