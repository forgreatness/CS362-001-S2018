/** A JUnit test class to test the class CalDay. */

package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalDay;
import java.util.GregorianCalendar;


public class CalDayTest{
    //Construct the CalDay with a calendar day
    @Test(timeout = 4000)
    public void test00()  throws Throwable  {
        CalDay cald = new CalDay();
        GregorianCalendar day = new GregorianCalendar(1997, 3, 15);
        CalDay cald0 = new CalDay(day);
        Appt appt0 = new Appt(11, 12, 15, 3, 1997, "H", null, null); //use for addAppt()
        appt0.setValid();
        cald0.addAppt(appt0);
        Appt appt0a = new Appt(2, 5, 15, 3, 1997, "I", null, null); //use for addAppt()
        appt0a.setValid();
        cald0.addAppt(appt0a);
        Appt appt0b = new Appt(0, 46, 15, 3, 1997, "J", null, null); //use for addAppt()
        appt0b.setValid();
        cald0.addAppt(appt0b);
        assertTrue(cald0.isValid()); //check whether the calendar day object is valid
        System.out.println(cald0.iterator());
        System.out.println(cald0.toString());
        System.out.println(cald0.getFullInfomrationApp(cald0));
        System.out.println(cald0.getSizeAppts());



    }
    @Test(timeout = 4000)
    public void test01()  throws Throwable  {
        CalDay cald1 = new CalDay();
        cald1.iterator();
        GregorianCalendar day1 = new GregorianCalendar(2000, 3, 15);
        CalDay cald1a = new CalDay(day1);
        Appt appt1a = new Appt(14, 12, 30, 4, 1000, "pm hours", null, null);
        cald1a.addAppt(appt1a);
        cald1a.getFullInfomrationApp(cald1a);
        cald1a.toString();

    }

}
