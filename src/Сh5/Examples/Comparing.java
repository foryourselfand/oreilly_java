package Сh5.Examples;

public class Comparing {
    public static void main(String[] args) {
        long y = 42;
//        int x = y;

        int x = (int) y;

        y = 40002;
        short s = (short) y;
        System.out.println(s);

        float f = 3.14f;
        x = (int) f;
        System.out.println(x);
    }
}
