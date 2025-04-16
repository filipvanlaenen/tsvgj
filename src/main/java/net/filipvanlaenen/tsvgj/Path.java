package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.tsvgj.internal.ArcToCommand;
import net.filipvanlaenen.tsvgj.internal.ClosePathCommand;
import net.filipvanlaenen.tsvgj.internal.LineToCommand;
import net.filipvanlaenen.tsvgj.internal.MoveToCommand;
import net.filipvanlaenen.tsvgj.internal.PathDefinition;
import net.filipvanlaenen.tsvgj.internal.EmptySvgElement;

/**
 * A class representing a path.
 *
 * @see <a href="https://www.w3.org/TR/SVG/paths.html#PathElement">Paths — SVG 2: 9.2. The ‘path’ element</a>
 */
public final class Path extends EmptySvgElement<Path> implements GraphicsElement, ShapeElement {
    /**
     * The path definition.
     */
    private final PathDefinition definition = new PathDefinition();

    /**
     * Constructs a path.
     */
    public Path() {
        addAttribute("d", definition);
    }

    /**
     * Adds an absolute arc-to command to the path definition.
     *
     * @param rx            The x radius of the arc.
     * @param ry            The y radius of the arc.
     * @param xAxisRotation The x axis rotation of the arc.
     * @param largeArcFlag  The flag for whether to draw a large or a small arc.
     * @param sweepFlag     The flag for whether to use the positive or the negative direction for the arc.
     * @param cx            The x coordinate for the center of the arc.
     * @param cy            The y coordinate for the center of the arc.
     * @return The instance called.
     */
    public Path arcTo(final Number rx, final Number ry, final Number xAxisRotation,
            final LargeArcFlagValues largeArcFlag, final SweepFlagValues sweepFlag, final Number cx, final Number cy) {
        definition.add(new ArcToCommand(rx, ry, xAxisRotation, largeArcFlag, sweepFlag, cx, cy));
        return this;
    }

    /**
     * Adds a close-path command to the path definition.
     *
     * @return The instance called.
     */
    public Path closePath() {
        definition.add(new ClosePathCommand());
        return this;
    }

    /**
     * Sets the fill color as a hexadecimal integer.
     *
     * @param fill The fill color as a hexadecimal integer.
     * @return The instance called.
     */
    public Path fill(final Integer fill) {
        addColorAttribute("fill", fill);
        return this;
    }

    /**
     * Sets the fill color using a color keyword.
     *
     * @param fill The fill color using a color keyword.
     * @return The instance called.
     */
    public Path fill(final ColorKeyword fill) {
        addColorAttribute("fill", fill);
        return this;
    }

    /**
     * Sets the fill color to none.
     *
     * @param none The value none.
     * @return The instance called.
     */
    public Path fill(final NoneValue none) {
        addEnumerationAttribute("fill", none);
        return this;
    }

    @Override
    public String getElementName() {
        return "path";
    }

    /**
     * Adds an absolute line-to command to the path definition.
     *
     * @param x The x coordinate to draw a line to.
     * @param y The y coordinate to draw a line to.
     * @return The instance called.
     */
    public Path lineTo(final Number x, final Number y) {
        definition.add(new LineToCommand(x, y));
        return this;
    }

    /**
     * Sets the end marker.
     *
     * @param marker The end marker for the path.
     * @return The instance called.
     */
    public Path markerEnd(final Marker marker) {
        addReferringAttribute("marker-end", marker);
        return this;
    }

    /**
     * Sets the middle marker.
     *
     * @param marker The middle marker for the path.
     * @return The instance called.
     */
    public Path markerMid(final Marker marker) {
        addReferringAttribute("marker-mid", marker);
        return this;
    }

    /**
     * Sets the start marker.
     *
     * @param marker The start marker for the path.
     * @return The instance called.
     */
    public Path markerStart(final Marker marker) {
        addReferringAttribute("marker-start", marker);
        return this;
    }

    /**
     * Sets the mask.
     *
     * @param mask The mask for the path.
     * @return The instance called.
     */
    public Path mask(final Mask mask) {
        addReferringAttribute("mask", mask);
        return this;
    }

    /**
     * Adds an absolute move-to command to the path definition.
     *
     * @param x The x coordinate to move to.
     * @param y The y coordinate to move to.
     * @return The instance called.
     */
    public Path moveTo(final Number x, final Number y) {
        definition.add(new MoveToCommand(x, y));
        return this;
    }

    /**
     * Sets the opacity.
     *
     * @param opacity The opacity.
     * @return The instance called.
     */
    public Path opacity(final double opacity) {
        addNumericAttribute("opacity", opacity);
        return this;
    }

    /**
     * Sets the stroke color of the path using a color keyword.
     *
     * @param stroke The stroke color of the path using a color keyword.
     * @return The instance called.
     */
    public Path stroke(final ColorKeyword stroke) {
        addColorAttribute("stroke", stroke);
        return this;
    }

    /**
     * Sets the stroke color of the path as a hexadecimal integer.
     *
     * @param stroke The stroke color of the path as a hexadecimal integer.
     * @return The instance called.
     */
    public Path stroke(final Integer stroke) {
        addColorAttribute("stroke", stroke);
        return this;
    }

    /**
     * Sets the stroke width of the path.
     *
     * @param strokeWidth The stroke width of the path.
     * @return The instance called.
     */
    public Path strokeWidth(final Number strokeWidth) {
        addNumericAttribute("stroke-width", strokeWidth);
        return this;
    }

    /**
     * An enumeration with the values for the large arc flag in the arc commands.
     */
    public enum LargeArcFlagValues {
        /**
         * Large arc.
         */
        LARGE_ARC(1),
        /**
         * Small arc.
         */
        SMALL_ARC(0);

        /**
         * The SVG value for the flag.
         */
        private final int svgValue;

        /**
         * Constructor taking the SVG value for the flag as its argument.
         *
         * @param svgValue The SVG value for the flag.
         */
        LargeArcFlagValues(final int svgValue) {
            this.svgValue = svgValue;
        }

        /**
         * Returns the SVG value for the flag, as it should be included in the path description.
         *
         * @return The SVG value for the flag
         */
        public int getValue() {
            return svgValue;
        }
    }

    /**
     * An enumeration with the values for the sweep flag in the arc commands.
     */
    public enum SweepFlagValues {
        /**
         * Positive angle direction.
         */
        POSITIVE_ANGLE(1),
        /**
         * Negative angle direction.
         */
        NEGATIVE_ANGLE(0);

        /**
         * The SVG value for the flag.
         */
        private final int svgValue;

        /**
         * Constructor taking the SVG value for the flag as its argument.
         *
         * @param svgValue The SVG value for the flag.
         */
        SweepFlagValues(final int svgValue) {
            this.svgValue = svgValue;
        }

        /**
         * Returns the SVG value for the flag, as it should be included in the path description.
         *
         * @return The SVG value for the flag
         */
        public int getSvgValue() {
            return svgValue;
        }
    }
}
