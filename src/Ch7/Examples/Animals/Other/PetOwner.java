package Ch7.Examples.Animals.Other;

import Ch7.Examples.Animals.Hippo;
import Ch8.Examples.Animals.Dog;

public class PetOwner {
    public void start() {
        Vet v = new Vet();
        Dog d = new Dog();
        Hippo h = new Hippo();
        v.giveShot(d);
        v.giveShot(h);
    }
}
