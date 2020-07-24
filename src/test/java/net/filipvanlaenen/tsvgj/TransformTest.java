package net.filipvanlaenen.tsvgj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Transform</code> class.
 */
public class TransformTest {
    /**
     * Test verifying that a rotation is exported correctly.
     */
    @Test
    void rotationIsExportedCorrectlyToString() {
        Transform rotation = Transform.rotate(0, 1, 2);
        String actual = rotation.asString();
        String expected = "rotate(0 1,2)";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a simple rotation is exported correctly.
     */
    @Test
    void simpleRotationIsExportedCorrectlyToString() {
        Transform rotation = Transform.rotate(1);
        String actual = rotation.asString();
        String expected = "rotate(1)";
        assertEquals(expected, actual);
    }
}
