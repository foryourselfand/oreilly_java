package Ch4.Mixed;

public class Mix4 {
    int counter = 0;

    public int maybeNew(int index) {
        if (index < 1) {
            // Зачем эти строчки вообще нужны?
            //Mix4 m4 = new Mix4();
            //m4.counter = m4.counter + 1;
            return 1;
        }
        return 0;
    }
}