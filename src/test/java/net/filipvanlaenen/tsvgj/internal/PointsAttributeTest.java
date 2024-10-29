package net.filipvanlaenen.tsvgj.internal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>PointsAttribute</code> class.
 */
public class PointsAttributeTest {
    /**
     * The magic number three.
     */
    private static final int THREE = 3;
    /**
     * The magic number four.
     */
    private static final int FOUR = 4;
    /**
     * The magic number five.
     */
    private static final int FIVE = 5;

    /**
     * Test verifying that a points attribute is exported correctly to a string.
     */
    @Test
    void shouldConvertCorrectlyToString() {
        assertEquals("0,1 2,3 4,5", new PointsAttribute(new Number[] {0, 1, 2, THREE, FOUR, FIVE}).asString());
    }
}
