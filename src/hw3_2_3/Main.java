package hw3_2_3;
//2.3. Все цифры из числа введенного через аргумент к исполняемой
//программе перемножить между собой и вывести ход вычислений в консоль

import java.util.Scanner;

public class Main {
        System.out.println("Задание 3.2.3!");
        System.out.println("Введите число : ");
        Scanner sc1 = new Scanner(System.in);
        int x1 = sc1.nextInt();
        // нужно разбить число на отдельные числа и перемножить их.
        int result = 1;
        for (int i = x1; i <= x1; i++){ // указываем, что введенное значение от 1 до х1 должно умножится
            result *= i;
        }
        System.out.println(result);
        /* int result = x1;
        while (result <= x1){
               result *= x1;*/

      /*  result *= x1 % 10;
        x1 /= 10;
        result *= x1 % 10;
        x1 /= 10;
        result *= x1 % 10; */

}
