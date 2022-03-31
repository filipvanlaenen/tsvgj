package net.filipvanlaenen.tsvgj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>FontWeightValue</code> class.
 */
public class FontWeightValueTest {
    /**
     * Verifies that common values are exported the regular way.
     */
    @Test
    public void shouldExportValueWithoutNumericWeightCorrectly() {
        assertEquals("NORMAL", FontWeightValue.NORMAL.toString());
    }

    /**
     * Verifies that a values with a numeric value is exported the regular way.
     */
    @Test
    public void shouldExportValueWithNumericWeightCorrectly() {
        assertEquals("100", FontWeightValue.W100.toString());
    }
}
