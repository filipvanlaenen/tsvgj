package net.filipvanlaenen.tsvgj.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PathDefinition implements Attribute {

    private final List<PathCommand> commands = new ArrayList<PathCommand>();

    public void add(final PathCommand command) {
        commands.add(command);
    }

    @Override
    public String asString() {
        List<String> commandStrings = new ArrayList<String>();
        Iterator<PathCommand> iterator = commands.iterator();
        while (iterator.hasNext()) {
            PathCommand command = iterator.next();
            commandStrings.add(command.asString());
        }
        if (commandStrings.isEmpty()) {
            return "";
        } else {
            return String.join(" ", commandStrings);
        }

    }

}
