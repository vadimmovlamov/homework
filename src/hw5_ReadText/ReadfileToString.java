package hw5_ReadText;
/*ДЗ6:
1. Найти в книге "Война и мир" https://www.dropbox.com/s/vmpxj6bsnflvgdi/%D0%B2%D0%BE%D0%B9%D0%BD%D0%B0%20%D0%B8%20%D0%BC%D0%B8%D1%80.txt?dl=0
(Прочитать https://howtodoinjava.com/java/io/java-read-file-to-string
-examples/ и воспользоваться методом readAllBytesJava7 с этой страницы)
при помощи обычного поиска по строке.
 */
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadfileToString {
    public static void main(String[] args) {
        String filePath = "c:/Users/Public/MyHomework/home1/src/Война и мир.txt";
        System.out.println(readAllBytesJava7(filePath));
    }

    private static String readAllBytesJava7(String filePath) {
        String content = " ";
        try {
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return content;
    }
}
