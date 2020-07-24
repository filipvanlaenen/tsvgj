package net.filipvanlaenen.tsvgj;

import net.filipvanlaenen.tsvgj.internal.Attribute;

/**
 * Abstract class representing a transformation.
 */
public abstract class Transform implements Attribute {

    /**
     * Class representing a rotation transformation.
     */
    private static class Rotation extends Transform {
        /**
         * The angle on which to rotate.
         */
        private final Number angle;
        /**
         * The x coordinate of the rotation center.
         */
        private final Number cx;
        /**
         * The y coordinate of the rotation center.
         */
        private final Number cy;

        /**
         * Constructs a rotation, using an angle only.
         *
         * @param angle The angle on which to rotate.
         */
        Rotation(final Number angle) {
            this(angle, null, null);
        }

        /**
         * Constructs a rotation.
         *
         * @param angle The angle on which to rotate.
         * @param cx    The x coordinate of the rotation center.
         * @param cy    The y coordinate of the rotation center.
         */
        Rotation(final Number angle, final Number cx, final Number cy) {
            this.angle = angle;
            this.cx = cx;
            this.cy = cy;
        }

        @Override
        public String asString() {
            StringBuilder sb = new StringBuilder();
            sb.append("rotate(");
            sb.append(DECIMAL_FORMAT.format(angle));
            if (cx != null) {
                sb.append(" " + DECIMAL_FORMAT.format(cx));
                sb.append(",");
                sb.append(DECIMAL_FORMAT.format(cy));
            }
            sb.append(")");
            return sb.toString();
        }
    }

    /**
     * Constructs a rotation with an angle only.
     *
     * @param angle The angle on which to rotate.
     * @return A rotation.
     */
    public static Transform rotate(final Number angle) {
        return new Rotation(angle);
    }

    /**
     * Constructs a rotation with an angle and a rotation center.
     *
     * @param angle The angle on which to rotate.
     * @param cx    The x coordinate of the rotation center.
     * @param cy    The y coordinate of the rotation center.
     * @return A rotation.
     */
    public static Transform rotate(final Number angle, final Number cx, final Number cy) {
        return new Rotation(angle, cx, cy);
    }
}
