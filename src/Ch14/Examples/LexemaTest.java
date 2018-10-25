package Ch14.Examples;

public class LexemaTest {
    public static void main(String[] args) {
        String toTest = "Какой цвет получится при сочетании синего и желтого?/Зеленый";
        String[] rezult = toTest.split("/");
        for (String token : rezult)
            System.out.println(token);
    }
}
