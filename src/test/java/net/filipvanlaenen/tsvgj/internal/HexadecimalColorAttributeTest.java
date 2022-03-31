package net.filipvanlaenen.tsvgj.internal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>HexadecimalColorAttribute</code> class.
 */
public class HexadecimalColorAttributeTest {
    /**
     * Hexadecimal number for testing purposes.
     */
    private static final int HEXADECIMAL_NUMBER_0X123456 = 0x123456;

    /**
     * Test verifying that a hexadecimal color is exported correctly to a string.
     */
    @Test
    void shouldConvertCorrectlyToString() {
        assertEquals("#123456", new HexadecimalColorAttribute(HEXADECIMAL_NUMBER_0X123456).asString());
    }
}
