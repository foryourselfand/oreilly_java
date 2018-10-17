package Ch1.Examples;

public class SimpleCheck {
    public static void main(String[] args) {
        int x = 4; //Присваиваем x значение 4
        while (x > 3) // Код в цикле будет работать так как х больше 3
            x = x - 1; // Или цикл будет выполняться вечно
        int z = 27;
        while (z == 17) {
            // Код цикла не будет запущен так как z не равно 17
        }
    }
}
