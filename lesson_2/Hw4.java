package lesson_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
*/
public class Hw4 {
    public static void main(String[] args) {
        System.out.println(someAPI());
    }

    public static String someAPI() {
        String userStr = null;
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите что нибудь! ");
            userStr = bf.readLine();
            if (userStr.isEmpty()) {
                throw new RuntimeException("Нелья вводить пустые строки!");
            }
        } catch (IOException e) {
            System.out.println("Catched Exception: " + e.getClass().getName());
        }
        return userStr;
    }
}
