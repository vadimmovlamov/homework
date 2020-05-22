package rabochaya_book.Tema2;
// проверить, помещаются ли эти дома на участок е и f.
public class Main7 {
    public static void main(String[] args) {
        int a = 20;
        int b = 40;
        int c = 30;
        int d = 20;
        int e = 1;
        int f = 230;

        int Sab = a*b;
        int Scd = c*d;
        int Sef = e*f;

        if (Sef >= (Sab + Scd)){
            System.out.println("Оба дома помещаются на участке");
        }else {
            System.out.println("Оба дома не помещаются на участке");
        }
    }
}
