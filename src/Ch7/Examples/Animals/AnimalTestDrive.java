package Ch7.Examples.Animals;

import Ch8.Examples.Animals.Animal;
import Ch8.Examples.Animals.Cat;
import Ch8.Examples.Animals.Dog;

public class AnimalTestDrive {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Wolf();
        animals[3] = new Hippo();
        animals[4] = new Lion();

        for (int i = 0; i < animals.length; i++) {
            animals[i].eat();
            animals[i].roam();
        }
    }
}
