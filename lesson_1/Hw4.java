/*
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
*/
public class Hw4 {
    public static void main(String[] args) {
        int arr1[] = new int[] { 6, 4, 9, 8, 20 };
        int arr2[] = new int[] { 6, 2, 3, 2, 4 };
        int[] arr3 = divArraysElems(arr1, arr2);
        for (int el : arr3) {
            System.out.printf("%d ", el);
        }
    }

    public static int[] divArraysElems(int arr1[], int[] arr2) {
        if (arr1 == null || arr2 == null) {
            throw new RuntimeException("Массивы не должны быть null!");
        } else if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов должны быть одниковыми!");
        } else if (arr1.length == 0 || arr2.length == 0) {
            throw new RuntimeException("Массивы не должны быть пустыми!");
        } else {
            int[] arr3 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr3[i] = arr1[i] / arr2[i];
            }
            return arr3;
        }
    }
}
