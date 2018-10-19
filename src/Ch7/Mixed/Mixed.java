package Ch7.Mixed;

public class Mixed {
    public static void main(String[] args) {
        A a = new A();
        A b = new B();
        A c = new C();
        A a2 = new C();

//        B's m1, A's m2, A's m3
//        b.m1();
//        c.m2();
//        a.m3();

//        B's m1, A's m2, C's m1, 13
//        ==
//        c.m1();
//        c.m2();
//        c.m3();

//        A's m1, A's m2, C's m1, 13
//        a.m1();
//        b.m2();
//        c.m3();

//        B's m1, A's m2, C's m1, 13
//        ==
//        a2.m1();
//        a2.m2();
//        a2.m3();

    }
}
