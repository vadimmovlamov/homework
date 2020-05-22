package rabochaya_book.Tema3;

//имеется строка с текстом. вывести текст, составленный из последних букв слов
public class Main20 {
    public static void main(String[] args) {
        String str = "каждый охотник желает знать, где сидит фазан";
        String[] words = str.split("\\s");
        for (String subStr:words) {
            System.out.println(subStr);
        }
        // как извлечь последний символ из каждого слова????


        /*разбиение строки
        String str = "каждый охотник желает знать, где сидит фазан";
        String[] subStr;
        String delimeter = " "; // Разделитель пробел
        subStr = str.split(delimeter); // разделение строки через метод split

        for (int i = 0; i < subStr.length; i++) {
            System.out.println(subStr[i]);
        }

         */



          /*   Вариант решения - когда посл символ строки
        String str = "каждый охотник желает знать, где сидит фазан";
        int last = str.length() - 1; // длина строки - 1 позиция
        char word = str.charAt(last);
        System.out.println(word); // результат = н

      */


        /* замена символов
        String str = "каждый охотник желает знать, где сидит фазан";
        // преобразуем str в массив
        char[] array = str.toCharArray();
        // перебираем все элементы массива
        for (int i = 0; i < array.length; i++) {
            //находим пробелы
            if (array[i] == ' '){
                //замена пробела на тире
                array[i] = '.';
            }
        }
        System.out.println(array);

         */




    }



}
