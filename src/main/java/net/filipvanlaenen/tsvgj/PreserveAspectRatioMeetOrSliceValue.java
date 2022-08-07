package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.bltxmlepj.AttributeValueEnumeration;

/**
 * An enumeration listing the values for the <code>preserveAspectRatio</code> <code>align</code> attribute.
 *
 * @see <a href="https://www.w3.org/TR/SVG/coords.html#PreserveAspectRatioAttribute">8.7. The ‘preserveAspectRatio’
 *      attribute</a>
 */
public enum PreserveAspectRatioMeetOrSliceValue implements AttributeValueEnumeration {
    /**
     * None.
     */
    NONE, X_MAX_Y_MAX, X_MAX_Y_MID, X_MAX_Y_MIN, X_MID_Y_MAX, X_MID_Y_MID, X_MID_Y_MIN, X_MIN_Y_MAX, X_MIN_Y_MID,
    X_MIN_Y_MIN
}
