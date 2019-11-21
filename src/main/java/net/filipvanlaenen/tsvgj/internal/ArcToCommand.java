package net.filipvanlaenen.tsvgj.internal;

import net.filipvanlaenen.tsvgj.Path.LargeArcFlagValues;
import net.filipvanlaenen.tsvgj.Path.SweepFlagValues;

/**
 * A class representing an absolute arc-to command.
 */
public class ArcToCommand implements PathCommand {

    /**
     * The x coordinate for the center of the arc.
     */
    private final Number cx;
    /**
     * The y coordinate for the center of the arc.
     */
    private final Number cy;
    /**
     * The flag for whether to draw a large or a small arc.
     */
    private final LargeArcFlagValues largeArcFlag;
    /**
     * The x radius of the arc.
     */
    private final Number rx;
    /**
     * The y radius of the arc.
     */
    private final Number ry;
    /**
     * The flag for whether to use the positive or the negative direction for the
     * arc.
     */
    private final SweepFlagValues sweepFlag;
    /**
     * The x axis rotation of the arc.
     */
    private final Number xAxisRotation;

    /**
     * Constructs an absolute arc-to command.
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
     */
    public ArcToCommand(final Number rx, final Number ry, final Number xAxisRotation,
            final LargeArcFlagValues largeArcFlag, final SweepFlagValues sweepFlag, final Number cx, final Number cy) {
        this.rx = rx;
        this.ry = ry;
        this.xAxisRotation = xAxisRotation;
        this.largeArcFlag = largeArcFlag;
        this.sweepFlag = sweepFlag;
        this.cx = cx;
        this.cy = cy;
    }

    /**
     * Returns a string representation of the absolute arc-to command.
     *
     * @return A string representation of the absolute arc-to command.
     */
    @Override
    public String asString() {
        return "A " + Attribute.DECIMAL_FORMAT.format(rx) + " " + Attribute.DECIMAL_FORMAT.format(ry) + " "
                + Attribute.DECIMAL_FORMAT.format(xAxisRotation) + " " + largeArcFlag.getValue() + " "
                + sweepFlag.getSvgValue() + " " + Attribute.DECIMAL_FORMAT.format(cx) + " "
                + Attribute.DECIMAL_FORMAT.format(cy);
    }

}
