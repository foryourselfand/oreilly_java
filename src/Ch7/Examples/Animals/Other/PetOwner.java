package Ch7.Examples.Animals.Other;

import Ch7.Examples.Animals.Dog;
import Ch7.Examples.Animals.Hippo;

public class PetOwner {
    public void start() {
        Vet v = new Vet();
        Dog d = new Dog();
        Hippo h = new Hippo();
        v.giveShot(d);
        v.giveShot(h);
    }
}
