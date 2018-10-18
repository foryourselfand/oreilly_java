package Ch4.Mixed;

public class Mix4TestDrive {
    public static void main(String[] args) {
        int count = 0;
        Mix4[] m4a = new Mix4[20];
        int x = 0;

//        14 1
//        x < 9
//        index < 5

//        25 1
//        x < 20
//        index < 5

//        25 1
//        x < 7
//        index < 7

//        20 1
//        x < 19
//        index < 1


        while (x < 19) {
            m4a[x] = new Mix4();
            m4a[x].counter = m4a[x].counter + 1;
            count = count + 1;
            count = count + m4a[x].maybeNew(x);
            x = x + 1;
        }
        System.out.println(count + " " + m4a[1].counter);
    }
}
