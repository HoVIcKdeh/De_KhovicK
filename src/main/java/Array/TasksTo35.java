package Array;

import java.util.Arrays;
import static java.util.Arrays.stream;

public class TasksTo35 {
    public static int createIndexOfArray(double[] array, double x) {
        int index = 0;
        for (int i = 0; i < array.length; ++i) {
            if (x == array[i]) {
                index = i;
            }
        }
        return index;
    }

    public static void createReverseMaxAndMinArray(double[] array) {
        double max = array[0];
        double min = array[0];
        int indexOfMax = 0;
        int indexOfMin = 0;

        for (int i = 0; i < array.length; ++i) {
            if (max < array[i]) {
                max = array[i];
                indexOfMax = i;
            }
        }
        for (int i = 0; i < array.length; ++i) {
            if (min > array[i]) {
                min = array[i];
                indexOfMin = i;
            }
        }
        array[indexOfMax] = min;
        array[indexOfMin] = max;
    }

    public static void createBitwiseNegationArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ~array[i];
        }
    }

    public static int[] createBitwiseNegationArrayTwo(int[] array) {
        int[] bitwiseNegationArray = new int[array.length];
        for (int i = 0, j = 0; i < array.length; i++, j++) {
            bitwiseNegationArray[j] = ~array[i];
        }
        return bitwiseNegationArray;
    }

    public static int[] createSumOfPairsArray(int[] array) {
        int[] sumOfPairsArray;
        if (array.length % 2 == 0) {
            sumOfPairsArray = new int[array.length / 2];
            for (int i = 0; i < sumOfPairsArray.length; ++i) {
                sumOfPairsArray[i] = array[i * 2] + array[i * 2 + 1];
            }
        } else {
            sumOfPairsArray = new int[array.length / 2 + 1];
            for (int i = 0; i < sumOfPairsArray.length - 1; ++i) {
                sumOfPairsArray[i] = array[i * 2] + array[i * 2 + 1];
                sumOfPairsArray[array.length / 2] = array[array.length - 1];
            }
        }
        return sumOfPairsArray;
    }

    public static boolean[] createBooleanArray(int[] array) {
        boolean[] booleanArray = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            booleanArray[i] = array[i] % 2 == 0;
        }
        return booleanArray;
    }

    public static double[] createFillingArray(int size, int index) {
        double[] array = new double[size];
        for (int i = 0; i < size; ++i) {
            if (i + index >= size) {
                array[i + index - size] = i + 1;
            } else {
                array[i + index] = i + 1;
            }
        }
        return array;
    }

    public static int[][] createTwoDimensionalArray(int size) {
        int[][] twoDimensionalArray = new int[size][];
        int k = 1;
        for (int i = 0; i < size; ++i) {
            twoDimensionalArray[i] = new int[size - i];
            for (int j = 0; j < size - i; ++j) {
                twoDimensionalArray[i][j] = k;
                k++;
            }
        }
        return twoDimensionalArray;
    }

    public static void createWithoutNaNArray(double[] array) {
        for (double v : array) {
            if (Double.isNaN(v)) {
                return;
            }
        }
        Arrays.sort(array);
    }

    public static void createStringArray(String[] array) {
        for (String v : array) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

    public static double createMultiplicationArray(double[] array) {
        double multiplication = 1.;
        for (double v : array) {
            if (!Double.isNaN(v) && v != 0.0 && !Double.isInfinite(v)) {
                multiplication *= v;
            }
        }
        return multiplication;
    }

    public static void createToHexStringFromArray(int[] array) {
        Integer[] wrapperArray = new Integer[array.length];
        for (int i = 0; i < array.length; ++i) {
            wrapperArray[i] = array[i];
        }
        System.out.print("Array in hexadecimal system: ");
        stream(wrapperArray).forEach(i -> System.out.print(Integer.toHexString(i) + " "));
    }
}
