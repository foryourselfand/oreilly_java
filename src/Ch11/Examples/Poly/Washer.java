package Ch11.Examples.Poly;

public class Washer {
    Laundry laundry = new Laundry();

    public static void main(String[] args) {
        //Оба метода пробрасывают исключение, но код все равно скомпилируется
        Washer a = new Washer();
        a.foo();
    }

    // ОБРАБОТКА
    public void bar() {
        try {
            laundry.doLaundry();
        } catch (LingerieException | PantsException e) {
            e.printStackTrace();
        }
    }

    // ОБЪЯВЛЕНИЕ (переброс)
    //Откладываем неизбежное.
    public void foo() {
        laundry.doBigLaundry();
    }
}
