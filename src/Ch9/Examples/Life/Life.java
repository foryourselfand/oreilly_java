package Ch9.Examples.Life;

public class Life {
    int size;

    public void setSize(int s) {
        size = s;
        // s исчезает
        // но size может быть использована в любом месте класса
    }
}
