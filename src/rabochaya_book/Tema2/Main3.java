package rabochaya_book.Tema2;

import java.util.Scanner;

//Сздать число.определить , является ли пследняя цифра числа 7.
public class Main3 {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();

        if (num % 10 == 7){
            System.out.println("Последняя цифра является 7!");
        }else {
            System.out.println("Последняя цифра не является 7!");
        }


    }
}
