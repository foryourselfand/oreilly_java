package Ch3.Examples;

public class Test {
    public static void main(String[] args) {
        /*
        int x;
        x = 234;
        byte b;
        boolean isFun = true;
        double d = 2345.98;
        char c = 'f';
        int z = x;
        boolean isPunkRock;
        isPunkRock = false;
        boolean powerOn;
        powerOn = isFun;
        long big = 3456789;
        float f = 32.5f;
        */

        /* Не работает
        x = 24;
        b = x;
        */

//        int x = 34.5;
//        boolean boo = x;
        int g = 17;
        int y = g;
        y = y + 10;
        short s;
//        s = y;
        byte b = 3;
        byte v = b;
        short n = 12;
//        v = n;
//        byte k = 128;
        int p = 3 * g + y;

        int[] nums;
        nums = new int[7];

        nums[0] = 6;
        nums[1] = 19;
        nums[2] = 44;
        nums[3] = 42;
        nums[4] = 10;
        nums[5] = 20;
        nums[6] = 1;
    }
}
