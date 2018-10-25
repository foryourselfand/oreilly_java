package DLCb.N6;

public class RelatedMethods {
    public static void main(String[] args) {
        new RelatedMethods().go();//Экземпляр не интересует
    }

    public void go(){ //Вот что мы хотим делать на самом деле
        StringBuffer sb = new StringBuffer("весна");
        sb = sb.deleteCharAt(0).insert(0, "л").delete(2, 5).append("то");
        System.out.println(sb);
    }
}
