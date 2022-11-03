package net.filipvanlaenen.tsvgj.internal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import net.filipvanlaenen.bltxmlepj.CamelCaseAttributeValueEnumeration;

/**
 * Unit tests on the <code>EnumerationArrayAttribute</code> class.
 */
public class EnumerationArrayAttributeTest {
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
        BAR,
        /**
         * Composed value.
         */
        FOO_BAR
    }

    /**
     * Test verifying that an enumeration array attribute with simple values is exported correctly to a string.
     */
    @Test
    void shouldConvertSimpleValuesCorrectlyToString() {
        assertEquals("foo bar", new EnumerationArrayAttribute(MyEnumeration.FOO, MyEnumeration.BAR).asString());
    }

    /**
     * Test verifying that an enumeration array attribute with a composed value is exported correctly to a string.
     */
    @Test
    void shouldConvertComposedValueCorrectlyToString() {
        assertEquals("fooBar", new EnumerationArrayAttribute(MyEnumeration.FOO_BAR).asString());
    }
}
