package hw5_ReadText;
/* 2.2. Написать класс EasySearch реализующий интерфейс ISearchEngine.
Реализовать поиск по строкам при помощи метода indexOf.
 */
public class EasySearch implements ISearchEngine {
    @Override
    public String Search(String masstr, String word) {
        int count = 0;
            while (count != -1){
                count = textString.indexOf(textWord, count);
            }

    }


}
