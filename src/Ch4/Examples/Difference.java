package Ch4.Examples;

public class Difference {
    //Переменные экземпляра (внутри класса)
    private double height = 15.2;
    private String breed; // Будет установлено null

    int a;
    int b = 12;

    public int add() {
        int total = a + b; // Локальная переменная (внутри метода)
        return total;
    }

    public void go() {
        //Не скомпилируется. Локальные переменные нужно инициализировать
        //int x; // Локальная переменная. Можно объявить но использовать - нет
        //int z = x + 3;
    }
}
