package Ch3.Pool;

public class TriangleTestDrive {
    public static void main(String[] args) {
        Triangle[] ta = new Triangle[4];
        int x = 0;
        while (x < 4) {
            ta[x] = new Triangle();
            ta[x].height = (x + 1) * 2;
            ta[x].length = x + 4;
            ta[x].set_area();
            System.out.println("треугольник " + x + ", зона = " + ta[x].area);
            x = x + 1;
        }
        int y = x;
        x = 27;
        Triangle t5 = ta[2];
        ta[2].area = 343;
        System.out.println("y = " + y + ", зона t5 = " + t5.area);
    }
}
