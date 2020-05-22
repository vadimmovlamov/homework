package rabochaya_book.Tema2;

//создать двумерный массив - бабочкой

public class Main17 {
    public static void main(String[] args) {
        int array [][] = new int [5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = j+1;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i][j]);
            }
        }

    }
}