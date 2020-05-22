package rabochaya_book.Tema2;
// вывести в виде трех чисел дату следующего дня
public class Main6 {
    public static void main(String[] args) {
        int day = 29;
        int month = 11;
        int year = 2020;
        // может тут лучше применить do ... while


        if (month == 11){
            System.out.println(day + 1);
        }
        int nextday = 29 + 1;


        System.out.println("Следующий день: " + nextday + " " + month + " " + year);
    }
}
