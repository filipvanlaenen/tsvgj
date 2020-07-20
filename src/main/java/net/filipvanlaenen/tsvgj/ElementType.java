package net.filipvanlaenen.tsvgj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Top interface for all SVG element types.
 */
public interface ElementType {
    /**
     * Returns a string representation of the element.
     *
     * @return A string representation of the element.
     */
    default String asString() {
        return asString("");
    }
    
    /**
     * Returns a string representation of the elements with the provided
     * indentation.
     *
     * @param indent The indentation.
     * @return A string representation of the elements with the provided
     *         indentation.
     */
    default String elementsAsString(final String indent, Iterator<ElementType> elementIterator) {
        List<String> elementStrings = new ArrayList<String>();
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

    /**
     * Returns a string representation of the element with the provided indentation.
     *
     * @param indent
     *            The indentation.
     * @return A string representation of the element with the provided indentation.
     */
    String asString(String indent);
}
