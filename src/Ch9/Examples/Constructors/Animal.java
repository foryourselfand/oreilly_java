package Ch9.Examples.Constructors;

public class Animal {
    private String name;

    public Animal(String theName) {
        name = theName;
        System.out.println("Animal");
    }

    public String getName() {
        return name;
    }
}
