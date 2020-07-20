package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.tsvgj.internal.AttributeValueEnumeration;

/**
 * An enumeration listing the values for the <code>patternUnits</code>
 * attribute.
 *
 * @see <a href=
 *      "https://www.w3.org/TR/SVG/pservers.html#PatternElementPatternUnitsAttribute">Paint
 *      Servers: Solid Colors, Gradients, and Patterns — SVG 2: 14.3.1.
 *      Attributes</a>
 */
public enum PatternUnitsValue implements AttributeValueEnumeration {
    /**
     * User space on use.
     */
    USER_SPACE_ON_USE,
    /**
     * Object bounding box.
     */
    OBJECT_BOUNDING_BOX
}
