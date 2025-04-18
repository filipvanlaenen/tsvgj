package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.bltxmlepj.CamelCaseAttributeValueEnumeration;

/**
 * An enumeration listing the values for the attribute setting the coordinate system for attributes.
 *
 * @see <a href= "https://www.w3.org/TR/SVG/pservers.html#PatternElementPatternUnitsAttribute">Paint Servers: Solid
 *      Colors, Gradients, and Patterns — SVG 2: 14.3.1. Attributes</a>
 * @see <a href= "https://www.w3.org/TR/SVG/pservers.html#RadialGradientElementGradientUnitsAttribute">Paint Servers:
 *      Solid Colors, Gradients, and Patterns — SVG 2: 14.2.3.1. Attributes</a>
 */
public enum CoordinateSystemUnitsValue implements CamelCaseAttributeValueEnumeration {
    /**
     * User space on use.
     */
    USER_SPACE_ON_USE,
    /**
     * Object bounding box.
     */
    OBJECT_BOUNDING_BOX
}
