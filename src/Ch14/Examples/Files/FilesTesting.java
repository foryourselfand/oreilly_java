package Ch14.Examples.Files;

import java.io.File;

public class FilesTesting {
    public static void main(String[] args) {
//        new FilesTesting().go();
    }

    private void go() {
        //Создать объект File, представляющий существубщий файл
        File f = new File("MyCode.txt");

        //Создать новый каталог
        File dir = new File("Chapter7");
        dir.mkdir();

        //Вывести содержимое каталога
        if (dir.isDirectory()) {
            String[] dirContents = dir.list();
            for (int i = 0; i < dirContents.length; i++) {
                System.out.println(dirContents[i]);
            }
        }

        //Получить абсолютный путь файла или каталога
        System.out.println(dir.getAbsolutePath());

        //Удалить файл или каталог (при выполнении возвращает true)
        boolean isDeleted = f.delete();
    }

}
