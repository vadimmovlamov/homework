package hw2_3_Color;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число для определения цвета: ");
        Scanner scan = new Scanner(System.in);
        int numberColor = scan.nextInt();
        Color color = new Color(numberColor);
        System.out.println(color.getNameColor());

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Введите следующее число для определения цвета: ");
        int numberColor1 = scan1.nextInt();
        System.out.println("Цвет получился: "color.getNameColor());
    }
}
