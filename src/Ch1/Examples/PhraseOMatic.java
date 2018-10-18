package Ch1.Examples;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {
                "круглосуточный", "трех-звенный", "30000-футовый",
                "взаимный", "обоюдный выигрышь", "фронтэнд", "на основе веб технологий",
                "проникающий", "умный", "шесть сигм", "метод критического пути",
                "динамичный",};
        String[] wordListTwo = {
                "уполномоченный", "трудный", "чистый продукт"
                , "ориентированный", "центральный", "распределенный", "кластеризованный",
                "фирменный", "нестандартный ум", "позиционированный", "сетевой",
                "сфокусированный", "использованный с выгодой", "выровненный", "нацеленный на",
                "общий", "совместный", "ускоренный"};
        String[] wordListThree = {
                "процесс", "пункт разгрузки", "выход из положения",
                "тип структуры", "талант", "подход", "уровень завоеванного внимания",
                "портал", "период времени", "обзор", "обзор", "образец", "пункт следования",};

        //
        int lengthOne = wordListOne.length;
        int lengthTwo = wordListTwo.length;
        int lengthThree = wordListThree.length;

        //
        int rand1 = (int) (Math.random() * lengthOne);
        int rand2 = (int) (Math.random() * lengthTwo);
        int rand3 = (int) (Math.random() * lengthThree);

        //
        String phrase = wordListOne[rand1] + " " +
                wordListTwo[rand2] + " " +
                wordListThree[rand3];

        //
        System.out.println("Все, что вам нужно, - это " + phrase);
    }
}
