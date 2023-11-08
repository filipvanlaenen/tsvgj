package net.filipvanlaenen.tsvgj.internal;

import java.util.stream.Collectors;

import net.filipvanlaenen.bltxmlepj.Attribute;
import net.filipvanlaenen.bltxmlepj.AttributeValueEnumeration;
import net.filipvanlaenen.kolektoj.OrderedCollection;

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
     * @param enumerationValues The enumeration values.
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
        return OrderedCollection.of(enumerationValues).stream().map(AttributeValueEnumeration::asString)
                .collect(Collectors.joining(" "));
    }
}
