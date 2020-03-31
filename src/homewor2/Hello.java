package homewor2;

/* апросить у пользователя его имя. Если имя будет равно имени Вася
 тогда в консоль должно вывести сообщение "Привет!" на одной строке,
 а на второй "Я тебя так долго ждал". Если имя будет равно имени "Анастасия"
 тогда в консоль должно вывести сообщени "Я тебя так долго ждал".
 В случае если это будет другое имя то вывести сообщение "Добрый день, а вы кто?".
 Написать ТРИ ОТДЕЛЬНЫХ решения при помощи if, else if, switch.
 В примерах if и else if для сравнения имё использовать код
 на подобии Objects.equals("Имя1", "Имя2");*/

import java.util.Objects;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите Ваше имя: ");
        String str1 = scan.nextLine();
        String name = "Вася";
        String name1 = "Анастасия";
        if (Objects.equals(str1,name)) {
            System.out.println("Привет" + str1);
            System.out.println("Я давно хотел с тобой увидеться");
        }
        else if (Objects.equals(str1,name1)) {
            System.out.println("Я тебя так долго ждал");
        }


        else {
            System.out.println("Добрый день! А вы кто?");
        }
        String str2 = scan.nextLine();
    }

}
