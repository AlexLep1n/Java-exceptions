package lesson_2;

public class Hw3 {
    public static void main(String[] args) {
        try {
            Integer a = 90;
            Integer b = 3;
            System.out.println(a / b);
            printSum(a, b);
            int[] abc = { 1, 2, 3, 4 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (ArithmeticException ex) {
            System.out.println("Нельзя делить на 0!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

}
