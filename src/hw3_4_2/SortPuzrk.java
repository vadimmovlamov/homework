package hw3_4_2;

import java.util.Arrays;

//4.2.Сортировка c помощью обменов (пузырьковая)
public class SortPuzrk {
    public static void main(String[] args) {
        System.out.println("Массив данных до сортировки: {5, 15, 48, 2, 6, 1, 7, 4}");
        int[] array = {5, 15, 48, 2, 6, 1, 7, 4}; // инициализируем массив
        int obmen; // инициализируем переменную для совершения обмена порядковыми числами
        boolean mas = false; // логическая переменная

        while (!mas){
            mas = true;
            for (int i = 0; i < array.length-1; i++) { // array.length-1 - чтобы сортировка не вылазила за границы массива
                if (array[i] > array[i + 1]){
                    mas = false;

                    obmen = array[i];
                    array[i] = array[i+1];
                    array[i+1] = obmen;
                }
            }
        }
        System.out.println("Массив данных после сортировки: " + Arrays.toString(array));
    }
}



