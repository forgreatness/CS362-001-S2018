/** A JUnit test class to test the class CalDay. */

package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalDay;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.LinkedList;


public class CalDayTest{
    //Construct the CalDay with a calendar day
    @Test(timeout = 4000)
    public void test00()  throws Throwable  {
        DataHandler datahandler = new DataHandler();
        CalDay cald = new CalDay();
        GregorianCalendar day = new GregorianCalendar(1997, 3, 15);
        CalDay cald0 = new CalDay(day);
        Appt appt0 = new Appt(11, 12, 15, 3, 1997, "H", null, null); //use for addAppt()
        appt0.setValid();
        cald0.addAppt(appt0);
        Appt appt0a = new Appt(0, 5, 15, 3, 1997, "I", null, null); //use for addAppt()
        appt0a.setValid();
        cald0.addAppt(appt0a);
        Appt appt0b = new Appt(12, 46, 10, 3, 1997, "J", "I", "I"); //use for addAppt()
        appt0b.setValid();
        cald0.addAppt(appt0b);
        assertTrue(cald0.isValid()); //check whether the calendar day object is valid
        //System.out.println(cald0.iterator());
        //System.out.println(cald0.toString());
        //System.out.println(cald0.getFullInfomrationApp(cald0));
        //System.out.println(cald0.getSizeAppts());
    }


    @Test(timeout = 4000)
    public void test01()  throws Throwable  {
        DataHandler datahandler = new DataHandler();
        GregorianCalendar day = new GregorianCalendar(1997, 3, 15);
        CalDay cald = new CalDay(day);
        Appt appt0 = new Appt(12, 10, 1, 3, 1997, "J", "J", "J");
        appt0.setValid();
        cald.addAppt(appt0);
        assertEquals("4-15-1997 \n\t0:10AM J J ", cald.getFullInfomrationApp(cald));
        assertEquals("\t --- 5/15/1997 --- \n --- -------- Appointments ------------ --- \n\t3/1/1997 at 12:10pm ,J, J\n \n", cald.toString());
        System.out.println(cald.toString());

    }
    

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        DataHandler datahandler = new DataHandler();
        GregorianCalendar day = new GregorianCalendar(1997, 3, 15);
        CalDay caldays0 = new CalDay();
        String strong0 = caldays0.toString();
        assertEquals(0, caldays0.getDay());
        assertEquals(0, caldays0.getMonth());
        assertEquals(0, caldays0.getYear());
        CalDay caldays1 = new CalDay(day);
        LinkedList<Appt> appt = new LinkedList();
        assertEquals(caldays1.appts, appt);
        
        
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        DataHandler datahandler = new DataHandler();
        GregorianCalendar calendar = new GregorianCalendar(2020, 4, 20);
        CalDay caldays1 = new CalDay(calendar);
        Appt appt0 = new Appt(0, 30, 9, 10, 2018, "Birthday party", "This is a party", "What@what");
        Appt appt1 = new Appt(0, 10, 9, 12, 2018, "Birthday shiet", "What", "Bull");
        caldays1.addAppt(appt1);
        caldays1.addAppt(appt0);
        caldays1.getFullInfomrationApp(caldays1);
        assertEquals(2, caldays1.getSizeAppts());
        String string1 = caldays1.toString();
        
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        DataHandler datahandler = new DataHandler();
        int thismonth = 5;
        int thisday = 5;
        int thisyear = 2018;
        GregorianCalendar calendar = new GregorianCalendar(thisyear, thismonth, thisday);
        Appt appt0 = new Appt(15, 30, 9, 10, 2018, "Birthday", "party", "zys@that.com");
        CalDay calday = new CalDay(calendar);
        calday.addAppt(appt0);
        assertEquals(thisday, calday.getDay());
        assertEquals(thismonth + 1, calday.getMonth());
        assertEquals(thisyear, calday.getYear());
        assertEquals(1, calday.getSizeAppts());
        calday.getAppts();
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        DataHandler datahandler = new DataHandler();
        GregorianCalendar calendar = new GregorianCalendar(20, 1, 1);
        CalDay caldays0 = new CalDay(calendar);
        Appt appt0 = new Appt(0, 0, 1, 1, 2000, "Cmon", "work", "Please@what");
        caldays0.addAppt(appt0);
        String apptinfo = caldays0.getFullInfomrationApp(caldays0);
        assertEquals(apptinfo, caldays0.getFullInfomrationApp(caldays0));
    }

    @Test(timeout = 4000)
        public void test06() throws Throwable {
        int startHour = 1;
        int startMinute = 1;
        int startDay = 1;
        int startMonth = 6;
        int startYear = 2017;
        String title = "Birthday Party";
        String description = "This is my birthday party.";

        Appt appt = new Appt(startHour,
                startMinute,
                startDay,
                startMonth,
                startYear,
                title,
                description,
                null);
        startHour = 11;
        startMinute = 30;
        startDay = 7;
        startMonth = 8;
        startYear = 2017;
        title = "Birthday Party";
        description = "This is my birthday party.";

        Appt appt_2 = new Appt(startHour,
                startMinute,
                startDay,
                startMonth,
                startYear,
                title,
                description,
                null);

        GregorianCalendar today = new GregorianCalendar(2, 3, 4);
        CalDay c = new CalDay(today);
        c.addAppt(appt);
        c.addAppt(appt_2);
        c.isValid();
        c.getDay();
        c.getMonth();
        c.getYear();
        c.toString();
        c.iterator();

    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        int startHour = 70;
        int startMinute =82 ;
        int startDay = 1;
        int startMonth = 6;
        int startYear = 2017;
        String title = "Birthday Party";
        String description = "This is my birthday party.";
        String email = "what@edu";        
        Appt appt = new Appt(startHour,
                startMinute,
                startDay,
                startMonth,
                startYear,
                title,
                description,
                email);


        startHour = 11;
        startMinute = 30;
        startDay = 7;
        startMonth = 8;
        startYear = 2017;
        title = "Birthday Party";
        description = "This is my birthday party.";

        Appt appt_2 = new Appt(startHour,
                startMinute,
                startDay,
                startMonth,
                startYear,
                title,
                description,
                email);





        GregorianCalendar today = new GregorianCalendar(2, 3, 4);
        CalDay c = new CalDay(today);
        c.addAppt(appt);

        c.addAppt(appt_2);
        c.isValid();
        c.getDay();
        c.getMonth();
        c.getYear();
        c.toString();
        c.iterator();

        c.iterator();
        assertNotNull(c.iterator());

        CalDay c1 = new CalDay();
        assertNull(c1.iterator());

    }
    
    @Test(timeout=4000)
    public void test10() throws Throwable {
        int startHour = -5;
        int startMinute = 30;
        int startDay = 10;
        int startMonth = 4;
        int startYear = 2017;
        String title = "Birthday Party";
        String description = "This is my birthday party.";
        String email = "danhisher@what";

        Appt appt = new Appt(13,
                startMinute,
                startDay,
                startMonth,
                startYear,
                title,
                description,
                email);

        Appt appt2 = new Appt(13,
                startMinute,
                startDay,
                startMonth,
                startYear,
                title,
                description,
                email);

        GregorianCalendar today = new GregorianCalendar(2, 3, 4);
        CalDay c = new CalDay(today);
        c.addAppt(appt);
        c.addAppt(appt2);

        assertEquals(2,c.getSizeAppts());
        c.getDay();
        assertEquals(4,c.getDay());


        CalDay c2 = new CalDay();

        assertEquals(0,c2.getYear());

        assertNotNull(c2.toString());
        c2.toString();
        Appt baap = new Appt(startHour,
                startMinute,
                startDay,
                startMonth,
                startYear,
                title,
                description,
                email);
        c.addAppt(baap);
        assertNotNull(appt.getStartHour());


    }

 

}
