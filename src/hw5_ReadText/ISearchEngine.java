package hw5_ReadText;

/* 2.1. Написать интерфейс ISearchEngine.
Это будет функциональный интерфейс в котором будет метод search который
будет принимать два параметра (массив строк в котором мы ищем наше слово,
слово которое мы будем искать), а возвращать число (количество найденных совпадений).
 */

import java.util.ArrayList;

public interface ISearchEngine {
    String Search(String masstr, String word);
    // String search(ArrayList<String> masstr, String word);
}
