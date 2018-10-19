package Ch6.Magnets;

import java.util.ArrayList;

public class ArrayListMagnet {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add(0, "ноль");
        a.add(1, "один");
        a.add(2, "два");
        a.add(3, "три");
        printAll(a);

        a.remove(2);

        if (a.contains("два"))
            a.add("2.2");

        if (a.contains("три"))
            a.add("четыре");
        printAll(a);


        if (a.indexOf("четыре") != 4)
            a.add(4, "4.2");

        printAll(a);
        printAll(a);
    }

    public static void printAll(ArrayList<String> al) {
        for (String element : al) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }
}
