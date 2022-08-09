package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.bltxmlepj.AttributeValueEnumeration;

/**
 * An enumeration listing the values for the <code>preserveAspectRatio</code> <code>meetOrSlice</code> attribute.
 *
 * @see <a href="https://www.w3.org/TR/SVG/coords.html#PreserveAspectRatioAttribute">8.7. The ‘preserveAspectRatio’
 *      attribute</a>
 */
public enum PreserveAspectRatioAlignValue implements AttributeValueEnumeration {
    /**
     * None.
     */
    NONE,
    /**
     * Align with the maximum X and Y value.
     */
    X_MAX_Y_MAX,
    /**
     * Align with the maximum X value and the midpoint Y value.
     */
    X_MAX_Y_MID,
    /**
     * Align with the maximum X value and the minimum Y value.
     */
    X_MAX_Y_MIN,
    /**
     * Align with the midpoint X value and the maximum Y value.
     */
    X_MID_Y_MAX,
    /**
     * Align with the midpoint X and Y value.
     */
    X_MID_Y_MID,
    /**
     * Align with the midpoint X value and the minimum Y value.
     */
    X_MID_Y_MIN,
    /**
     * Align with the minimum X value and the maximum Y value.
     */
    X_MIN_Y_MAX,
    /**
     * Align with the minimum X value and the midpoint Y value.
     */
    X_MIN_Y_MID,
    /**
     * Align with the minimum X and Y value.
     */
    X_MIN_Y_MIN
}
