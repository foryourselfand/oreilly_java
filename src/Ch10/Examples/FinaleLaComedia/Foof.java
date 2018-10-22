package Ch10.Examples.FinaleLaComedia;

public class Foof {
    final int size = 3;//Нельзя изменить ращмер
    final int whuffie;

    Foof() {
        whuffie = 42; //Нельзя изменить значение whuffie
    }

    void doStuff(final int x) {
        //Нельзя изменить x
    }

    void doMore() {
        final int z = 7;
        //Нельзя изменить z
    }

    final void calcWhoffie() {
        //Важные вещи, которые никогда не должны быть переопределены
    }
}
