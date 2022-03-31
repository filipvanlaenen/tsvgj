package net.filipvanlaenen.tsvgj.internal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import net.filipvanlaenen.tsvgj.PaintServerElement;
import net.filipvanlaenen.tsvgj.Pattern;

/**
 * Unit tests on the <code>ReferringAttribute</code> class.
 */
public class ReferringAttributeTest {
    /**
     * Test verifying that a referring attribute is exported correctly to a string.
     */
    @Test
    void shouldConvertCorrectlyToString() {
        PaintServerElement referredElement = new Pattern();
        referredElement.setId(1);
        assertEquals("url(#pattern-1)", new ReferringAttribute(referredElement).asString());
    }
}
