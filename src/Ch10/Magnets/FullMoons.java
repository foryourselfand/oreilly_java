package Ch10.Magnets;

import java.util.Calendar;

import static java.lang.System.out;

public class FullMoons {
    static int DAY_IM = 1000 * 60 * 60 * 24;

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2004, Calendar.FEBRUARY, 7, 15, 40);
        out.println(String.format("Полнолуние было в %tc", c));

        long day1 = c.getTimeInMillis();

        // Ошибка в книге
//        for (int x = 0; x < 60; x++){
//            day1 += (DAY_IM * 29.52);
//            c.setTimeInMillis(day1);
//            out.println(String.format("Полнолуние было в %tc", c));
//        }

        day1 += (DAY_IM * 29.52);
        c.setTimeInMillis(day1);
        out.println(String.format("Полнолуние было в %tc", c));

        day1 += (DAY_IM * 29.52);
        c.setTimeInMillis(day1);
        out.println(String.format("Полнолуние было в %tc", c));
    }
}

//import static java.lang.System.out;
//import java.io.*;
//import java.util.*;
