package Ch1.Examples;

public class Operations {
    public static void main(String[] args) {
        //Сделать что-то
        //Выражения: объявления, присваивания, вызовы методов и т.д.
        int x = 3;
        String name = "Кинжал";
        x = x * 17;
        System.out.println("x равен " + x);
        double d = Math.random();
        //Это комментарий

        //Делать что-то снова и снова
        //Циклы: for и while
        while (x > 12) {
            x = x - 1;
        }
        for (x = 0; x < 10; x = x + 1) {
            System.out.println("Теперь х равен " + x);
        }

        //
        //
        if (x == 10) {
            System.out.println("х должен быть равен 10");
        } else {
            System.out.println("х не равен 10");
        }
        if ((x < 3) & (name.equals("Кинжал"))) {
            System.out.println("Осторожко");
        }
        System.out.println("Эта строка выполняется в любом случае");
    }

}
