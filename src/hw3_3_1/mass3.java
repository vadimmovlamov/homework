package hw3_3_1;

import java.util.Scanner;

public class mass3 {
    private static int g;

    public static void main(String[] args) {
        System.out.println("С помощью do while");
        System.out.println("Введите числа:");
        Scanner scan6 = new Scanner(System.in);
        int r = scan6.nextInt();

        Scanner scan7 = new Scanner(System.in);
        int t = scan7.nextInt();

        Scanner scan8 = new Scanner(System.in);
        int f = scan8.nextInt();

        int[] array2 = new int[3];
        do {
            g++;
            System.out.println(g + "  ");
        }
        while (g < array2.length);


    }


}
