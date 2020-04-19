package hw4_1_Country;

import java.util.Comparator;

/*1.9. Создать класс CountryAreaComparator.
 Данный класс должен реализоватвать интерфейс Comparator (implements Comparator<Country>
 написать вот так, что такое в скобочках мы пока не изучали, если что это тема generics).
 В данном классе необходимо сравнить площадь двух переданных стран.
import java.util.Comparator;*/

public class CountryAreaComparator implements Comparator<Country> {
    @Override
    public int compare(Country area1, Country area2) {
        int result;
        if (area1.getArea() == area2.getArea()) {
            result = 0;
        } else if (area1.getArea() > area2.getArea()) {
            result = 1;
        } else {
            result = -1;
        }
        return result;
    }
}
