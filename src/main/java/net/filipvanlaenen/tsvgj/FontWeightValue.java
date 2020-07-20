package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.tsvgj.internal.AttributeValueEnumeration;

/**
 * An enumeration listing the values for the <code>font-weight</code> attribute.
 */
public enum FontWeightValue implements AttributeValueEnumeration {

    /**
     * Normal text.
     */
    NORMAL,
    /**
     * Bold text.
     */
    BOLD,
    /**
     * Bolder text.
     */
    BOLDER,
    /**
     * Lighter text.
     */
    LIGHTER,
    /**
     * Numeric font weight value 100.
     */
    W100(100),
    /**
     * Numeric font weight value 200.
     */
    W200(200),
    /**
     * Numeric font weight value 300.
     */
    W300(300),
    /**
     * Numeric font weight value 400.
     */
    W400(400),
    /**
     * Numeric font weight value 500.
     */
    W500(500),
    /**
     * Numeric font weight value 600.
     */
    W600(600),
    /**
     * Numeric font weight value 700.
     */
    W700(700),
    /**
     * Numeric font weight value 800.
     */
    W800(800),
    /**
     * Numeric font weight value 900.
     */
    W900(900);

    /**
     * The numeric value of the font weight, if it is a numeric value.
     */
    private final Integer numericValue;

    /**
     * Constructs a non-numeric font weight value.
     */
    FontWeightValue() {
        this(null);
    }

    /**
     * Constructs a numeric font weight value.
     *
     * @param numericValue
     *            The numeric value.
     */
    FontWeightValue(final Integer numericValue) {
        this.numericValue = numericValue;
    }

    /**
     * Overridden to use the numeric value, if the font weight is a numeric value.
     */
    @Override
    public String toString() {
        return numericValue == null ? super.toString() : "" + numericValue;
    }

}
