package Ch6.Examples;

import java.util.ArrayList;

public class AnotherTestArrayString {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        String[] array = new String[2];

        String a = "Yra";

        list.add(a);
        array[0] = a;

        String b = "Frog";

        list.add(b);
        array[1] = b;

        int sizeList = list.size();
        int sizeArray = array.length;

        Object oList = list.get(1);
        String oArray = array[1];

        list.remove(1);
        array[1] = null;

        boolean isInList = list.contains(b);
        boolean isInArray = false;
        for (String item : array) {
            if (b.equals(item)) {
                isInArray = true;
                break;
            }
        }
    }
}
