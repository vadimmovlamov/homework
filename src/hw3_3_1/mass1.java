package hw3_3_1;

import java.util.Scanner;

public class mass1 {

    public static void main(String[] args) {
        System.out.println("C помощью for. Введите числа:");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        Scanner scan1 = new Scanner(System.in);
        int y = scan1.nextInt();

        Scanner scan2 = new Scanner(System.in);
        int z = scan2.nextInt();

        int[] array = new int[3];
        array[0] = x;
        array[1] = y;
        array[2] = z;

        for (int i = 0; i < array.length; i++){
            System.out.println("Результат :");
            System.out.println(array[i]);
        }


}
