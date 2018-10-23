package Ch11.Examples.Poly;

public class Laundry {
    public void doLaundry() throws PantsException, LingerieException {
        //Код, который может выбрасить оба исключения
    }

    public void doShirtLaundry() throws TeeShirtException, DressShirtException {
        //Код, который может выбрасить оба исключения
    }

    public void doBigLaundry() throws ClothingException, ShirtException {
        //Код, который может выбрасить оба исключения
    }
}
