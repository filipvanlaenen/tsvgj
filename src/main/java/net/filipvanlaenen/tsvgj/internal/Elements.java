package net.filipvanlaenen.tsvgj.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.filipvanlaenen.tsvgj.ElementType;
import net.filipvanlaenen.tsvgj.PaintServerElement;
import net.filipvanlaenen.tsvgj.ShapeElement;
import net.filipvanlaenen.tsvgj.StructuralElement;
import net.filipvanlaenen.tsvgj.Text;

public class Elements {
    /**
     * A list with the elements.
     */
    private final List<ElementType> elements = new ArrayList<ElementType>();

    /**
     * Adds a paint server element.
     *
     * @param shape A pain server element.
     */
    public void add(PaintServerElement paintServerElement) {
        elements.add(paintServerElement);
    }

    /**
     * Adds a shape element.
     *
     * @param shape A shape element.
     */
    public void add(final ShapeElement shape) {
        elements.add(shape);
    }

    /**
     * Adds a structural element.
     *
     * @param structuralElement A structural element.
     */
    public void add(final StructuralElement structuralElement) {
        elements.add(structuralElement);
    }

    /**
     * Adds a text.
     *
     * @param text A text.
     */
    public void add(final Text text) {
        elements.add(text);
    }

    /**
     * Returns a string representation of the elements with the provided
     * indentation.
     *
     * @param indent The indentation.
     * @return A string representation of the elements with the provided
     *         indentation.
     */
    public String asString(final String indent) {
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

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int size() {
        return elements.size();
    }
}
