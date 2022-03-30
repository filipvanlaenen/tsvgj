package net.filipvanlaenen.tsvgj.internal;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import net.filipvanlaenen.bltxmlepj.Attribute;

/**
 * A class representing a numeric array attribute.
 */
public class NumericArrayAttribute implements Attribute {
    /**
     * The decimal format.
     */
    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#.######",
            DecimalFormatSymbols.getInstance(Locale.US));

    /**
     * The value of the attribute, an array of numbers.
     */
    private final Number[] numbers;

    /**
     * Constructs an attribute with a numeric array value.
     *
     * @param numbers
     *            The numbers.
     */
    NumericArrayAttribute(final Number... numbers) {
        this.numbers = numbers;
    }

    /**
     * Converts the attribute value to a string.
     *
     * @return A string representing the value.
     */
    @Override
    public String asString() {
        List<String> values = new ArrayList<String>();
        for (Number number : numbers) {
            values.add(DECIMAL_FORMAT.format(number));
        }
        return String.join(" ", values);
    }
}
