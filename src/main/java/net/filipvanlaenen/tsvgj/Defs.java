package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.tsvgj.internal.Elements;

public class Defs implements StructuralElement {
    /**
     * A list with the elements.
     */
    private final Elements elements = new Elements();

    public void addElement(PaintServerElement paintServerElement) {
        elements.add(paintServerElement);
        paintServerElement.setId(elements.size());
    }

    @Override
    public String asString(String indent) {
        return indent + "<defs"
                + (elements.isEmpty() ? "/>" : ">\n" + elements.asString(indent + "  ") + indent + "</defs>");
    }
}
