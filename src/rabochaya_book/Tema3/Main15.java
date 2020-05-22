package rabochaya_book.Tema3;
//вывести сумму max и min значений

public class Main15 {
    public static void main(String[] args) {
        int [] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = (int) (Math.random()*10 + 1);
            System.out.println("Ученик №" + i + " = " + array[i]);
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) min = array[i];

        }
        System.out.println("max = "  + max);
        System.out.println("min = "  + min);
        System.out.println("Сумма max and min = " + (max + min));

    }
}
