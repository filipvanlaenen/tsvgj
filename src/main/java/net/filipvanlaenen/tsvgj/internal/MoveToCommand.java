package net.filipvanlaenen.tsvgj.internal;

public class MoveToCommand implements PathCommand {
    private final Number x;
    private final Number y;

    public MoveToCommand(final Number x, final Number y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String asString() {
        return "M " + Attribute.DECIMAL_FORMAT.format(x) + " " + Attribute.DECIMAL_FORMAT.format(y);
    }
}
