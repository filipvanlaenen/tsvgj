package net.filipvanlaenen.tsvgj.internal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import net.filipvanlaenen.bltxmlepj.CamelCaseAttributeValueEnumeration;

/**
 * Unit tests on the <code>SvgElementWithElements</code> class.
 */
public class SvgElementWithElementsTest {
    /**
     * The magic number three.
     */
    private static final int THREE = 3;

    /**
     * Local subclass of <code>SvgElementWithElements</code> for testing purposes.
     */
    private class MySvgElementWithElements extends SvgElementWithElements {
        @Override
        public String getElementName() {
            return "e";
        }
    }

    /**
     * Local enumeration for testing purposes.
     */
    private enum MyEnumeration implements CamelCaseAttributeValueEnumeration {
        /**
         * Simple value.
         */
        FOO,
        /**
         * Another simple value.
         */
        BAR
    }

    /**
     * Test verifying that the setter for ID is wired correctly to the getter for the reference.
     */
    @Test
    void setIdShouldBeWiredCorrectlyToGetReference() {
        MySvgElementWithElements e = new MySvgElementWithElements();
        e.setId(1);
        assertEquals("e-1", e.getReference());
    }

    /**
     * Test verifying that when an ID is set, it is also exported as an attribute.
     */
    @Test
    void setIdShouldSetIdAttribute() {
        MySvgElementWithElements e = new MySvgElementWithElements();
        e.setId(1);
        assertEquals("<e id=\"e-1\"/>", e.asString());
    }

    /**
     * Tests that an element with a numeric array attribute is exported correctly.
     */
    @Test
    void elementWithNumericArrayAttributeIsExportedCorrectly() {
        MySvgElementWithElements element = new MySvgElementWithElements();
        element.addNumericArrayAttribute("foo", 1, 2, THREE);
        assertEquals("<e foo=\"1 2 3\"/>", element.asString());
    }

    /**
     * Tests that an element with an enumeration array attribute is exported correctly.
     */
    @Test
    void elementWithEnumerationArrayAttributeIsExportedCorrectly() {
        MySvgElementWithElements element = new MySvgElementWithElements();
        element.addEnumerationArrayAttribute("baz", MyEnumeration.FOO, MyEnumeration.BAR);
        assertEquals("<e baz=\"foo bar\"/>", element.asString());
    }
}
