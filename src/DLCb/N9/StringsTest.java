package DLCb.N9;

public class StringsTest {
    public static void main(String[] args) {
        String s = "0";
        for (int x = 1; x < 10; x++)
            s = s + x;
        // "0"
        // "01"
        // "012"
        // "0123"
        // ""
        // "01234566789" = s; Но есть уже 10 строк

        Integer iWrap = new Integer(42); // Объект обертка никогда не изменится
    }
}
