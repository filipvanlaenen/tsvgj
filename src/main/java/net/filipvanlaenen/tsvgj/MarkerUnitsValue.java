package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.bltxmlepj.CamelCaseAttributeValueEnumeration;

/**
 * An enumeration listing the values for the attribute setting the marker unit.
 *
 * @see <a href="https://www.w3.org/TR/SVG/painting.html#MarkerUnitsAttribute">Document Structure — SVG 2: 13.7.1. The
 *      ‘marker’ element</a>
 */
public enum MarkerUnitsValue implements CamelCaseAttributeValueEnumeration {
    /**
     * Stroke width.
     */
    STROKE_WIDTH,
    /**
     * Object bounding box.
     */
    OBJECT_BOUNDING_BOX
}
