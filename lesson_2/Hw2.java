package lesson_2;

public class Hw2 {
    public static void main(String[] args) {
        try {
            int[] intArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // массив может быть пустой
                                                                      // или нет искомого индекса
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e.getClass().getSimpleName()
                    + "\nИндекс больше длины массива или массив пустой!");
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e.getClass().getSimpleName() + "\nYou can`t divide by zero!");
        }
    }
}
