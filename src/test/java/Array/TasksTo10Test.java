package Array;

import Exeptions.Tasks;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TasksTo10Test {
    public int[] firstArray = TasksTo10.createArray(14);
    public int[] secondArray = TasksTo10.createArray(5);
    public int[] thirdArray = TasksTo10.createArray(0);

    public int[] fourthArray = TasksTo10.createFilledArray(14);
    public int[] fifthArray = TasksTo10.createFilledArray(5);

    public int[] sixthArray = TasksTo10.createOddFilledArray(3);
    public int[] seventhArray = TasksTo10.createEvenFilledArray(5);

    public int[] eighthArray = TasksTo10.createFibonacciFilledArray(14);
    public int[] ninthArray = TasksTo10.createSqrArray(20);

    public double[] tenthArray = TasksTo10.createEquationArray(1, 2, 1);
    public double[] eleventhArray = TasksTo10.createEquationArray(3, -2, 1);
    public double[] twelfthArray = TasksTo10.createEquationArray(-1, -7, 8);

    public int[] thirteenthArray = TasksTo10.createWithoutThreeArray(7);
    public double[] fourteenthArray = TasksTo10.createArrayOfArithmeticProgression(5, 0, 2);
    public double[] fifteenthArray = TasksTo10.createArrayOfGeometricProgression(5, 8, 0.5);

    @Test
    public void testCreateArray() {
        assertEquals(firstArray.length, 14);
        assertEquals(secondArray.length, 5);
        assertEquals(thirdArray.length, 0);
    }

    @Test
    public void testCreateFilledArray() {
        assertEquals(fourthArray[0], 2);
        assertEquals(fourthArray[13], 2);
        assertEquals(fourthArray[5], 1);
        assertEquals(fifthArray[0], 2);
        assertEquals(fifthArray[4], 2);
        assertEquals(fifthArray[3], 1);
    }

    @Test
    public void testCreateOddFilledArray() {
        assertEquals(sixthArray[0], 1);
        assertEquals(sixthArray[1], 3);
        assertEquals(sixthArray[2], 5);
    }

    @Test
    public void testCreateEvenFilledArray() {
        assertEquals(seventhArray[0], 10);
        assertEquals(seventhArray[1], 8);
        assertEquals(seventhArray[2], 6);
        assertEquals(seventhArray[3], 4);
        assertEquals(seventhArray[4], 2);
    }

    @Test
    public void testCreateFibonacciFilledArray() {
        assertEquals(eighthArray[3], 2);
        assertEquals(eighthArray[7], 13);
        assertEquals(eighthArray[10], 55);
        assertEquals(eighthArray[12], 144);
        assertEquals(eighthArray[13], 233);
    }

    @Test
    public void testCreateSqrArray() {
        assertEquals(ninthArray[0], 0);
        assertEquals(ninthArray[7], 49);
        assertEquals(ninthArray[10], 100);
        assertEquals(ninthArray[15], 225);
        assertEquals(ninthArray[19], 361);
    }

    @Test
    public void testCreateEquationArray() {
        assertEquals(tenthArray.length, 1);
        assertEquals(eleventhArray.length, 0);
        assertEquals(twelfthArray.length, 2);
        assertEquals(tenthArray[0], -1.0);
        assertEquals(twelfthArray[0], -8.0);
        assertEquals(twelfthArray[1], 1.0);
    }

    @Test
    public void testCreateWithoutThreeArray() {
        assertEquals(thirteenthArray[0], 1);
        assertEquals(thirteenthArray[1], 2);
        assertEquals(thirteenthArray[2], 4);
        assertEquals(thirteenthArray[3], 5);
        assertEquals(thirteenthArray[4], 7);
        assertEquals(thirteenthArray[5], 8);
        assertEquals(thirteenthArray[6], 10);
    }

    @Test
    public void testCreateArrayOfArithmeticProgression() {
        assertEquals(fourteenthArray[0], 0.0);
        assertEquals(fourteenthArray[1], 2.0);
        assertEquals(fourteenthArray[2], 4.0);
        assertEquals(fourteenthArray[3], 6.0);
        assertEquals(fourteenthArray[4], 8.0);
    }

    @Test
    public void testCreateArrayOfGeometricProgression() {
        assertEquals(fifteenthArray[0], 8.0);
        assertEquals(fifteenthArray[1], 4.0);
        assertEquals(fifteenthArray[2], 2.0);
        assertEquals(fifteenthArray[3], 1.0);
        assertEquals(fifteenthArray[4], 0.5);
    }
}