package hw3_4_1;

import java.nio.channels.SelectionKey;
import java.util.Arrays;

//4.1.Сортировка выбором
public class SortSelection {
            public static void main(String[] args){
            System.out.println("Массив данных до сортировки: {5, 15, 48, 2, 6, 1, 7, 4}");
            System.out.println("Массив данных после сортировки: ");
            int[] array = {5, 15, 48, 2, 6, 1, 7, 4};
            selectionSort(array);
            System.out.println(Arrays.toString(array));
        }
        private static void selectionSort( int[] input){
            int inputLength = input.length;
            for (int i = 0; i < inputLength - 1; i++) {
                int min = i;
                for (int j = i + 1; j < inputLength; j++) {
                    if (input[j] < input[min]) {
                        min = j;
                    }
                }

                int temp = input[i];
                input[i] = input[min];
                input[min] = temp;
            }
        }
}