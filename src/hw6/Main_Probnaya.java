package hw6;

import java.io.IOException;
import java.util.Scanner;

/*
ДЗ7:
Написать код который у пользователя через консоль попросит ввести число от 1 до 10 и напечатать его в консоль.
В случае если пользователь введёт число не из этого диапазона вывести сообщение что нужно повторить попытку.
Всего у пользователя 3 попытки ввести верное число. Предусмотреть возможность того что пользователь введёт
не число а какой-то текст. В этом случае необходимо выдать сообщение что текст не допустим и предоставить новую попытку.
 */
public class Main_Probnaya {
    public static void main(String[] args) {
        try {
            System.out.println("Введите число от 1 до 10 ");
            Scanner scan = new Scanner(System.in);
            double number = scan.nextDouble();

            if (number < 1 && number > 10) {
                System.out.println("Вы ввели некорректное число:" + number + "У Вас осталось 2 попытки!");
                System.out.println("Введите повторно число!");
                return;
            }

          /*  Scanner scan2 = new Scanner(System.in);
            double number2 = scan.nextDouble();

           */

        } catch (NullPointerException e){
            e.getStackTrace();
//            System.out.println("Вы снова ввели некорректное число:" + number + " У Вас осталось 1 попытка! Введите повторно число!");
        } finally {
            System.out.println("Вы снова ввели некорректное число! У Вас больше не осталось попыток! Приходите попозже");
        }
        return;
    }

    public static double enter1 (double number){
        if (number < 1 && number > 10){
            throw new RuntimeException("Вы ввели некорректное число:" + number + "У Вас осталось 2 попытки! Введите повторно число!");
        }
        return number;
    }
}