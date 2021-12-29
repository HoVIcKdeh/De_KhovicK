package Array;

import org.testng.annotations.Test;

import static java.lang.Double.NaN;
import static java.lang.Double.POSITIVE_INFINITY;
import static org.testng.Assert.*;

public class TasksTo35Test {
    private static final double DELTA = 0.0001;


    public double[] firstArray = {12., 14., 34., 28.6, 57.2};
    public int[] secondArray = {1, 2, 3, 4, 5, 6};
    public int[] thirdArray = {0, 5, 10, 15};
    public int[] fourthArray = {2, 4, 6, 7, 12, 15};
    public int[] fifthArray = {-3, -4, -2, -6, 0};
    public int[][] sixthArray = TasksTo35.createTwoDimensionalArray(3);
    public double[] seventhArray = {-1., 0., -2.2, 9., 7.7};
    public double[] eightArray = {-1., 0., -2.2, 9., NaN};
    public double[] ninthArray = {1.1, -3., NaN, 2., 0., POSITIVE_INFINITY};


    @Test
    public void testCreateIndexOfArray() {
        assertEquals(TasksTo35.createIndexOfArray(firstArray, 28.6), 3);
        assertEquals(TasksTo35.createIndexOfArray(firstArray, 14.), 1);
    }

    @Test
    public void testCreateReverseMaxAndMinArray() {
        TasksTo35.createReverseMaxAndMinArray(firstArray);
        assertEquals(firstArray, new double[]{57.2, 14., 34., 28.6, 12.});
    }

    @Test
    public void testCreateBitwiseNegationArray() {
        TasksTo35.createBitwiseNegationArray(secondArray);
        assertEquals(secondArray, new int[]{-2, -3, -4, -5, -6, -7});
    }

    @Test
    public void testCreateBitwiseNegationArrayTwo() {
        assertEquals(TasksTo35.createBitwiseNegationArrayTwo(thirdArray), new int[]{-1, -6, -11, -16});
    }

    @Test
    public void testCreateSumOfPairsArray() {
        int[] oneArray = TasksTo35.createSumOfPairsArray(fourthArray);
        int[] twoArray = TasksTo35.createSumOfPairsArray(fifthArray);

        assertEquals(oneArray, new int[]{6, 13, 27});
        assertEquals(twoArray, new int[]{-7, -8, 0});
    }

    @Test
    public void testCreateBooleanArray() {
        boolean[] oneArray = TasksTo35.createBooleanArray(fourthArray);
        assertEquals(oneArray, new boolean[]{true, true, true, false, true, false});
    }

    @Test
    public void testCreateFillingArray() {
        assertEquals(TasksTo35.createFillingArray(5, 3), new double[]{3, 4, 5, 1, 2});
    }

    @Test
    public void testCreateTwoDimensionalArray() {
        assertEquals(sixthArray[0], new int[]{1, 2, 3});
        assertEquals(sixthArray[1], new int[]{4, 5});
        assertEquals(sixthArray[2], new int[]{6});
    }

    @Test
    public void testCreateWithoutNaNArray() {
        TasksTo35.createWithoutNaNArray(seventhArray);
        assertEquals(seventhArray, new double[]{-2.2, -1., 0.0, 7.7, 9.});

        TasksTo35.createWithoutNaNArray(eightArray);
        assertEquals(eightArray[0], -1.);
        assertEquals(eightArray[1], 0.);
        assertEquals(eightArray[2], -2.2);
        assertEquals(eightArray[3], 9.);
        assertEquals(eightArray[4], NaN);
    }

    @Test
    public void testCreateStringArray() {
        String[] array = new String[]{"This", "method", "works!"};
        TasksTo35.createStringArray(array);
    }

    @Test
    public void testCreateMultiplicationArray() {
        assertEquals(TasksTo35.createMultiplicationArray(ninthArray), -6.6, DELTA);
    }

    @Test
    public void testCreateToHexStringFromArray() {
        TasksTo35.createToHexStringFromArray(thirdArray);
    }

}