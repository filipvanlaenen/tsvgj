package net.filipvanlaenen.tsvgj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import net.filipvanlaenen.tsvgj.internal.EmptySvgElement;

/**
 * Unit tests on the <code>SvgElement</code> class.
 */
public class SvgElementTest {
    /**
     * Local subclass of <code>SvgElement</code> for testing purposes.
     */
    private class MySvgElement extends EmptySvgElement<MySvgElement> {
        @Override
        public String getElementName() {
            return "e";
        }
    }

    /**
     * Test verifying that the setter for ID is wired correctly to the getter for the reference.
     */
    @Test
    void setIdShouldBeWiredCorrectlyToGetReference() {
        MySvgElement e = new MySvgElement();
        e.setId(1);
        assertEquals("e-1", e.getReference());
    }
}
