package Ch4.Magnets;

public class Puzzle4 {
    int ivar;

    public int doStuff(int factor) {
        if (ivar > 100)
            return ivar * factor;
        else
            return ivar * (5 - factor);
    }
}