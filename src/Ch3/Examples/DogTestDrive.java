package Ch3.Examples;

public class DogTestDrive {
    public static void main(String[] args) {
        //Создадим объект Dog и получаем к нему доступ
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Барт";

        //Теперь создадим массив типа Dog
        Dog[] myDogs = new Dog[3];
        //и поместим в него несколько элементов
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        //Теперь получаем доступ к объектам Dog с помощью ссылок массива
        myDogs[0].name = "Фред";
        myDogs[1].name = "Джордж";

        //Хммм... какое имя у myDogs[2]?
        System.out.println("Имя последней собаки - " + myDogs[2].name);

        //Теперь перебираем все элементы массива и вызовем для каждого метод bark()
        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;
        }
    }
}
