package rabochaya_book.Tema2;

import java.util.Scanner;

// посчитать сумму цифр данного числа
public class Main10 {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;

        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum);
    }
}