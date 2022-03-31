package net.filipvanlaenen.tsvgj.internal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>LineToCommand</code> class.
 */
public class LineToCommandTest {
    /**
     * Test verifying that a line-to command is exported correctly to a string.
     */
    @Test
    void shouldConvertCorrectlyToString() {
        assertEquals("L 1 2", new LineToCommand(1, 2).asString());
    }
}
