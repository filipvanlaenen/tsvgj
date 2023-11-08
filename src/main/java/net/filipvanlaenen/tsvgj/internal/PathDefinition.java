package net.filipvanlaenen.tsvgj.internal;

import java.util.stream.Collectors;

import net.filipvanlaenen.bltxmlepj.Attribute;
import net.filipvanlaenen.kolektoj.ModifiableOrderedCollection;
import net.filipvanlaenen.kolektoj.array.ModifiableOrderedArrayCollection;

/**
 * A class representing the definition of a {@link Path}.
 */
public class PathDefinition implements Attribute {
    /**
     * The list with commands.
     */
    private final ModifiableOrderedCollection<PathCommand> commands =
            new ModifiableOrderedArrayCollection<PathCommand>();

    /**
     * Adds a command to the path definition.
     *
     * @param command The command to be added to the path definition.
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
        return commands.stream().map(PathCommand::asString).collect(Collectors.joining(" "));
    }
}
