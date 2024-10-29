package net.filipvanlaenen.tsvgj.internal;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import net.filipvanlaenen.bltxmlepj.Attribute;

/**
 * A class representing an attribute containing points.
 */
public final class PointsAttribute implements Attribute {
    /**
     * The decimal format.
     */
    private static final DecimalFormat DECIMAL_FORMAT =
            new DecimalFormat("#.######", DecimalFormatSymbols.getInstance(Locale.US));
    /**
     * The coordinates of the points.
     */
    private final Number[] coordinates;

    /**
     * Constructor using an array with the coordinates of the points as its parameter.
     *
     * @param coordinates An array with the coordinates of the points.
     */
    public PointsAttribute(final Number[] coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String asString() {
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        boolean odd = true;
        for (final Number coordinate : coordinates) {
            if (first) {
                first = false;
            } else {
                sb.append(odd ? " " : ",");
            }
            sb.append(DECIMAL_FORMAT.format(coordinate));
            odd = !odd;
        }
        return sb.toString();
    }
}
