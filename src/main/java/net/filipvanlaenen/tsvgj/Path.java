package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.tsvgj.internal.ArcToCommand;
import net.filipvanlaenen.tsvgj.internal.Attributes;
import net.filipvanlaenen.tsvgj.internal.ClosePathCommand;
import net.filipvanlaenen.tsvgj.internal.LineToCommand;
import net.filipvanlaenen.tsvgj.internal.MoveToCommand;
import net.filipvanlaenen.tsvgj.internal.PathDefinition;

/**
 * A class representing a path.
 *
 * @see <a href="https://www.w3.org/TR/SVG/paths.html#PathElement">Paths — SVG
 *      2: 9.2. The ‘path’ element</a>
 */
public class Path implements GraphicsElement, ShapeElement {
    /**
     * The attributes.
     */
    private final Attributes attributes = new Attributes();

    /**
     * The path definition.
     */
    private final PathDefinition definition = new PathDefinition();

    /**
     * Constructs a path.
     */
    public Path() {
        attributes.addPathDefinitionAttribute("d", definition);
    }

    /**
     * Adds an absolute arc-to command to the path definition.
     *
     * @param rx
     *            The x radius of the arc.
     * @param ry
     *            The y radius of the arc.
     * @param xAxisRotation
     *            The x axis rotation of the arc.
     * @param largeArcFlag
     *            The flag for whether to draw a large or a small arc.
     * @param sweepFlag
     *            The flag for whether to use the positive or the negative direction
     *            for the arc.
     * @param cx
     *            The x coordinate for the center of the arc.
     * @param cy
     *            The y coordinate for the center of the arc.
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
     * Sets the fill color.
     *
     * @param fill
     *            The fill color as an integer.
     * @return The instance called.
     */
    public Path fill(final Integer fill) {
        attributes.addColorAttribute("fill", fill);
        return this;
    }

    /**
     * Adds an absolute line-to command to the path definition.
     *
     * @param x
     *            The x coordinate to draw a line to.
     * @param y
     *            The y coordinate to draw a line to.
     * @return The instance called.
     */
    public Path lineTo(final Number x, final Number y) {
        definition.add(new LineToCommand(x, y));
        return this;
    }

    /**
     * Adds an absolute move-to command to the path definition.
     *
     * @param x
     *            The x coordinate to move to.
     * @param y
     *            The y coordinate to move to.
     * @return The instance called.
     */
    public Path moveTo(final Number x, final Number y) {
        definition.add(new MoveToCommand(x, y));
        return this;
    }

    /**
     * Sets the stroke color of the path.
     *
     * @param stroke
     *            The stroke color of the path.
     * @return The instance called.
     */
    public Path stroke(final Integer stroke) {
        attributes.addColorAttribute("stroke", stroke);
        return this;
    }

    /**
     * Sets the stroke width of the path.
     *
     * @param strokeWidth
     *            The stroke width of the path.
     * @return The instance called.
     */
    public Path strokeWidth(final Number strokeWidth) {
        attributes.addNumericAttribute("stroke-width", strokeWidth);
        return this;
    }

    /**
     * Returns a string representation of the path with the provided indentation.
     *
     * @param indent
     *            The indentation.
     * @return A string representation of the path with the provided indentation.
     */
    @Override
    public String asString(final String indent) {
        return indent + "<path" + attributes.asString() + "/>";
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
         * @param svgValue
         *            The SVG value for the flag.
         */
        LargeArcFlagValues(final int svgValue) {
            this.svgValue = svgValue;
        }

        /**
         * Returns the SVG value for the flag, as it should be included in the path
         * description.
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
         * @param svgValue
         *            The SVG value for the flag.
         */
        SweepFlagValues(final int svgValue) {
            this.svgValue = svgValue;
        }

        /**
         * Returns the SVG value for the flag, as it should be included in the path
         * description.
         *
         * @return The SVG value for the flag
         */
        public int getSvgValue() {
            return svgValue;
        }
    }
}
