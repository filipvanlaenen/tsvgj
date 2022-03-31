package net.filipvanlaenen.tsvgj.internal;

/**
 * A class representing a close-path command.
 */
public class ClosePathCommand implements PathCommand {
    /**
     * Returns a string representation of the close-path command.
     *
     * @return A string representation of the close-path command.
     */
    @Override
    public String asString() {
        return "Z";
    }
}
