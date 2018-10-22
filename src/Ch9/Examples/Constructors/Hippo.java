package Ch9.Examples.Constructors;

public class Hippo extends Animal {
    public Hippo(String name) {
        super(name);
        System.out.println("Hippo");
    }

    public Hippo() {
        this("Кеша");
    }
}
