package hw3_2_2;
// 2.2. Перемножить числа от 1 до числа (включительно) введеннго через аргумент к исполняемой программе

import java.util.Scanner;
// 2.2. Перемножить числа от 1 до числа (включительно) введеннго
//через аргумент к исполняемой программе
public class Main {
    System.out.println("Задание 3.2.2!");
    System.out.println("Введите число для перемножения от 1 до .. : ");
    Scanner sc1 = new Scanner(System.in);
    int x1 = sc1.nextInt();
    int res = 1;
        for (int i = 1; i <= x1; i++){
        res *= i;
    }
        System.out.println("Результат вычислений от 1 до .. составляет: " + res);
}


//РЕШЕНИЕ ЧЕРЕЗ ФАКТОРИАЛ

  /*      System.out.println("Задание 3.2.2! - решение через факториал");
                System.out.print("Введите число для перемножения от 1 до .. : ");
                Scanner scan = new Scanner(System.in);
                int y = scan.nextInt();
                int res1 = 1;
                for (int i = 1; i <= y; i++) {
                res1 *= i;
                }
                return res1;
                }
        private static void calculateFactorial(int res1) {
            System.out.println("Результат вычислений: " + calculateFactorial(res1));
        }

   */