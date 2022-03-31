package net.filipvanlaenen.tsvgj.internal;

import java.util.ArrayList;
import java.util.List;
import net.filipvanlaenen.bltxmlepj.Attribute;

/**
 * A class representing the definition of a {@link Path}.
 */
public class PathDefinition implements Attribute {
    /**
     * The list with commands.
     */
    private final List<PathCommand> commands = new ArrayList<PathCommand>();

    /**
     * Adds a command to the path definition.
     *
     * @param command
     *            The command to be added to the path definition.
     */
    public void add(final PathCommand command) {
        commands.add(command);
    }

    /**
     * Returns a string representation of the path definition.
     *
     * @return A string representation of the path definition.
     */
    @Override
    public String asString() {
        List<String> commandStrings = new ArrayList<String>();
        for (PathCommand command : commands) {
            commandStrings.add(command.asString());
        }
        return String.join(" ", commandStrings);
    }
}
