package net.filipvanlaenen.tsvgj.internal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>HexadecimalColorAttribute</code> class.
 */
public class HexadecimalColorAttributeTest {
    /**
     * Test verifying that a hexadecimal color is exported correctly to a string.
     */
    @Test
    void shouldConvertCorrectlyToString() {
        assertEquals("#123456", new HexadecimalColorAttribute(0x123456).asString());
    }
}
