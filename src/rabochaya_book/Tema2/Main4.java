package rabochaya_book.Tema2;
//имеется отверстие прямоугольно (а/b), определить , можно ли его полностью закрыть круглой картонкой радиусом
public class Main4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int r = 50;
        int S = a * b; // площадь отверстия
    if (r >= S){
        System.out.println("Отвертие можно полностью закрыть!");
    }else {
        System.out.println("Отвертие нельзя полностью закрыть!");
    }
    }
}
