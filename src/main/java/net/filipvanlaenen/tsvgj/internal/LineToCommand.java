package net.filipvanlaenen.tsvgj.internal;

/**
 * A class representing an absolute line-to command.
 */
public class LineToCommand implements PathCommand {
    /**
     * The x coordinate to draw a line to.
     */
    private final Number x;
    /**
     * The y coordinate to draw a line to.
     */
    private final Number y;

    /**
     * Constructs an absolute line-to command.
     *
     * @param x
     *            The x coordinate to draw a line to.
     * @param y
     *            The y coordinate to draw a line to.
     */
    public LineToCommand(final Number x, final Number y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Returns a string representation of the absolute line-to command.
     *
     * @return A string representation of the absolute line-to command.
     */
    @Override
    public String asString() {
        return "L " + Attribute.DECIMAL_FORMAT.format(x) + " " + Attribute.DECIMAL_FORMAT.format(y);
    }

}
