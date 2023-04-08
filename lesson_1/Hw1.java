// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
public class Hw1 {
    public static void main(String[] args) {
        System.out.println(divByZeroEx(10, 0)); // ArithmeticException
        System.out.println(nullPointerEx(null, 1)); // NullPointerException
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(OutOfBoundaryEx(arr, 5)); // ArrayIndexOutOfBoundsException

    }

    public static int divByZeroEx(int num1, int num2) {
        return num1 / num2;
    }

    public static int nullPointerEx(Integer num1, Integer num2) {
        return num1 * num2;
    }

    public static int OutOfBoundaryEx(int[] arr, int index) {
        return arr[index];
    }

}
