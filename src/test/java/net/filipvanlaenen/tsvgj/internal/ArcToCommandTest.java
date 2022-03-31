package net.filipvanlaenen.tsvgj.internal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import net.filipvanlaenen.tsvgj.Path;

/**
 * Unit tests on the <code>ArcToCommand</code> class.
 */
public class ArcToCommandTest {
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
     * The magic number six.
     */
    private static final int SIX = 6;

    /**
     * Test verifying that an arc-to command is exported correctly to a string.
     */
    @Test
    void shouldConvertCorrectlyToString() {
        ArcToCommand arcToCommand = new ArcToCommand(2, THREE, FOUR, Path.LargeArcFlagValues.LARGE_ARC,
                Path.SweepFlagValues.POSITIVE_ANGLE, FIVE, SIX);
        String actual = arcToCommand.asString();
        String expected = "A 2 3 4 1 1 5 6";
        assertEquals(expected, actual);
    }
}
