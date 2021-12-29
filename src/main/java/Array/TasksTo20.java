package Array;

import java.util.ArrayList;

public class TasksTo20 {
    public static double[] createArrayOfDivisors(int x) {
        int numberOfDivisors = 0;
        for (int i = 1; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                numberOfDivisors++;
            }
        }
        double[] array = new double[numberOfDivisors];
        int j = 0;
        for (int i = 1; i <= Math.sqrt(x); ++i) {
            if (x % i == 0) {
                array[j++] = i;
            }
        }
        return array;
    }

    public static double[] createSymmetricArray(int size) {
        double[] array = new double[size];
        int index;
        if (size % 2 != 0) {
            index = (size / 2) + 1;
        } else {
            index = size / 2;
        }
        for (int i = 1; i <= index; i++) {
            array[i - 1] = i;
            array[size - i] = i;
        }
        return array;
    }

    public static void createReverseArray(double[] array) {
        for (int i = 0; i < array.length; ++i) {
            array[i] = array[i] * (-1);
        }
    }

    public static boolean createCheckingArray(double[] array, double x) {
        for (double v : array) {
            if (v == x) {
                return true;
            }
        }
        return false;
    }

    public static boolean createCheckingNullArray(Integer[] array) {
        for (Integer x : array) {
            if (x == null) {
                return true;
            }
        }
        return false;
    }

    public static int createCheckingEvenArray(double[] array) {
        int count = 0;
        for (double v : array) {
            if (v % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static double createMaxArray(double[] array) {
        double max = array[0];
        for (double v : array) {
            if (max < v) {
                max = v;
            }
        }
        return max;
    }

    public static double createSumArray(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; ++i) {
            if (i % 2 == 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static boolean createCheckingDivisorsArray(double[] array) {
        int divisibleByFirstElement = 0;
        int divisibleByLastElement = 0;
        for (double v : array) {
            if (v % array[0] == 0) {
                divisibleByFirstElement++;
            }
            if (v % array[array.length - 1] == 0) {
                divisibleByLastElement++;
            }
        }
        return divisibleByFirstElement > divisibleByLastElement;
    }

    public static ArrayList<Integer> createPrimeArray(int number) {
        ArrayList<Integer> primeArray = new ArrayList<>();
        for (int i = 2; i <= number; ++i) {
            int k = 0;
            for (int j = 2; j < number; ++j) {
                if (i % j == 0) {
                    k++;
                }
            }
            if (k == 1) {
                primeArray.add(i);
            }
        }
        return primeArray;
    }
}
