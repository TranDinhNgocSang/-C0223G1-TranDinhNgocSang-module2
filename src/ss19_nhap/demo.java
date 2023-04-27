package ss19_nhap;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;

public class demo {
    public static void main(String[] args) {
        Date date = new Date(1998-1900,3-1,1);
        date.setYear(1998);
        Date date1 = new Date(System.currentTimeMillis());
        System.out.println(date);
        System.out.println(date1);
        date1.toLocalDate();
        date.toLocalDate();
        int old = Period.between(date.toLocalDate(),date1.toLocalDate()).getYears();
        System.out.println(old);
    }
}
