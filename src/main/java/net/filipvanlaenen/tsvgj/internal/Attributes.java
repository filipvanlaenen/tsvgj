package net.filipvanlaenen.tsvgj.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.filipvanlaenen.tsvgj.ColorKeyword;
import net.filipvanlaenen.tsvgj.PaintServerElement;

/**
 * A class helping to export attributes from SVG elements to a string.
 */
public class Attributes {
    /**
     * A map with all the attributes.
     */
    private final Map<String, Attribute> attributes = new HashMap<String, Attribute>();

    /**
     * Adds a numeric attribute to the set of attributes.
     *
     * @param name
     *            The name of the attribute.
     * @param number
     *            The numeric value of the attribute.
     */
    public void addNumericAttribute(final String name, final Number number) {
        attributes.put(name, new NumericAttribute(name, number));
    }

    /**
     * Adds a color attribute to the set of attributes, the color specified as a
     * hexadecimal integer.
     *
     * @param name
     *            The name of the attribute.
     * @param color
     *            The color specified as a hexadecimal integer.
     */
    public void addColorAttribute(final String name, final Integer color) {
        attributes.put(name, new DeprecatedHexadecimalColorAttribute(name, color));
    }

    /**
     * Adds a color attribute to the set of attributes, the color specified using a
     * color keyword.
     *
     * @param name
     *            The name of the attribute.
     * @param color
     *            The color specified using a color keyword.
     */
    public void addColorAttribute(final String name, final ColorKeyword color) {
        attributes.put(name, new DeprecatedKeywordColorAttribute(name, color));
    }

    /**
     * Adds a string attribute to the set of attributes.
     *
     * @param name
     *            The name of the attribute.
     * @param string
     *            The string value of the attribute.
     */
    public void addStringAttribute(final String name, final String string) {
        attributes.put(name, new StringAttribute(name, string));
    }

    /**
     * Adds a numeric array attribute to the set of attributes.
     *
     * @param name
     *            The name of the attribute.
     * @param numbers
     *            The numeric array value of the attribute.
     */
    public void addNumericArrayAttribute(final String name, final Number... numbers) {
        attributes.put(name, new NumericArrayAttribute(name, numbers));
    }

    /**
     * Adds a reference to a paint server element to the set of attributes.
     *
     * @param name
     *            The name of the attribute.
     * @param paintServerElement
     *            The paint server element to refer to.
     */
    public void addReferringAttribute(final String name, final PaintServerElement paintServerElement) {
        attributes.put(name, new DeprecatedReferringAttribute(paintServerElement));
    }

    /**
     * Converts the set of attributes into a string.
     *
     * @return A string representing all the attributes.
     */
    public String asString() {
        Set<String> attributeNameSet = new HashSet<String>();
        attributeNameSet.addAll(attributes.keySet());
        List<String> attributeNameList = new ArrayList<String>(attributeNameSet);
        Collections.sort(attributeNameList);
        Iterator<String> attributeNameIterator = attributeNameList.iterator();
        List<String> attributeStrings = new ArrayList<String>();
        while (attributeNameIterator.hasNext()) {
            String attributeName = attributeNameIterator.next();
            attributeStrings.add(attributeName + "=\"" + attributes.get(attributeName).asString() + "\"");
        }
        if (attributeStrings.isEmpty()) {
            return "";
        } else {
            return " " + String.join(" ", attributeStrings);
        }
    }
}
