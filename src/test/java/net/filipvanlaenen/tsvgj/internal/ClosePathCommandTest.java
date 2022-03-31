package net.filipvanlaenen.tsvgj.internal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>ClosePathCommand</code> class.
 */
public class ClosePathCommandTest {
    /**
     * Test verifying that a close path command is exported correctly to a string.
     */
    @Test
    void shouldConvertCorrectlyToString() {
        assertEquals("Z", new ClosePathCommand().asString());
    }
}
