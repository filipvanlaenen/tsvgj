package net.filipvanlaenen.tsvgj.internal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>PathDefinition</code> class.
 */
public class PathDefinitionTest {
    /**
     * The magic number three.
     */
    private static final int THREE = 3;
    /**
     * The magic number four.
     */
    private static final int FOUR = 4;

    /**
     * Test verifying that a path definition is exported correctly to a string.
     */
    @Test
    void shouldConvertCorrectlyToString() {
        PathDefinition pathDefinition = new PathDefinition();
        pathDefinition.add(new MoveToCommand(1, 2));
        pathDefinition.add(new LineToCommand(THREE, FOUR));
        assertEquals("M 1 2 L 3 4", pathDefinition.asString());
    }
}
