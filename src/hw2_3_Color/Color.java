package hw2_3_Color;

public class Color {
    // мои констакнты
    private final int RED = 1;
    private final int ORANGE = 2;
    private final int YELLOW = 3;
    private final int GREEN = 4;
    private final int BLUE = 5;
    private final int INDIGO = 6;
    private final int VIOLET = 7;
    private int numberColor;
    private int numberColor1;

    //конструктор
    public Color(int colorId) {
        numberColor = colorId;
    }

    public int getNumberColor(){
        return numberColor;
    }
    public String getNameColor (){
        switch (numberColor){
            case RED : return "Красный";
            case ORANGE : return "Оранжевый";
            case YELLOW : return "Желтый";
            case GREEN : return "Зеленый";
            case BLUE : return "Голубой";
            case INDIGO : return "Синий";
            case VIOLET : return "Фиолетовый";
            default: return "Такого цвета не существует!";
        }
    }
}
