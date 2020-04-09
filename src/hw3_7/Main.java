package hw3_7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/*Написать код который будет получать значения элементов
массива из консоли. Далее массив нужно отсортировать любым
способом из прошлого задания. В случае нахождения одинаковых
элементов массива дубликат требуется удалить
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* как связать ввод размера массива с добавлением значений массива???*/
        System.out.println("Введите 5 значений массива: ");
        int[] mass = new int[5];
        int x1 = scan.nextInt();
        int x2 = scan.nextInt();
        int x3 = scan.nextInt();
        int x4 = scan.nextInt();
        int x5 = scan.nextInt();

        mass[0] = x1;
        mass[1] = x2;
        mass[2] = x3;
        mass[3] = x4;
        mass[4] = x5;

        System.out.println("Вы ввели массив, который нужно отсортировать по возрастанию и по убыванию : {" + x1 + ", " + x2 + ", " + x3 + ", " + x4 + ", " + x5 + "}");

        int[] array = {mass[0], mass[1], mass[2], mass[3], mass[4]}; // инициализируем массив

        int obmen; // инициализируем переменную для совершения обмена порядковыми числами
        boolean mas = false; // логическая переменная
        while (!mas) {
            mas = true;
            for (int i = 0; i < array.length - 1; i++) { // array.length-1 - чтобы сортировка не вылазила за границы массива
                if (array[i] > array[i + 1]) {
                    mas = false;

                    obmen = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = obmen;
                }
            }
        }
        System.out.println("Массив данных после сортировки (по возрастанию): " + Arrays.toString(array));

        //сортировка по убыванию

        for (int i = 0; i < array.length-1; i++) { // array.length-1 - чтобы сортировка не вылазила за границы массива
            if (array[i] < array[i + 1]) {
                mas = false;

                obmen = array[i+1];
                array[i+1] = array[i];
                array[i] = obmen;
            }
        }
        System.out.println("Массив данных после сортировки (по убыванию): " + Arrays.toString(array));

        //Удаение повторящихся элементов из массива (если таковые имеются)!

        Set<Integer> set = new HashSet<Integer>();
        for (int num : array) { // как добавить цикл if??
            set.add(num);
        }
        System.out.println("Повторяющиеся элементы массива удалены : " + set);

    }
}
