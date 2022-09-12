package lesson_1;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Integer[] arr = {1, null, 2, 3, 4, 5, null};
        checkArray(arr);
    }

    public static void checkArray(Integer[] arr) {
        List<Integer> indexesOfZero = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                indexesOfZero.add(i);
            }
        }
        if (!indexesOfZero.isEmpty()) {
            throw new RuntimeException("Null elements have indexes: " + indexesOfZero);
        }
    }
}
