package net.filipvanlaenen.tsvgj.internal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>MoveToCommand</code> class.
 */
public class MoveToCommandTest {
    /**
     * Test verifying that a move-to command is exported correctly to a string.
     */
    @Test
    void shouldConvertCorrectlyToString() {
        assertEquals("M 1 2", new MoveToCommand(1, 2).asString());
    }
}
