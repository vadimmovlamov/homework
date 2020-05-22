package rabochaya_book.Tema1;
//вывести часы. дни, недели, и тд
public class Main {
    public static void main(String[] args) {
        int s = 3700;
        int sec = s % 60;
        int m = (s-sec) / 60;
        int min = m % 60;
        int h = (m-min) / 60;
        int days = h / 24;
        int weeks = days / 7;
        System.out.println(h + " часов " + min + " минут " + sec + " секунд " + days + " суток " + weeks + " недель");
    }
}
