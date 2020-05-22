package rabochaya_book.Tema2;
// подсчитать количество слов в тексте. учесть что может быть 2 пробела между словами в начале и в конце текста
public class Main19 {
    public static void main(String[] args) {
        String str = "  каждый охотник желает знать, где сидит фазан  ";
        int n = 0;

        if (str.length() != 0) {
            n++;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    n++;
                }
            }
            System.out.println("1 - " + n);
        }
    }
}
