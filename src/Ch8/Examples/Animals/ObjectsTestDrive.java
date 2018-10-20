package Ch8.Examples.Animals;

import java.util.ArrayList;

public class ObjectsTestDrive {
    public static void main(String[] args) {
        ArrayList<Dog> myDogArrayList = new ArrayList<Dog>();
        Dog aDog = new Dog();
        myDogArrayList.add(aDog);
        Dog a = myDogArrayList.get(0);

        ArrayList<Object> myObjectArrayList = new ArrayList<Object>();
        Dog bDog = new Dog();
        myObjectArrayList.add(bDog);
//        Dog b = myObjectArrayList.get(0); //Don't work
//        Dog b = (Dog) myObjectArrayList.get(0); //Work

        Object o = myDogArrayList.get(0);
        int i = o.hashCode();
//        o.roam(); //Don't work
//        ((Dog) o).roam(); //Work

//        Dog dog = new Dog(); // Методы и Object и Dog
//        Object object = dog; // Методы только Object

        Object object = myDogArrayList.get(0);
//        Dog dog = (Dog) o; //Если уверен

//        ОПЯТЬ НЕ РАБОТАЕТ ТО ЧТО В КНИГЕ
//        if (o instanceof Dog) // По идее если не уверен
//            Dog dog = (Dog) o;
    }

    public void go() {
        Dog aDog = new Dog();
//        Bad
//        Dog sameDog = getObject(aDog); //Don't work
//        Dog sameDog = (Dog) getObject(aDog); // Work

//        Good
        Object sameDog = getObject(aDog);
    }

    public Object getObject(Object o) {
        return o;
    }
}
