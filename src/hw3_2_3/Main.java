package hw3_2_3;
//2.3. Все цифры из числа введенного через аргумент к исполняемой
//программе перемножить между собой и вывести ход вычислений в консоль

import java.util.Scanner;

public class Main {
    System.out.println("Задание 3.2.3!");
    Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите число # 1 : ");
    int number1 = sc2.nextInt();
        System.out.println("Введите число # 2 : ");
    int number2 = sc2.nextInt();
        System.out.println("Результат перемножения:" + number1 * number2);
    }
}
