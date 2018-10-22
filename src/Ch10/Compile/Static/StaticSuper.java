package Ch10.Compile.Static;

public class StaticSuper {
    static {
        System.out.println("Родительский статический блок");
    }

    public StaticSuper() {
        System.out.println("Родительский конструктор");
    }
}
