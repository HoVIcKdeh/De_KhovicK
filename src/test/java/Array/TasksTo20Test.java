package Array;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.testng.Assert.*;


public class TasksTo20Test {
    private final double DELTA = 0.0001;

    public double[] firstArray = TasksTo20.createArrayOfDivisors(45);
    public double[] secondArray = TasksTo20.createSymmetricArray(7);
    public double[] thirdArray = TasksTo20.createSymmetricArray(8);

    Integer[] fourthArray = {1, 2, 3, null, 5, 6};
    Integer[] fifthArray = {1, 2, 3, 4, 5, 6};

    public double[] sixthArray = {1, 12, 14, 36, 6};
    public double[] seventhArray = {15, 12, 14, 36, 6};

    @Test
    public void testCreateArrayOfDivisors() {
        assertEquals(firstArray.length, 3);
        assertEquals(firstArray[0], 1.);
        assertEquals(firstArray[1], 3.);
        assertEquals(firstArray[2], 5.);
    }

    @Test
    public void testCreateSymmetricArray() {
        double[] oneArray = new double[]{1., 2., 3., 4., 3., 2., 1.};
        assertTrue(Arrays.equals(secondArray, oneArray));

        double[] twoArray = new double[]{1., 2., 3., 4., 4., 3., 2., 1.};
        assertTrue(Arrays.equals(thirdArray, twoArray));
    }

    @Test
    public void testCreateReverseArray() {
        double[] array = {1.8, 2.4, 3.2};
        TasksTo20.createReverseArray(array);
        assertTrue(Arrays.equals(array, new double[]{-1.8, -2.4, -3.2}));
    }

    @Test
    public void testCreateCheckingArray() {
        assertTrue(TasksTo20.createCheckingArray(secondArray, 2.));
        assertFalse(TasksTo20.createCheckingArray(secondArray, 5.));
    }

    @Test
    public void testCreateCheckingNullArray() {
        assertTrue(TasksTo20.createCheckingNullArray(fourthArray));
        assertFalse(TasksTo20.createCheckingNullArray(fifthArray));
    }

    @Test
    public void testCreateCheckingEvenArray() {
        assertEquals(TasksTo20.createCheckingEvenArray(firstArray), 0, DELTA);
        assertEquals(TasksTo20.createCheckingEvenArray(secondArray), 3, DELTA);
    }

    @Test
    public void testCreateMaxArray() {
        assertEquals(TasksTo20.createMaxArray(firstArray), 5., DELTA);
        assertEquals(TasksTo20.createMaxArray(secondArray), 4., DELTA);
    }

    @Test
    public void testCreateSumArray() {
        assertEquals(TasksTo20.createSumArray(firstArray), 6., DELTA);
        assertEquals(TasksTo20.createSumArray(thirdArray), 10., DELTA);
    }

    @Test
    public void testCreateCheckingDivisorsArray() {
        assertTrue(TasksTo20.createCheckingDivisorsArray(sixthArray));
        assertFalse(TasksTo20.createCheckingDivisorsArray(seventhArray));
    }

    @Test
    public void testCreateSimpleArray() {
        ArrayList<Integer> primeArray = TasksTo20.createPrimeArray(21);
        assertEquals(primeArray.size(), 8);
        assertEquals(primeArray.get(0), 2.0, DELTA);
        assertEquals(primeArray.get(1), 3.0, DELTA);
        assertEquals(primeArray.get(2), 5.0, DELTA);
        assertEquals(primeArray.get(3), 7.0, DELTA);
        assertEquals(primeArray.get(4), 11.0, DELTA);
        assertEquals(primeArray.get(5), 13.0, DELTA);
        assertEquals(primeArray.get(6), 17.0, DELTA);
        assertEquals(primeArray.get(7), 19.0, DELTA);
    }

}