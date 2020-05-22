package rabochaya_book.Tema2;
// найти в строке количество знаков
public class Main18 {
    public static void main(String[] args) {
        String str = "rtyyuio//.,,,,zx,,,,,,c.//";
        int n = 0;
        int p = 0;
        int t = 0;
        char symbol;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol == ',')
                n++;
                if (symbol == '.')
            p++;
                if (symbol == '!')
            t++;
        }
        System.out.println("1 - " + n);
        System.out.println("2 - " + p);
        System.out.println("3 - " + t);

    }
}
