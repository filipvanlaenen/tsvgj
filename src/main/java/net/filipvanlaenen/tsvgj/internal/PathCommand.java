package net.filipvanlaenen.tsvgj.internal;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 * An interface describing a path command.
 */
interface PathCommand {
    /**
     * The decimal format.
     */
    DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#.######", DecimalFormatSymbols.getInstance(Locale.US));

    /**
     * Returns a string representation of the path command.
     *
     * @return A string representation of the path command.
     */
    String asString();
}
