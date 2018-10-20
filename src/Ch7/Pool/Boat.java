package Ch7.Pool;

public class Boat {
    private int length;

    public void setLength(int len) {
        length = len;
    }

    public int getLenght() {
        return length;
    }

    public void move() {
        System.out.print("Дрейф ");
    }
}
