package net.filipvanlaenen.tsvgj;

import java.util.ArrayList;
import java.util.List;

public class Defs implements StructuralElement {
    /**
     * A list with the elements.
     */
    private final List<ElementType> elements = new ArrayList<ElementType>();

    public void addElement(PaintServerElement paintServerElement) {
        this.elements.add(paintServerElement);
        paintServerElement.setId(elements.size());
    }

    @Override
    public String asString(String indent) {
        return indent + "<defs" + (elements.isEmpty() ? "/>"
                : ">\n" + elementsAsString(indent + "  ", elements.iterator()) + indent + "</defs>");
    }
}
