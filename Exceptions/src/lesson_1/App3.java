package lesson_1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class App3 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4};
        int[] arr2 = new int[]{5, 6, 7, 8};
        int[] resultOfSum = arrayDiff(arr1, arr2);
        String resultToString = Arrays.toString(resultOfSum);
        System.out.println(resultToString);

    }

    public static int[] arrayDiff(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Array`s length not equal");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }

        return result;
    }
}
