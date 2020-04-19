package hw4_1_Country;

public class Main {
    public static void main(String[] args) {
        Country poland = Country.POLAND;
        System.out.println("Численность страны составляет: " + poland.getPopulation());
        System.out.println("Площадь страны составляет: " + poland.getArea());

        Kontinen eurasia = Kontinen.EUROASIA;
        System.out.println("Численность континента составляет: " + eurasia.getPopulation());
        System.out.println("Площадь континента составляет: " + eurasia.getArea());

        //1.4 Воспользоваться методом valueOf передав туда название элемента энума
        Country country = Country.valueOf("POLAND");
        System.out.println(Country.valueOf("POLAND"));

        //1.6. Сравнить результат valueOf и элемент энума через оператор ==
        System.out.println(country == Country.USA);

     /*   // 1.7. Передать в valueOf имя несуществующего элемента
        Country country1 = Country.valueOf("SOCHI");
        System.out.println(Country.valueOf("POLAND"));
*/

    }



/*    public static void print(){
        System.out.println(_____-);
    }*/
}
