package Ch10.Examples.Primat;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        int x = 32;
        ArrayList list = new ArrayList();
        list.add(x);

        int i = 288;
        Integer iWrap = new Integer(i);
//        Integer iWrap = i;
        System.out.println(iWrap);

        int unWrapped = iWrap.intValue();
//        int unWrapped = iWrap;
        System.out.println(unWrapped);

        Integer integer = new Integer(42);
        integer++;

        Integer j = new Integer(5);
        Integer k = j + 3;
    }

    public void DoNumsOldWay() {
        ArrayList listOfNumbers = new ArrayList();
        listOfNumbers.add(new Integer(3));
        Integer one = (Integer) listOfNumbers.get(0);
        int intOne = one.intValue();
    }

    public void doNumsNewWay() {
        ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
        listOfNumbers.add(3);
        int num = listOfNumbers.get(0);
    }
}
