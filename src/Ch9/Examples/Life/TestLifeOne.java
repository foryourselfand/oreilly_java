package Ch9.Examples.Life;

public class TestLifeOne {
    public void read() {
        int s = 42; // Может быть использована только внутри жтого метода
        // Метод завершается, переменная исчезает
        sleep();
    }

    public void sleep() {
//        s = 7; //Неправильно
    }
}
