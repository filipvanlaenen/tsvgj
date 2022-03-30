package net.filipvanlaenen.tsvgj.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.filipvanlaenen.tsvgj.SvgElement;
import net.filipvanlaenen.tsvgj.PaintServerElement;
import net.filipvanlaenen.tsvgj.ShapeElement;
import net.filipvanlaenen.tsvgj.StructuralElement;
import net.filipvanlaenen.tsvgj.Text;

/**
 * A class helping to export elements contained by other SVG elements to a
 * string.
 */
public class DeprecatedElements {
    /**
     * A list with the elements.
     */
    private final List<SvgElement> elements = new ArrayList<SvgElement>();

    /**
     * Adds a paint server element.
     *
     * @param paintServerElement A pain server element.
     */
    public void add(final PaintServerElement paintServerElement) {
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
     * Returns whether the list of elements is empty.
     *
     * @return True if the list of elements is empty.
     */
    public boolean isEmpty() {
        return elements.isEmpty();
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
        Iterator<SvgElement> elementIterator = elements.iterator();
        while (elementIterator.hasNext()) {
            SvgElement element = elementIterator.next();
            elementStrings.add(element.asString(indent));
        }
        if (elementStrings.isEmpty()) {
            return "";
        } else {
            return String.join("\n", elementStrings) + "\n";
        }
    }

    /**
     * Returns the number of elements currently in the list.
     *
     * @return The number of elements currently in the list.
     */
    public int size() {
        return elements.size();
    }
}
