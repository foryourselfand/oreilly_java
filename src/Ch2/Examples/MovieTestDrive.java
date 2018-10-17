package Ch2.Examples;

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Как Прогореть на акциях";
        one.genre = "Трагедия";
        one.rating = -2;

        Movie two = new Movie();
        two.title = "Потеряный в Офисе";
        two.genre = "Комедия";
        two.rating = 5;

        Movie three = new Movie();
        three.title = "Байт-Клуб";
        three.genre = "Трагедия, но в целом веселая";
        three.rating = 127;
    }
}
