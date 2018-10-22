package Ch10.Examples.FinaleLaComedia;

public class Foo {
    public static final int FOO_X = 25;
    public static final double BAR_SIGN;
    final static int x;

    static {
        x = 42;
        BAR_SIGN = Math.random();
    }
}
