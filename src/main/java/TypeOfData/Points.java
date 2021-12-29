package TypeOfData;

public class Points {
    private final static double DELTA = 0.00005;
    private Points() {
    }

    public static Point sum(Point first, Point second) {
        return new Point(first.getX() + second.getX(), first.getY() + second.getY(), first.getZ() + second.getZ());
    }

    public static Point subtract(Point first, Point second) {
        return new Point(first.getX() - second.getX(), first.getY() - second.getY(), first.getZ() - second.getZ());
    }

    public static Point multiply(Point first, Point second) {
        return new Point(first.getX() * second.getX(), first.getY() * second.getY(), first.getZ() * second.getZ());
    }

    public static Point divide(Point first, Point second) {
        return new Point(first.getX() / second.getX(), first.getY() / second.getY(), first.getZ() / second.getZ());
    }

    private static boolean equalsApproximately(double first, double second) {
        return Math.abs(first - second) < DELTA;
    }
    public static boolean equalsApproximately(Point first, Point second) {
        return equalsApproximately(first.getX(), second.getX()) && equalsApproximately(first.getY(), second.getY()) && equalsApproximately(first.getZ(), second.getZ());
    }
}
