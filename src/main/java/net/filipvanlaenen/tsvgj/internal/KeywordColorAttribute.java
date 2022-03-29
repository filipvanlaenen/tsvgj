package net.filipvanlaenen.tsvgj.internal;

import net.filipvanlaenen.bltxmlepj.Attribute;
import net.filipvanlaenen.tsvgj.ColorKeyword;

public class KeywordColorAttribute implements Attribute {
    /**
     * The color keyword.
     */
    private final ColorKeyword color;

    public KeywordColorAttribute(final ColorKeyword color) {
        this.color = color;
    }

    @Override
    public String asString() {
        return color.toString().toLowerCase();
    }
}
