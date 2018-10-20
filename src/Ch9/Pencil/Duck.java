package Ch9.Pencil;

public class Duck {
    int pounds = 6;
    float floability = 2.1f;
    String name = "Универскальная";
    long[] feathers = {1, 2, 3, 4, 5, 6, 7};
    boolean canFly = true;
    int maxSpeed = 25;

    public Duck() {
        System.out.println("Утка типа 1");
    }

    public Duck(boolean fly) {
        canFly = fly;
        System.out.println("Утка типа 2");
    }

    public Duck(String n, long[] f) {
        name = n;
        feathers = f;
        System.out.println("Утка типа 3");
    }

    public Duck(int w, float f) {
        pounds = w;
        floability = f;
        System.out.println("Утка типа 4");
    }

    public Duck(float density, int max) {
        floability = density;
        maxSpeed = max;
        System.out.println("Утка типа 5");
    }
}
