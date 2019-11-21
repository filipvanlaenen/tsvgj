package net.filipvanlaenen.tsvgj.internal;

import net.filipvanlaenen.tsvgj.Path.LargeArcFlagValues;
import net.filipvanlaenen.tsvgj.Path.SweepFlagValues;

public class ArcToCommand implements PathCommand {

    private final Number cx;
    private final Number cy;
    private final LargeArcFlagValues largeArcFlag;
    private final Number rx;
    private final Number ry;
    private final SweepFlagValues sweepFlag;
    private final Number xAxisRotation;

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

    @Override
    public String asString() {
        return "A " + Attribute.DECIMAL_FORMAT.format(rx) + " " + Attribute.DECIMAL_FORMAT.format(ry) + " "
                + Attribute.DECIMAL_FORMAT.format(xAxisRotation) + " " + largeArcFlag.getValue() + " "
                + sweepFlag.getValue() + " " + Attribute.DECIMAL_FORMAT.format(cx) + " "
                + Attribute.DECIMAL_FORMAT.format(cy);
    }

}
