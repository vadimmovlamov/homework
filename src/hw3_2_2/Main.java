package hw3_2_2;
// 2.2. Перемножить числа от 1 до числа (включительно) введеннго через аргумент к исполняемой программе

import java.util.Scanner;

public class Main {
    System.out.println("Задание 3.2.2!");
        System.out.println("Введите число для перемножения на 1 : ");
    Scanner sc1 = new Scanner(System.in);
    int x1 = sc1.nextInt();
    int res = 0;
        for (int i = 0; i < res; i++){
        res = x1 * i;
    }

        System.out.println(res);
}
