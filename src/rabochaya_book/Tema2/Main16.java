package rabochaya_book.Tema2;

//создать массив, заполнить его случ числами. распечатать и перевернутьи снова распечатать

public class Main16 {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
            System.out.println("Ученик №" + i + " = " + array[i]);
        }
    }
    private static void selectionSort(int[] array){
            int arrayLength = array.length;
            int obmen;
            for (int i = 0; i < arrayLength - 1; i++) {
                int min = i;
                for (int j = i + 1; j < arrayLength; j++) {
                    if (array[j] < array[min]) {
                        min = j;
                    }
                }

                obmen = array[i];
                array[i] = array[min];
                array[min] = obmen;
            }
        System.out.println(array);
    }
}