package Ch16.Pool;

public class Mountain {
    String name;
    Integer height;

    public Mountain(String name, Integer height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return name + " " + height;
    }
}
