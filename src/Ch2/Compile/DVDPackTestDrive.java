package Ch2.Compile;

public class DVDPackTestDrive {
    public static void main(String[] args) {
        DVDPlayer d = new DVDPlayer();
        d.canRecord = true;
        d.playDVD();

        if (d.canRecord == true)
            d.recordDVD();
    }
}
