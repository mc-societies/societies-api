package org.societies.api.math;

public class Vector3d {
    /**
     * Represents the null (0, 0, 0) origin
     */
    public static final Vector3d ORIGIN = new Vector3d(0, 0, 0);

    private final double x;
    private final double y;
    private final double z;


    /**
     * Creates a new Vector3d instance.
     *
     * @param x The x coordinate
     * @param y The y coordinate
     * @param z The z coordinate
     */
    public Vector3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Creates a new copy of an existing Vector3d instance.
     *
     * @param original The original object
     */
    public Vector3d(Vector3d original) {
        this(original.x, original.y, original.z);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public int getRoundedX() {
        return (int) Math.round(x);
    }

    public int getRoundedY() {
        return (int) Math.round(y);
    }

    public int getRoundedZ() {
        return (int) Math.round(z);
    }

    public Vector3d floor() {
        return new Vector3d(getRoundedX(), getRoundedY(), getRoundedZ());
    }

    /**
     * Adds the current vector and a given position vector, producing a result vector.
     *
     * @param other - the other vector.
     * @return The new result vector.
     */
    public Vector3d add(Vector3d other) {
        if (other == null) {
            throw new IllegalArgumentException("other cannot be NULL");
        }

        return new Vector3d(x + other.x, y + other.y, z + other.z);
    }

    /**
     * @see #add(Vector3d)
     */
    public Vector3d add(double x, double y, double z) {
        return new Vector3d(this.x + x, this.y + y, this.z + z);
    }

    /**
     * Substracts the current vector and a given vector, producing a result position.
     *
     * @param other - the other position.
     * @return The new result position.
     */
    public Vector3d subtract(Vector3d other) {
        if (other == null) {
            throw new IllegalArgumentException("other cannot be NULL");
        }

        return new Vector3d(x - other.x, y - other.y, z - other.z);
    }

    /**
     * @see #subtract(Vector3d)
     */
    public Vector3d subtract(double x, double y, double z) {
        return new Vector3d(this.x - x, this.y - y, this.z - z);
    }

    /**
     * Multiply each dimension in the current vector by the given factor.
     *
     * @param factor - multiplier.
     * @return The new result.
     */
    public Vector3d multiply(int factor) {
        return new Vector3d(x * factor, y * factor, z * factor);
    }

    /**
     * Multiply each dimension in the current vector by the given factor.
     *
     * @param factor - multiplier.
     * @return The new result.
     */
    public Vector3d multiply(double factor) {
        return new Vector3d(x * factor, y * factor, z * factor);
    }

    /**
     * Divide each dimension in the current vector by the given divisor.
     *
     * @param divisor - the divisor.
     * @return The new result.
     */
    public Vector3d divide(int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Cannot divide by null.");
        }

        return new Vector3d(x / divisor, y / divisor, z / divisor);
    }

    /**
     * Divide each dimension in the current vector by the given divisor.
     *
     * @param divisor - the divisor.
     * @return The new result.
     */
    public Vector3d divide(double divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Cannot divide by null.");
        }

        return new Vector3d(x / divisor, y / divisor, z / divisor);
    }

    public double distanceSquared(Vector3d otherLocation) {
        double dx = x - otherLocation.x;
        double dy = y - otherLocation.y;
        double dz = z - otherLocation.z;

        return dx * dx + dy * dy + dz * dz;
    }

    public double distanceSquared2d(Vector3d otherLocation) {
        double dx = x - otherLocation.x;
        double dz = z - otherLocation.z;

        return dx * dx + dz * dz;
    }

    public double distance(Vector3d otherLocation) {
        return Math.sqrt(distanceSquared(otherLocation));
    }

    public double distance2d(Vector3d otherLocation) {
        return Math.sqrt(distanceSquared2d(otherLocation));
    }


    /**
     * Retrieve the absolute value of this vector.
     *
     * @return The new result.
     */
    public Vector3d abs() {
        return new Vector3d(Math.abs(x), Math.abs(y), Math.abs(z));
    }

    @Override
    public String toString() {
        return String.format("[x: %s, y: %s, z: %s]", x, y, z);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vector3d)) return false;

        Vector3d vector3d = (Vector3d) o;

        return Double.compare(vector3d.x, x) == 0 && Double.compare(vector3d.y, y) == 0 && Double.compare(vector3d.z, z) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(z);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
