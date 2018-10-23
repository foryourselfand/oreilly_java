package Ch12.Examples;

public class ExceptionsTest {
    public static void main(String[] args) {
        Exp x = new Exp();
        try {
            Foo f = x.doRiskyThing("no");
            int b = f.getNum();
        } catch (Exception e) {
            System.out.println("Неудача"); // Никогда не запустится
        }
        System.out.println("Мы это сделали!");

        try {
            Foo f = x.doRiskyThing("yes");
            int b = f.getNum();//Не запустится
        } catch (Exception e) {
            System.out.println("Неудача");
        } finally {
            // Выполнится независимо от того, было ли выброшено исключение
            // Если try или catch содержат return сначала перейдет к finally потом вернется к return
        }
        System.out.println("Мы это сделали");
    }

    public void takeRisk() throws Exception {
        if (true)
            throw new Exception();
    }

    public void crossFingers() {
        try {
            takeRisk();
        } catch (Exception ex) {
            System.out.println("Aax");
            ex.printStackTrace();
        }
    }
}
