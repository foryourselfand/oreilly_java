package Ch6.Examples;

import java.util.ArrayList;

public class TestingArrayList {
    public static void main(String[] args) {
        //Создаем
        ArrayList<String> myList = new ArrayList<String>();

        //Кладем
        String s = "a";
        myList.add(s);

        //Кладем еще
        String b = "b";
        myList.add(b);

        //Сколько элементов
        int theSize = myList.size();

        //Содержит ли
        boolean isIn = myList.contains(s);

        //Где хранится (индекс)
        int idx = myList.indexOf(b);

        //Не пустой ли
        boolean empty = myList.isEmpty();

        //Удаляем
        myList.remove(s);
    }
}
