package net.filipvanlaenen.tsvgj.internal;

public class LineToCommand implements PathCommand {

    private final Number x;
    private final Number y;

    public LineToCommand(final Number x, final Number y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String asString() {
        return "L " + Attribute.DECIMAL_FORMAT.format(x) + " " + Attribute.DECIMAL_FORMAT.format(y);
    }

}
