package net.filipvanlaenen.tsvgj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Circle</code> class.
 */
public class CircleTest {
    /**
     * Test verifying that a red unit circle is exported correctly to a string.
     */
    @Test
    void redUnitCircleIsConvertedCorrectlyToString() {
        Circle circle = new Circle().cx(0).cy(0).r(1).fill(0xFF0000);
        String actual = circle.asString();
        String expected = "<circle cx=\"0\" cy=\"0\" fill=\"#FF0000\" r=\"1\"/>";
        assertEquals(expected, actual);
    }
}
