package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.tsvgj.internal.Elements;

/**
 * A class representing definitions.
 *
 * @see <a href="https://www.w3.org/TR/SVG/struct.html#DefsElement">Document
 *      Structure — SVG 2: 5.4.2. The ‘defs’ element</a>
 */
public class Defs implements StructuralElement {
    /**
     * A list with the elements.
     */
    private final Elements elements = new Elements();

    /**
     * Adds a paint server element.
     *
     * @param paintServerElement A paint server element.
     */
    public void addElement(final PaintServerElement paintServerElement) {
        elements.add(paintServerElement);
        paintServerElement.setId(elements.size());
    }

    /**
     * Returns a string representation of the definitions with the provided
     * indentation.
     *
     * @param indent The indentation.
     * @return A string representation of the definitions with the provided
     *         indentation.
     */
    @Override
    public String asString(final String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent);
        sb.append("<defs");
        if (elements.isEmpty()) {
            sb.append("/>");
        } else {
            sb.append(">\n");
            sb.append(elements.asString(indent + "  "));
            sb.append(indent);
            sb.append("</defs>");
        }
        return sb.toString();
    }
}
