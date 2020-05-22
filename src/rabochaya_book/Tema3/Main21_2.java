package rabochaya_book.Tema3;
//создаь цикл многократно складывает строки с помощью StringBuilder и метода append
public class Main21_2 {
    public static void main(String[] args) {
        String str1 = "каждый охотник желает знать,";
        String str2 = "где сидит фазан";

        StringBuilder builder = new StringBuilder(str1);
        builder.append(str2);
//        new StringBuilder().append(str1).append(str2).toString();
        while (true){
            System.out.println(builder);
        }
    }
}