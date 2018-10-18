package Ch4.Examples;

public class Dog {
    int size;
    String name;

    void bark() {
        if (size > 60)
            System.out.println("Гав Гав!");
        else if (size > 14)
            System.out.println("Вуф Вуф!");
        else
            System.out.println("Тяф Тяф!");
    }

    void anotherBark(int numOfBarks) {
        while (numOfBarks > 0) {
            System.out.println("Гав ");
            numOfBarks = numOfBarks - 1;
        }

    }

    public void takeTwo(int x, int y) {
        int z = x + y;
        System.out.println("Total is " + z);
    }
}
