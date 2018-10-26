package Ch16.Examples;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeTest {
    public static void main(String[] args) {
        new TreeTest().go();
    }

    public void go(){
        Book b1 = new Book("Как устроены кошки");
        Book b2 = new Book("Постройте заново свое тело");
        Book b3 = new Book("В поисках Эмо");

        TreeSet<Book> treeOne = new TreeSet<Book>();
        treeOne.add(b1);
        treeOne.add(b2);
        treeOne.add(b3);
        System.out.println(treeOne);

        TreeSet<Book> treeTwo = new TreeSet<Book>(new BookCompare());
        treeTwo.add(b1);
        treeTwo.add(b2);
        treeTwo.add(b3);
        System.out.println(treeTwo);
    }

    public class BookCompare implements Comparator<Book> {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getTitle().compareTo(o2.getTitle());
        }
    }
}
