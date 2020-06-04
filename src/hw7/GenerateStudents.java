package hw7;

import java.util.List;

/*ДЗ8:
1. Создать мэйн в котором будут генерироваться студенты. 100 тыс в список. Использовать метод writeObject.
После этого сохранить эту информацию в файл
2. Создать мэйн в котором прочитать данный файл. Сохранить всех студентов в список.
Прошу учесть что на момент написание второго мэйна вы не знаете точное количество студентов в файле
3. Отсортировать студентов по алфавиту и сохранить информацию в новый файл но уже сохранять не объекты
через writeObject а поля объектов через другие методы writeXXX
 */
public class GenerateStudents {
    public static void main(String[] args) {

        String Students [] = new String{"Alex", "Baton", "Jek","Pol"};
        List<String> freeNames = null;
        for (int i = 0; i < 100; i++) {
            Students[i] = new String();
            System.out.println("Студент №" + i + " = " + Students[i]);
        }
    }
}
