package exam01;

import java.util.Calendar;

public class Ex01 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        printDate(cal);

        //cal.set(Calendar.MONTH, 11);
        cal.add(Calendar.DAY_OF_MONTH, 150); //150일 후

        printDate(cal);

        cal.add(Calendar.DAY_OF_MONTH, -100); //100일 전

        printDate(cal);
    }
    public static void printDate(Calendar cal) {
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        System.out.printf("year = %d, month = %d, day = %d\n", year, month+1, day);
    }
}


