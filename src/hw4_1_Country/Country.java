package hw4_1_Country;
/*
1. Создать энум страны Country:
 1.1. В котором есть 10 элементов
 1.2. У каждого элемента есть два свойства (площадь страны, количество человек)
  */
public enum Country {
    ITALY(0.3, 60.2),
    RUSSIA(17.1, 146.7),
    POLAND(0.31, 38.3),
    SPAIN(0.5, 46.9),
    USA(9.8, 331.4);

    private double area; // площадь
    private double population; // численность

    Country(double area, double population) {
        this.area = area;
        this.population = population;
    }
    /* для того . что бы обратиться к переменным указанным в скобках стран, нужно создать геттеры */

    public double getArea() {
        return area;
    }

    public double getPopulation() {
        return population;
    }
}
