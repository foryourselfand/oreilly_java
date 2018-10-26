package Ch16.Examples;

import Ch8.Examples.Animals.Animal;
import Ch8.Examples.Animals.Cat;
import Ch8.Examples.Animals.Dog;

import java.util.ArrayList;

public class TestGenerics2 {
    public static void main(String[] args) {
        new TestGenerics2().go();
    }

    public void go() {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());

        ArrayList<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        takeAnimalsOld(animals);
//        takeAnimalsOld(dogs); //Не компилируется

        takeAnimalsNew(animals);
        takeAnimalsNew(dogs);
    }

    public void takeAnimalsOld(ArrayList<Animal> animals) {
        for (Animal a : animals)
            a.eat();
    }

    public void takeAnimalsNew(ArrayList<? extends Animal> animals) {
        for (Animal a : animals)
            a.eat();
    }

    public <T extends Animal> void takeThingOne(ArrayList<T> list) {

    }

    //Тоже самое что и

    public void takeThingTwo(ArrayList<? extends Animal> list) {

    }

    //Но лучше

    public <T extends Animal> void takeThingThree(ArrayList<T> one,
                                                  ArrayList<T> two) {

    }

    //Чем

    public void takeThingFourth(ArrayList<? extends Animal> one,
                                ArrayList<? extends Animal> two) {

    }
}
