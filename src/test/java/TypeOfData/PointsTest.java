package TypeOfData;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import static org.testng.Assert.*;

public class PointsTest {
    private static final double DELTA = 0.0001;

    Point firstPoint = new Point(2, 4, 6);
    Point secondPoint = new Point(1, 2, 3);

    Point sumPoint = Points.sum(firstPoint, secondPoint);
    Point subtractPoint = Points.subtract(firstPoint, secondPoint);
    Point multiplyPoint = Points.multiply(firstPoint, secondPoint);
    Point dividePoint = Points.divide(firstPoint, secondPoint);

    @Test
    public void testsSum() {
        assertTrue(Points.equalsApproximately(sumPoint, new Point(3.0, 6.0, 9.0)));
        assertTrue(Points.equalsApproximately(Points.sum(new Point(-2.0, 3.5, -14.7), new Point(-12.0, -0.5, 24.6)), new Point(-14.0, 3.0, 9.9)));
    }

    @Test
    public void testSubtract() {
        assertTrue(Points.equalsApproximately(subtractPoint, new Point(1.0, 2.0, 3.0)));
        assertTrue(Points.equalsApproximately(Points.subtract(new Point(-12.7, 6.54, 38.2), new Point(-1.0, 26.5, 13.0)), new Point(-11.7, -19.96, 25.2)));
    }

    @Test
    public void testMultiply() {
        assertTrue(Points.equalsApproximately(multiplyPoint, new Point(2.0, 8.0, 18.0)));
        assertTrue(Points.equalsApproximately(Points.multiply(new Point(12.0, 0.2, -6.1), new Point(1.0, -10.0, 3.0)), new Point(12, -2, -18.3)));
    }

    @Test
    public void testDivide() {
        assertTrue(Points.equalsApproximately(dividePoint, new Point(2.0, 2.0, 2.0)));
        assertTrue(Points.equalsApproximately(Points.divide(new Point(12.0, -44.10, 36.3), new Point(-2, -4, -3)), new Point(-6, 11.025, -12.1)));
    }
}