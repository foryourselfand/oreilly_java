package Ch9.Pencil.Duck;

public class DuckTestDrive {
    public static void main(String[] args) {
        int weight = 8;
        float debsity = 2.3f;
        String name = "Дональд";
        long[] feathers = {1, 2, 3, 4, 5, 6};
        boolean canFly = true;
        int airSpeed = 22;

        Duck[] d = new Duck[9];
        d[0] = new Duck(); // 1
        d[1] = new Duck(debsity, weight); // 5
        d[2] = new Duck(name, feathers); // 3
        d[3] = new Duck(canFly); // 2
        d[4] = new Duck(3.3f, airSpeed); // 5
        d[5] = new Duck(false); // 2
        d[6] = new Duck(airSpeed, debsity); // 4
    }
}
