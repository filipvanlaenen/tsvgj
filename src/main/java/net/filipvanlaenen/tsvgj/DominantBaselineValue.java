package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.bltxmlepj.KebabCaseAttributeValueEnumeration;

/**
 * An enumeration listing the values for the <code>dominant-baseline</code> attribute.
 *
 * @see <a href="https://www.w3.org/TR/css-inline-3/#dominant-baseline-property>CSS Text Module Level 3: 4.1. Dominant
 *      Baselines: the dominant-baseline property</a>
 */
public enum DominantBaselineValue implements KebabCaseAttributeValueEnumeration {
    /**
     * Auto.
     */
    AUTO,
    /**
     * Use the text-under baselines.
     */
    TEXT_BOTTOM,
    /**
     * Use the alphabetic baselines.
     */
    ALPHABETIC,
    /**
     * Use the ideographic-under baselines.
     */
    IDEOGRAPHIC,
    /**
     * Use the x-middle baselines.
     */
    MIDDLE,
    /**
     * Use the central baselines.
     */
    CENTRAL,
    /**
     * Use the math baselines.
     */
    MATHEMATICAL,
    /**
     * Use the hanging baselines.
     */
    HANGING,
    /**
     * Use the text-over baselines.
     */
    TEXT_TOP
}
