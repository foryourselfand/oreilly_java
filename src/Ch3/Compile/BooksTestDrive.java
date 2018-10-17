package Ch3.Compile;

public class BooksTestDrive {
    public static void main(String[] args) {
        Books[] myBooks = new Books[3];

        //
        for (int i = 0; i < myBooks.length; i++)
            myBooks[i] = new Books();

        myBooks[0].title = "Плоды Java";
        myBooks[1].title = "Java Гетсби";
        myBooks[2].title = "Сборник рецептов по Java";

        myBooks[0].author = "Боб";
        myBooks[1].author = "Сью";
        myBooks[2].author = "Ян";

        int x = 0;
        while (x < 3) {
            System.out.println(myBooks[x].title + ", автор - " + myBooks[x].author);
            x = x + 1;
        }
    }
}
