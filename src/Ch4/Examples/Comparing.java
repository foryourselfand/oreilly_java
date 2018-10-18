package Ch4.Examples;

public class Comparing {
    public static void main(String[] args) {
        int a = 3;
        byte b = 3;
        if (a == b) {
            // true (проверяет равенство битов)
        }

        GoodDog z = new GoodDog();
        GoodDog x = new GoodDog();
        GoodDog c = z;

        if (z == x) {
            //false
        }

        if (z == c) {
            //true
        }

        if (x == c) {
            //false
        }
    }
}
