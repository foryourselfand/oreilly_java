package Ch8.Examples.Animals;


public class MyAnimalListTestDrive {
    public static void main(String[] args) {
        MyAnimalList list = new MyAnimalList();
        Dog a = new Dog();
        Cat c = new Cat();
        list.add(a);
        list.add(c);

        if (a.equals(c)) {
            System.out.println("true");
        } else
            System.out.println("false");

        System.out.println(c.hashCode());

        System.out.println(c.getClass());

        System.out.println(c.toString());
    }
}
