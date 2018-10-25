package DLCb.N10;

public class Bytes {
    public static void main(String[] args) {
        int x = 10;     // 00001010
        x = ~x;         // 11110101
        System.out.println(x);

        int y = 6;

        int a = x & y;  // 00000010
        System.out.println(a);

        int b = x | y;  // 00001110
        System.out.println(b);

        int c = x ^ y;  // 00001100
        System.out.println(c);
    }
}
