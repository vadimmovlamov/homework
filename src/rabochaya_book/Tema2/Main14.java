package rabochaya_book.Tema2;
//вывести номер оценки

public class Main14 {
    public static void main(String[] args) {
        int marks [] = new int[20];
        for (int i = 0; i < 20; i++) {
            marks[i] = (int) (Math.random()*10 + 1);
            System.out.println("Ученик №" + i + " = " + marks[i]);
            System.out.println("Вывести только оценки:" + marks[i]);
        }
        System.out.println("Количество учеников: " + marks.length);

    }
}
