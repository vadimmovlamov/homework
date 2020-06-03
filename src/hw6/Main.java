package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

/*ДЗ7:
Написать код который у пользователя через консоль попросит
ввести число от 1 до 10 и напечатать его в консоль. В случае
если пользователь введёт число не из этого диапазона вывести
сообщение что нужно повторить попытку. Всего у пользователя
3 попытки ввести верное число. Предусмотреть возможность того
что пользователь введёт не число а какой-то текст. В этом случае
необходимо выдать сообщение что текст не допустим и предоставить
новую попытку.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите одно число от 1 до 10 -->");
        Scanner scan1 = new Scanner(System.in);
        int number = scan1.nextInt();
        while (number < 0 || number > 10){
            System.out.println("Число находится вне диапазона! Повторите ввод!");
            number = scan1.nextInt();

            try {
                if (number < 0 || number > 10) {
                    System.out.println("Вы ввели число : " + number);
                }
            } catch (InputMismatchException) {
                System.out.println("Ввод текста недопустим!");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Число находится вне диапазона! Введите повторно число!");
            }
        }

    }
}
