package Ch4.Examples;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog one = new Dog();
        one.size = 70;

        Dog two = new Dog();
        two.size = 8;

        Dog three = new Dog();
        three.size = 35;

        one.bark();
        two.bark();
        three.bark();

        one.anotherBark(3);

        one.takeTwo(12, 34);

        int foo = 7;
        int bar = 3;
        one.takeTwo(foo, bar);

    }
}
