package net.filipvanlaenen.tsvgj.internal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>NumericArrayAttribute</code> class.
 */
public class NumericArrayAttributeTest {
    /**
     * Test verifying that a numeric array attribute is exported correctly to a
     * string.
     */
    @Test
    void shouldConvertCorrectlyToString() {
        assertEquals("0 1 2", new NumericArrayAttribute(0, 1, 2).asString());
    }
}
