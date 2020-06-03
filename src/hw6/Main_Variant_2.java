package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main_Variant_2 {
    public static void main(String[] args) {

        try {
            System.out.println("Введите одно число от 1 до 10 -->");
            Scanner scan1 = new Scanner(System.in);
            int number = scan1.nextInt();
            if (number < 0 || number > 10) {
                System.out.println("Вы ввели корректное число : " + number);
                //               number = scan1.nextInt();
            }
        } catch (InputMismatchException) {
            System.out.println("Ввод текста недопустим! Ввведите повторно число!");
//                number = scan1.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Число находится вне диапазона! Введите повторно число!");
//                number = scan1.nextInt();
        }
    }
}
