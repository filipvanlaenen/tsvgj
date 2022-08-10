package net.filipvanlaenen.tsvgj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Image</code> class.
 */
public class ImageTest {
    /**
     * The magic number three.
     */
    private static final int THREE = 3;

    /**
     * Test verifying that an image is exported correctly to a string.
     */
    @Test
    void imageIsConvertedCorrectlyToString() {
        Image image = new Image().x(0).y(1).width(2).height(THREE).href("foo.png");
        String actual = image.asString();
        String expected = "<image height=\"3\" href=\"foo.png\" width=\"2\" x=\"0\" y=\"1\"/>";
        assertEquals(expected, actual);
    }
}
