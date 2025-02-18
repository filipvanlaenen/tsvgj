package net.filipvanlaenen.tsvgj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests on the <code>Marker</code> class.
 */
public class MarkerTest {
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
     * The magic number seven.
     */
    private static final int SEVEN = 7;

    /**
     * Test verifying that a marker with a red circle is exported correctly.
     */
    @Test
    void simpleMarkerWithRedCircleShouldBeExportedCorrectly() {
        Marker marker = new Marker().refX(0).refY(1).markerHeight(2).markerWidth(THREE).viewBox(FOUR, FIVE, SIX, SEVEN);
        marker.addElement(new Circle().cx(0).cy(0).r(1).fill(ColorKeyword.RED));
        marker.setId(1);
        String actual = marker.asString();
        String expected = "<marker id=\"marker-1\" markerHeight=\"2\" markerWidth=\"3\" refX=\"0\" refY=\"1\""
                + " viewBox=\"4 5 6 7\">\n" + "  <circle cx=\"0\" cy=\"0\" fill=\"red\" r=\"1\"/>\n" + "</marker>";
        assertEquals(expected, actual);
    }

    /**
     * Test verifying that a marker with a red circle is exported correctly.
     */
    @Test
    void markerWithRedCircleShouldBeExportedCorrectly() {
        Marker marker = new Marker().refX(0).refY(1).markerHeight(2).markerWidth(THREE).viewBox(FOUR, FIVE, SIX, SEVEN)
                .markerUnits(MarkerUnitsValue.STROKE_WIDTH).preserveAspectRatio(
                        PreserveAspectRatioAlignValue.X_MAX_Y_MAX, PreserveAspectRatioMeetOrSliceValue.MEET);
        G g = new G();
        g.addElement(new Circle().cx(0).cy(0).r(1).fill(ColorKeyword.RED));
        marker.addElement(g);
        marker.setId(1);
        String actual = marker.asString();
        String expected = "<marker id=\"marker-1\" markerHeight=\"2\" markerUnits=\"strokeWidth\" markerWidth=\"3\""
                + " preserveAspectRatio=\"xMaxYMax meet\" refX=\"0\" refY=\"1\" viewBox=\"4 5 6 7\">\n" + "  <g>\n"
                + "    <circle cx=\"0\" cy=\"0\" fill=\"red\" r=\"1\"/>\n" + "  </g>\n" + "</marker>";
        assertEquals(expected, actual);
    }
}
