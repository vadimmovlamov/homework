package hw4_1_Country;
/*
1. Создать энум страны Country:
 1.1. В котором есть 10 элементов
 1.2. У каждого элемента есть два свойства (площадь страны, количество человек)
  */
public enum Kontinen {
    AMERIKA(0.3, 60.2),
    EUROASIA(17.1, 146.7),
    AFRICA(0.31, 38.3);

    private double area; // площадь
    private double population; // численность

    Kontinen(double area, double population) {
        this.area = area;
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public double getPopulation() {
        return population;
    }
}
