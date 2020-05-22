package rabochaya_book.Tema2;
// вывести число добавив к нему слово РУБЛЕЙ в правильном падеже
public class Main5 {
    public static void main(String[] args) {
        int sum = 750;

        if (sum <= 999){
            System.out.println(sum + "рублей!");
        }else if (sum >= 1000){
            System.out.println(sum + "тысяча рублей");
        }
        System.out.println("не знаю, а если будет 51 рубль????");
    }

}
