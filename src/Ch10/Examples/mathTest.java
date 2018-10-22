package Ch10.Examples;

public class mathTest {
    public static void main(String[] args) {
        int x = Math.round(42.2f);
        int y = Math.min(56, 12);
        int z = Math.abs(-343);

//        Math mathObject = new Math();

        double r1 = Math.random();
        int r2 = (int) (Math.random() * 5);

        x = Math.abs(-240);//240
        double d = Math.abs(240.45);//240.45

        x = Math.round(-24.8f);//-25
        y = Math.round(24.45f);//24

        x = Math.min(24, 240); //24
        d = Math.min(90876.5, 90876.49);//90876.49

        x = Math.max(24, 240);//240
        d = Math.max(90876.5, 90876.49);//90876.5
    }
}
