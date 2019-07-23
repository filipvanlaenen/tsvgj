package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.tsvgj.internal.AttributeValueEnumeration;

/**
 * An enumeration listing the values for the <code>font-weight</code> attribute.
 */
public enum FontWeightValues implements AttributeValueEnumeration {

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
    W100 {
        /**
         * Overridden to produce the numeric value.
         */
        @Override
        public String toString() {
            return "100";
        }
    },
    /**
     * Numeric font weight value 200.
     */
    W200 {
        /**
         * Overridden to produce the numeric value.
         */
        @Override
        public String toString() {
            return "200";
        }
    },
    /**
     * Numeric font weight value 300.
     */
    W300 {
        /**
         * Overridden to produce the numeric value.
         */
        @Override
        public String toString() {
            return "300";
        }
    },
    /**
     * Numeric font weight value 400.
     */
    W400 {
        /**
         * Overridden to produce the numeric value.
         */
        @Override
        public String toString() {
            return "400";
        }
    },
    /**
     * Numeric font weight value 500.
     */
    W500 {
        /**
         * Overridden to produce the numeric value.
         */
        @Override
        public String toString() {
            return "500";
        }
    },
    /**
     * Numeric font weight value 600.
     */
    W600 {
        /**
         * Overridden to produce the numeric value.
         */
        @Override
        public String toString() {
            return "600";
        }
    },
    /**
     * Numeric font weight value 700.
     */
    W700 {
        /**
         * Overridden to produce the numeric value.
         */
        @Override
        public String toString() {
            return "700";
        }
    },
    /**
     * Numeric font weight value 800.
     */
    W800 {
        /**
         * Overridden to produce the numeric value.
         */
        @Override
        public String toString() {
            return "800";
        }
    },
    /**
     * Numeric font weight value 900.
     */
    W900 {
        /**
         * Overridden to produce the numeric value.
         */
        @Override
        public String toString() {
            return "900";
        }
    }

}
