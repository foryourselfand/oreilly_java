package Ch2.Compile;

public class TapeDuckTestDrive {
    public static void main(String[] args) {
        //
        TapeDuck t = new TapeDuck();

        t.canRecord = true;
        t.playTape();

        if (t.canRecord == true)
            t.recordTape();
    }
}
