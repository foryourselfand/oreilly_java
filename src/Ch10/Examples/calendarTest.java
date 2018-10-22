package Ch10.Examples;

import java.util.Calendar;

public class calendarTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2018, Calendar.OCTOBER, 22, 16, 31);


        long day1 = c.getTimeInMillis();
        day1 += 1000 * 60 * 60;
        c.setTimeInMillis(day1);
        System.out.println("Новый час " + c.get(Calendar.HOUR_OF_DAY));

        c.add(Calendar.DATE, 35);
        System.out.println("Добавить 35 дней " + c.getTime());

        c.roll(Calendar.DATE, 15);
        System.out.println("Прокрутить 15 дней " + c.getTime());

        c.set(Calendar.DATE, 1);
        System.out.println("Установить дату в 1 " + c.getTime());
    }
}
