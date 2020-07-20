package net.filipvanlaenen.tsvgj.internal;

import net.filipvanlaenen.tsvgj.PaintServerElement;

public class ReferringAttribute implements Attribute {
    private final PaintServerElement paintServerElement;

    public ReferringAttribute(PaintServerElement paintServerElement) {
        this.paintServerElement = paintServerElement;
    }

    @Override
    public String asString() {
        return "url(#" + paintServerElement.getReference() + ")";
    }
}
