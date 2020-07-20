package net.filipvanlaenen.tsvgj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Defs extends ElementType implements StructuralElement {
    /**
     * A list with the elements.
     */
    private final List<ElementType> elements = new ArrayList<ElementType>();

    public void addElement(PaintServerElement paintServerElement) {
        this.elements.add(paintServerElement);
        paintServerElement.setId(elements.size());
    }

    /**
     * Returns a string representation of the elements with the provided
     * indentation.
     *
     * @param indent The indentation.
     * @return A string representation of the elements with the provided
     *         indentation.
     */
    private String elementsAsString(final String indent) {
        List<String> elementStrings = new ArrayList<String>();
        Iterator<ElementType> elementIterator = elements.iterator();
        while (elementIterator.hasNext()) {
            ElementType element = elementIterator.next();
            elementStrings.add(element.asString(indent));
        }
        if (elementStrings.isEmpty()) {
            return "";
        } else {
            return String.join("\n", elementStrings) + "\n";
        }
    }

    @Override
    public String asString(String indent) {
        return indent + "<defs"
                + (elements.isEmpty() ? "/>" : ">\n" + elementsAsString(indent + "  ") + indent + "</defs>");
    }
}
