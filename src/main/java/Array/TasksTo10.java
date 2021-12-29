package Array;

public class TasksTo10 {
    public static int[] createArray(int size) {
        return new int[size];
    }

    public static int[] createFilledArray(int size) {
        int[] array = new int[size];
        array[0] = 2;
        array[size - 1] = 2;
        for (int i = 1; i < size - 1; ++i) {
            array[i] = 1;
        }
        return array;
    }

    public static int[] createOddFilledArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; ++i) {
            array[i] = 2 * i + 1;
        }
        return array;
    }

    public static int[] createEvenFilledArray(int size) {
        int[] array = new int[size];
        for (int i = size - 1; i >= 0; --i) {
            array[i] = (size - i) * 2;
        }
        return array;
    }

    public static int[] createFibonacciFilledArray(int size) {
        int[] array = new int[size];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < size; ++i) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array;
    }

    public static int[] createSqrArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; ++i) {
            array[i] = i * i;
        }
        return array;
    }

    public static double[] createEquationArray(double a, double b, double c) {
        double d = b * b - 4 * a * c;
        if (d == 0) {
            double x = -b / (2 * a);
            return new double[]{x};
        } else if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            return new double[]{x1, x2};
        } else {
            return new double[0];
        }
    }

    public static int[] createWithoutThreeArray(int size) {
        int[] array = new int[size];
        int counter = 0;
        for (int i = 0; array[size - 1] == 0; i++) {
            if (i % 3 == 0) {
                counter++;
                continue;
            }
            array[i - counter] = i;
        }
        return array;
    }

    public static double[] createArrayOfArithmeticProgression(int size, double a, double d) {
        double[] array = new double[size];
        for (int i = 0; i < size; ++i) {
            array[i] = a + d * (i);
        }
        return array;
    }

    public static double[] createArrayOfGeometricProgression(int size, double b, double q) {
        double[] array = new double[size];
        for (int i = 0; i < size; ++i) {
            array[i] = b * Math.pow(q, i);
        }
        return array;
    }
}
