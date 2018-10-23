package Ch12.Examples.Poly;

public class Foo {
    public void go() {
        Laundry laundry = new Laundry();
        try {
            laundry.doLaundry();
        } catch (PantsException pex) {
            //Восстановительный код
            pex.printStackTrace();
        } catch (LingerieException lex) {
            //Восстановительный код
            lex.printStackTrace();
        }

        try {
            laundry.doLaundry();
        } catch (ClothingException cex) { // Может поймать любой поддип ClothingException
            //Восстановительный код
        }

        try {
            laundry.doShirtLaundry();
        } catch (ShirtException cex) { // Может поймать только TeeShirtException и DressShirtException
            //Восстановительный код
        }

        //Не стоит так делать
        try {
            laundry.doLaundry();
        } catch (Exception ex) {
            //Что он восстанавливает? Этот блок перехватывает все
            //Поэтому нельзя автоматически узнать что именно пошло не так
        }

        //Делать так
        try {
            laundry.doBigLaundry();
        } catch (TeeShirtException tex) {
            //Восстановление после TeeShirtException
        } catch (LingerieException lex) {
            //Восстановление после Lingerie
        } catch (ClothingException cex) {
            //Восстановление после всего остального
        }

        //Множественные блоки catch должны распологаться по возрастанию
        //От наименьшего к наибольшему

        //Не делать так. Не скомпилируется.
//        try {
//            laundry.doBigLaundry();
//        } catch (ClothingException cex){
        //Компилятор поймет что смысла добавлять другие блоки нет
        //Восстановление после ClothingException
//        } catch (LingerieException lex){
//            //Восстановление после LingerieException
//        } catch (ShirtException sex){
//            //Восстановление после ShirtException
//        }
    }
}
