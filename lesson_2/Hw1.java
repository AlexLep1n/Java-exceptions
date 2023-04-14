package lesson_2;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.w3c.dom.UserDataHandler;

/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
*/
public class Hw1 {
    public static void main(String[] args) {
        System.out.println(enterFloatNumber());
    }

    public static Float enterFloatNumber() {
        Float userNum;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Введите число с плавающей запятой: ");
            userNum = scanner.nextFloat();
            return userNum;
        } catch (InputMismatchException e) {
            System.out.println("Это не число с плавающей запятой!");
        }
        return enterFloatNumber();
    }

}
