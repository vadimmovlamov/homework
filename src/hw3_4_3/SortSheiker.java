package hw3_4_3;

import java.util.Arrays;

//4.2.Сортировка c помощью обменов (шейкерная)
public class SortSheiker {
    public static void main(String[] args) {
        System.out.println("Массив данных до сортировки: {5, 15, 48, 2, 6, 1, 7, 4}");
        int[] array = {5, 15, 48, 2, 6, 1, 7, 4}; // инициализируем массив
        int obmen; // инициализируем переменную для совершения обмена порядковыми числами
        int left = 0;// переменная - сдвиг влево до первого элемента
        int right = array.length - 1;// переменная - сдвиг вправо до предпоследнего момента

        do { // делать будем этот цикл  до тех пор пока левая часть не будет меньше чем правая либо равна
            for (int i = right; i >= left; i--) { // сортировка идет от конца мамассива до его начала
                if (array[i - 1] > array[i]){ //array[i-1] - это значение (7), а array[i] - последнее значение (4)
                    obmen = array[i];// значение 4
                    array[i] = array[i - 1]; // значение 4 меняем на 7
                    array[i - 1] = obmen;// значение 7 ставится на последнее место
                }
            }
            for (int i = left; i <= right; i++) {
                if (array[i] > array[i + 1]){
                    obmen = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = obmen;
                }
            }
        }
        while (left <= right);

        System.out.println("Массив данных после сортировки: " + Arrays.toString(array));
    }
}



