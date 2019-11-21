package net.filipvanlaenen.tsvgj.internal;

/**
 * A class representing an absolute move-to command.
 */
public class MoveToCommand implements PathCommand {
    /**
     * The x coordinate to move to.
     */
    private final Number x;
    /**
     * The y coordinate to move to.
     */
    private final Number y;

    /**
     * Constructs an absolute move-to command.
     *
     * @param x
     *            The x coordinate to move to.
     * @param y
     *            The y coordinate to move to.
     */
    public MoveToCommand(final Number x, final Number y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Returns a string representation of the absolute move-to command.
     *
     * @return A string representation of the absolute move-to command.
     */
    @Override
    public String asString() {
        return "M " + Attribute.DECIMAL_FORMAT.format(x) + " " + Attribute.DECIMAL_FORMAT.format(y);
    }
}
