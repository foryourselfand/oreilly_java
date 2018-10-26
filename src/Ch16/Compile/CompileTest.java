package Ch16.Compile;

import Ch8.Examples.Animals.Animal;
import Ch8.Examples.Animals.Cat;
import Ch8.Examples.Animals.Dog;

import java.util.ArrayList;
import java.util.List;

public class CompileTest {
    public static void main(String[] args) {
//        ArrayList<Dog> dogs1 = new ArrayList<Animal>();

//        ArrayList<Animal> animals1 = new ArrayList<Dog>();

        List<Animal> list = new ArrayList<Animal>();

        ArrayList<Dog> dogs = new ArrayList<Dog>();

//        ArrayList<Animal> animals = dogs;

//        List<Dog> dogList = dogs;

        ArrayList<Object> objects = new ArrayList<Object>();

        List<Object> objectList = objects;

//        ArrayList<Object> objectArrayList = new ArrayList<Dog>();
    }
}
