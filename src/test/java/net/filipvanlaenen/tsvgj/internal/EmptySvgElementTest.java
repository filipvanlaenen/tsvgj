package net.filipvanlaenen.tsvgj.internal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import net.filipvanlaenen.tsvgj.ColorKeyword;
import net.filipvanlaenen.tsvgj.Marker;
import net.filipvanlaenen.tsvgj.Mask;
import net.filipvanlaenen.tsvgj.PaintServerElement;
import net.filipvanlaenen.tsvgj.Pattern;

/**
 * Unit tests on the <code>EmptySvgElement</code> class.
 */
public class EmptySvgElementTest {
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
     * Hexadecimal number for testing purposes.
     */
    private static final int HEXADECIMAL_NUMBER_0X123456 = 0x123456;

    /**
     * Local subclass of <code>EmptySvgElement</code> for testing purposes.
     */
    private class MyEmptySvgElement extends EmptySvgElement<MyEmptySvgElement> {
        @Override
        public String getElementName() {
            return "e";
        }
    }

    /**
     * Test verifying that a class is exported correctly.
     */
    @Test
    void classShouldBeConvertedCorrectlyToString() {
        MyEmptySvgElement e = new MyEmptySvgElement().clazz("qux");
        assertEquals("<e class=\"qux\"/>", e.asString());
    }

    /**
     * Test verifying that when an ID is set, it is also exported as an attribute.
     */
    @Test
    void setIdShouldSetIdAttribute() {
        MyEmptySvgElement e = new MyEmptySvgElement();
        e.setId(1);
        assertEquals("<e id=\"e-1\"/>", e.asString());
    }

    /**
     * Tests that an element with a color keyword attribute is exported correctly.
     */
    @Test
    void elementWithColorKeywordAttributeIsExportedCorrectly() {
        MyEmptySvgElement element = new MyEmptySvgElement();
        element.addColorAttribute("foo", ColorKeyword.ALICEBLUE);
        assertEquals("<e foo=\"aliceblue\"/>", element.asString());
    }

    /**
     * Tests that an element with an integer color attribute is exported correctly.
     */
    @Test
    void elementWithIntegerColorAttributeIsExportedCorrectly() {
        MyEmptySvgElement element = new MyEmptySvgElement();
        element.addColorAttribute("foo", HEXADECIMAL_NUMBER_0X123456);
        assertEquals("<e foo=\"#123456\"/>", element.asString());
    }

    /**
     * Tests that an element with a points attribute is exported correctly.
     */
    @Test
    void elementWithPointsAttributeIsExportedCorrectly() {
        MyEmptySvgElement element = new MyEmptySvgElement();
        element.addPointsAttribute("foo", new Number[] {0, 1, 2, THREE, FOUR, FIVE});
        assertEquals("<e foo=\"0,1 2,3 4,5\"/>", element.asString());
    }

    /**
     * Tests that a marker element with a referring attribute is exported correctly.
     */
    @Test
    void markerWithReferringAttributeIsExportedCorrectly() {
        MyEmptySvgElement element = new MyEmptySvgElement();
        Marker marker = new Marker();
        marker.setId(1);
        element.addReferringAttribute("foo", marker);
        assertEquals("<e foo=\"url(#marker-1)\"/>", element.asString());
    }

    /**
     * Tests that a mask element with a referring attribute is exported correctly.
     */
    @Test
    void maskWithReferringAttributeIsExportedCorrectly() {
        MyEmptySvgElement element = new MyEmptySvgElement();
        Mask mask = new Mask();
        mask.setId(1);
        element.addReferringAttribute("foo", mask);
        assertEquals("<e foo=\"url(#mask-1)\"/>", element.asString());
    }

    /**
     * Tests that a paint server element with a referring attribute is exported correctly.
     */
    @Test
    void paintServerElementWithReferringAttributeIsExportedCorrectly() {
        MyEmptySvgElement element = new MyEmptySvgElement();
        PaintServerElement paintServerElement = new Pattern();
        paintServerElement.setId(1);
        element.addReferringAttribute("foo", paintServerElement);
        assertEquals("<e foo=\"url(#pattern-1)\"/>", element.asString());
    }

    /**
     * Test verifying that onmousemove is exported correctly.
     */
    @Test
    void onmousemoveShouldBeConvertedCorrectlyToString() {
        MyEmptySvgElement e = new MyEmptySvgElement().onmousemove("bar()");
        assertEquals("<e onmousemove=\"bar()\"/>", e.asString());
    }

    /**
     * Test verifying that onmouseout is exported correctly.
     */
    @Test
    void onmouseoutShouldBeConvertedCorrectlyToString() {
        MyEmptySvgElement e = new MyEmptySvgElement().onmouseout("bar()");
        assertEquals("<e onmouseout=\"bar()\"/>", e.asString());
    }
}
