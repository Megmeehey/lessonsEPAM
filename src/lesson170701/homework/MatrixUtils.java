package lesson170701.homework;

import java.util.Arrays;
import java.util.Random;

public class MatrixUtils {
    public static int count(int[][] matrix, int max) {
        int r = 0;
        int s = 0;
        OUTER:
        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            for (int j = 0; j < row.length; j++) {
                r++;
                s += row[j];
                System.out.println(s);
                if (s > max) {
                    break OUTER;
                }
            }
        }

        return r;
    }

    public static int sumIfNoNegatives(int[][] matrix) {
        int wholeSum = 0;
        int currentSum;

        OUTER:
        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            currentSum = 0;
            for (int j = 0; j < row.length; j++) {
                if (row[j] >= 0) {
                    currentSum += row[j];
                } else {
                    continue OUTER;
                }
            }
            // here we can print out currentSum of this particular row, if needed.
            wholeSum += currentSum;
        }

        return wholeSum;
    }

    public static void printRowNoNegativesSums(int[][] matrix) {
        int currentSum;
        boolean found = false;

        OUTER:
        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            currentSum = 0;
            for (int j = 0; j < row.length; j++) {
                if (row[j] >= 0) {
                    currentSum += row[j];
                } else {
                    continue OUTER;
                }
            }
            System.out.println("Found this row w\\o negatives: " + Arrays.toString(matrix[i]) + " with sum = " + currentSum);
            found = true;
        }

        if (!found) {
            System.out.println("No such rows found :( ");
        }
    }


    public static int[][] generate2DMatrix(int numOfColumns, int numOfRows) {
        Random rnd = new Random();
        int[][] matrix = new int[numOfColumns][numOfRows];

        for (int i = 0; i < numOfColumns; i++) {
            for (int j = 0; j < numOfRows; j++) {
                matrix[i][j] = rnd.nextInt();
            }
        }
        return matrix;
    }

    public static int[][] generate2DMatrix(int numOfColumns, int numOfRows, int max) {
        Random rnd = new Random();
        int[][] matrix = new int[numOfColumns][numOfRows];

        for (int i = 0; i < numOfColumns; i++) {
            for (int j = 0; j < numOfRows; j++) {
                matrix[i][j] = rnd.nextInt() % max;
            }
        }
        return matrix;
    }

    public static void print2DMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}