package Ch10.Pencil;

public class TestBox {
    Integer i;
    int j;

    public static void main(String[] args) {
        TestBox t = new TestBox();
        t.go();
    }

    public void go() {
        j = i; // NullPointerException
//        i = j; // 0 0
        System.out.println(j);
        System.out.println(i);
    }
}
