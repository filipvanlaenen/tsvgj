package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.tsvgj.internal.ArcToCommand;
import net.filipvanlaenen.tsvgj.internal.Attributes;
import net.filipvanlaenen.tsvgj.internal.LineToCommand;
import net.filipvanlaenen.tsvgj.internal.MoveToCommand;
import net.filipvanlaenen.tsvgj.internal.PathDefinition;

public class Path implements GraphicsElement, ShapeElement {
    /**
     * The attributes.
     */
    private final Attributes attributes = new Attributes();

    private final PathDefinition definition = new PathDefinition();

    public Path() {
        attributes.addPathDefinitionAttribute("d", definition);
    }

    public Path arcTo(final Number rx, final Number ry, final Number xAxisRotation,
            final LargeArcFlagValues largeArcFlag, final SweepFlagValues sweepFlag, final Number cx, final Number cy) {
        definition.add(new ArcToCommand(rx, ry, xAxisRotation, largeArcFlag, sweepFlag, cx, cy));
        return this;
    }

    public Path lineTo(final Number x, final Number y) {
        definition.add(new LineToCommand(x, y));
        return this;
    }

    public Path moveTo(final Number x, final Number y) {
        definition.add(new MoveToCommand(x, y));
        return this;
    }

    /**
     * Sets the stroke color of the path.
     *
     * @param stroke
     *            The stroke color of the path.
     * @return The instance called.
     */
    public Path stroke(final Integer stroke) {
        attributes.addColorAttribute("stroke", stroke);
        return this;
    }

    /**
     * Sets the stroke width of the path.
     *
     * @param strokeWidth
     *            The stroke width of the path.
     * @return The instance called.
     */
    public Path strokeWidth(final Number strokeWidth) {
        attributes.addNumericAttribute("stroke-width", strokeWidth);
        return this;
    }

    /**
     * Returns a string representation of the path with the provided indentation.
     *
     * @param indent
     *            The indentation.
     * @return A string representation of the path with the provided indentation.
     */
    @Override
    public String asString(final String indent) {
        return indent + "<path" + attributes.asString() + "/>";
    }

    public enum LargeArcFlagValues {
        LARGE_ARC(1), SMALL_ARC(0);
        private final int value;

        LargeArcFlagValues(final int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public enum SweepFlagValues {
        POSITIVE_ANGLE(1), NEGATIVE_ANGLE(0);
        private final int value;

        SweepFlagValues(final int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

}
