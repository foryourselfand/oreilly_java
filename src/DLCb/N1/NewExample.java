package DLCb.N1;

public class NewExample {
    public Members selectedBandMember;

    //пропускаем несколько десятков строк

    public static void main(String[] args) {
        new NewExample().go();
    }

    private void go() {
        if (selectedBandMember == Members.JERRY) {
            //Выполняем действия связанные с JERRY
        }

        Members n = Members.BOBBY;
        if (n.equals(Members.JERRY))
            System.out.println("Джеррррри!");
        if (n == Members.BOBBY)
            System.out.println("Боббббби!");

        Members ifName = Members.PHIL;
        switch (ifName) {
            case JERRY:
                System.out.println("пусть споет");
            case PHIL:
                System.out.println("углубляйся, ");
//                break;
            case BOBBY:
                System.out.println("Кэссиди!");
        }
    }
}
