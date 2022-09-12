package lesson_1;

import java.util.Arrays;

public class App4 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4};
        int[] arr2 = new int[]{5, 4, 6, 12};
        int[] resultOfSum = arrayDiff(arr1, arr2);
        String resultToString = Arrays.toString(resultOfSum);
        System.out.println(resultToString);

    }

    public static int[] arrayDiff(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {
            throw new RuntimeException("One of arrays is null");
        }
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Arrays have difference length");
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0 || arr2[i] == 0) {
                throw new RuntimeException("Cannot be divided by zero");
            }
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr2[i] / arr1[i];
        }
        return result;
    }
}
