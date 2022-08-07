package net.filipvanlaenen.tsvgj.internal;

import java.util.ArrayList;
import java.util.List;

import net.filipvanlaenen.bltxmlepj.Attribute;
import net.filipvanlaenen.bltxmlepj.AttributeValueEnumeration;

/**
 * A class representing an enumeration array attribute.
 */
public class EnumerationArrayAttribute implements Attribute {
    /**
     * The value of the attribute, an array of enumeration values.
     */
    private final AttributeValueEnumeration[] enumerationValues;

    /**
     * Constructs an attribute with an enumeration array value.
     *
     * @param enumerationValues
     *            The enumeration values.
     */
    EnumerationArrayAttribute(final AttributeValueEnumeration... enumerationValues) {
        this.enumerationValues = enumerationValues;
    }

    /**
     * Converts the attribute value to a string.
     *
     * @return A string representing the value.
     */
    @Override
    public String asString() {
        List<String> values = new ArrayList<String>();
        for (AttributeValueEnumeration enumerationValue : enumerationValues) {
            values.add(enumerationValue.toString());
        }
        return String.join(" ", values);
    }
}
