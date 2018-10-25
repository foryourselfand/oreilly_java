package DLCb.N10;

public class MoreBytes {
    public static void main(String[] args) {
        int x = -11;        //11110101

        //Знаковый бит не меняется
        int y = x >> 2;     //111111101
        System.out.println(y);

        // Беззнаковый сдвиг
        int yy = y >>> 2;   // 00111101
        System.out.println(yy);

        int z = x << 2;     // 11010100
        System.out.println(z);


    }
}
