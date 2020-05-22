package rabochaya_book.Tema2;

import java.util.Scanner;

// является ли число простым при делении на самого себя и на 1
public class Main11 {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();

        for (double i = num; i <= num; i++) {
            if (num % i == 1 || num / 1 == num) {
                System.out.println("Число простое!");
            }else {
                System.out.println("Число HE норм");
            }
        }


  /*      if (num / num == 1 || num / 1 == 1) {
            System.out.println("Число простое");
        } else {
            System.out.println("Число плохое");
        }
    }

   */
    }
}