
/** A JUnit test class to test the class DataHandler. */


package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalDay;
import calendar.DataHandler;

import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Calendar;


public class DataHandlerTest{

    @Test(timeout = 4000)
    public void test00()  throws Throwable  {
        DataHandler DH0 = new DataHandler("lame", false);
        Appt appt0 = new Appt(0, 12, 14, 0, 2017, "invalid appt", null, null);
        Appt appt1 = new Appt(0, 0, 1, 1, 1, "What", "is nguyen", "sie.si@gmail.coM");
        GregorianCalendar dayA = new GregorianCalendar(0, 1, 1);
        GregorianCalendar dayB = new GregorianCalendar(1, 1, 31);
        int []recur0 = {3,5};
        int []recur1 = {2};
        appt0.setRecurrence(null,3, 1, -1);
        appt1.setRecurrence(null, 2, 3, -1);
        appt0.setValid();
        appt1.setValid();
        assertFalse(DH0.saveAppt(appt0));
        assertTrue(DH0.saveAppt(appt1));
        List<CalDay> rangeA = DH0.getApptRange(dayA,dayB);
        assertFalse(DH0.deleteAppt(appt0));
        assertTrue(DH0.deleteAppt(appt1));
        List<CalDay> rangeB = DH0.getApptRange(dayA,dayB);
        assertTrue(DH0.save());
        
        
       
        
        

        //invalid appt
        Appt appt2 = new Appt(4, -1, 1, 1, 1, "Invalid", "stuff", "what.com");
        appt2.setValid();
        assertEquals(false,DH0.saveAppt(appt2));
        assertEquals(false,DH0.deleteAppt(appt2));
        
        //uninitialize datahandler
        DataHandler DH1 = new DataHandler();
        //DataHandler DH2 = new DataHandler(null);
        DH1.getApptRange(dayA,dayB);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        DataHandler DH0 = new DataHandler("wow");
        Appt appta = new Appt(12, 10, 1, 1, 1, "valid stuff", null, null);
        Appt apptb = new Appt(1, 10, 1, 1, 1, "valid 2 stuff", "birthday", "gmail");
        Appt apptc = new Appt(1, 0, 14, 1, 1, "valid 3 stuff", "party", "yahoo");
        Appt apptd = new Appt(1, 59, 31, 1, 1, "valid 4 stuff", "party", "yahoo");
        GregorianCalendar dayA = new GregorianCalendar(1, 1, 1);
        GregorianCalendar dayB = new GregorianCalendar(1, 1, 15);
        int []recur0 = {3};
        int []recur1 = {1,2,3};
        int []recur2 = {1,2,3,4,5,6,7};
        int []recur3 = {};
        appta.setRecurrence(recur0, 1, 1, 2);
        apptb.setRecurrence(recur1, 1, 2, 2);
        apptc.setRecurrence(recur2, 2, 2, 2);
        apptd.setRecurrence(recur3, 2, 1, 2);
        DH0.saveAppt(appta);
        DH0.saveAppt(apptb);
        DH0.saveAppt(apptc);
        DH0.saveAppt(apptd);
        System.out.println(DH0.getApptRange(dayA,dayB));
        
        
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        DataHandler DH0 = new DataHandler("shame");
        Appt appt0 = new Appt(12, 10, 1, 1, 1, "valid stuff", null, null);
        Appt appt1 = new Appt(1, 10, 1, 1, 1, "valid 2 stuff", null, null);
        GregorianCalendar dayA = new GregorianCalendar(1, 1, 1);
        GregorianCalendar dayB = new GregorianCalendar(1, 1, 2);
        int []recur0 = {3,5,6};
        int []recur1 = {2};
        appt0.setRecurrence(recur0, 2, 2, 0);
        appt1.setRecurrence(recur1, 1, 2, 0);
        DH0.saveAppt(appt0);
        DH0.saveAppt(appt1);
        GregorianCalendar dayC = new GregorianCalendar(1, 1, 1);
        CalDay cald = new CalDay(dayC);
        DH0.getApptRange(dayA,dayB);
        //assertEquals("[\t --- 3/1/1 --- \n --- -------- Appointments ------------ --- \n\n]", DH0.getApptRange(dayA,dayB)); 
    }

    @Test(timeout = 4000)
    public void test02()  throws Throwable  {
        DataHandler DH0 = new DataHandler("lame", false);
        Appt appt0 = new Appt(0, 12, 1, 1, 1, "invalid appt", null, null);
        Appt appt1 = new Appt(0, 0, 1, 1, 1, "What", "is nguyen", "sie.si@gmail.coM");
        GregorianCalendar dayA = new GregorianCalendar(0, 1, 1);
        GregorianCalendar dayB = new GregorianCalendar(1, 1, 31);
        int []recur0 = {3,5};
        int []recur1 = {2};
        appt0.setRecurrence(null,3, 1, -1);
        appt1.setRecurrence(null, 2, 3, -1);
        appt0.setValid();
        appt1.setValid();
        assertTrue(DH0.saveAppt(appt0));
        assertTrue(DH0.saveAppt(appt1));

        //invalid appt
        Appt appt2 = new Appt(4, -1, 1, 1, 1, "Invalid", "stuff", "what.com");
        appt2.setValid();
        assertEquals(false,DH0.saveAppt(appt2));
        assertEquals(false,DH0.deleteAppt(appt2));
        
        //uninitialize datahandler
        DataHandler DH1 = new DataHandler();
        
        


    }



    @Test(timeout = 4000)
    public void test01()  throws Throwable  {
        DataHandler DH1a = new DataHandler();
        DataHandler DH1b = new DataHandler("shame");
        DataHandler DH1 = new DataHandler("tree",true);
        GregorianCalendar dayC = new GregorianCalendar(2011, 03, 15);
        GregorianCalendar dayD = new GregorianCalendar(2012, 03, 15);
        CalDay caldC = new CalDay(dayC);
        Appt apptC1 = new Appt(0, 12, 20, 4, 2011, "Danh", null, null);
        Appt apptC2 = new Appt(0, 12, 24, 5, 2011, "Nguyen", null, null);
        apptC2.setXmlElement(null);
        int[] recurC1 = {};
        apptC1.setRecurrence(recurC1, 1, 2, 3);
        int[] recurC2 = {};
        apptC2.setRecurrence(recurC2, 3, 2, 3);
        caldC.addAppt(apptC1);
        caldC.addAppt(apptC2);
        DH1.saveAppt(apptC1);
        DH1.saveAppt(apptC2);
        List<CalDay> rangeA = DH1.getApptRange(dayC,dayD);
        DH1.deleteAppt(apptC1);
        DH1.deleteAppt(apptC2);
        
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        DataHandler DH0 = new DataHandler();
        GregorianCalendar dayC = new GregorianCalendar(2011, 03, 15);
        GregorianCalendar dayD = new GregorianCalendar(2012, 03, 15);
        CalDay caldC = new CalDay(dayC);
        Appt apptC1 = new Appt(0, 12, 20, 4, 2011, "Danh", null, null);
        Appt apptC2 = new Appt(0, 12, 24, 5, 2011, "Nguyen", null, null);
        apptC2.setXmlElement(null);
        int[] recurC1 = {2,5,6};
        apptC1.setRecurrence(recurC1, 1, 2, 0);
        int[] recurC2 = {3,5};
        apptC2.setRecurrence(recurC2, 3, 2, 0);
        caldC.addAppt(apptC1);
        caldC.addAppt(apptC2);
        assertTrue(DH0.saveAppt(apptC1));
        assertTrue(DH0.saveAppt(apptC2));
        DH0.getApptRange(dayC,dayD);
        assertTrue(DH0.deleteAppt(apptC1));
        assertTrue(DH0.deleteAppt(apptC2));
        DH0.getApptRange(dayC, dayD);        
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        DataHandler DH0 = new DataHandler();
        Calendar rightnow = Calendar.getInstance();
        Appt appt = new Appt(0, 30, 6, 5, 2018, "birthday", "what", "what@edu");
        LinkedList<Appt> appts = new LinkedList<Appt>();
        appts.add(appt);
        Appt appt2 = new Appt(0, 30, 7, 5, 2018, "party", "birthday", "shame@edu");
        appts.add(appt2);
        Appt appt3 = new Appt(0, 30, 5, 5, 2018, "party", "graduation", "lame@edu");
        appts.add(appt3);
        Appt appt4 = new Appt(0, 30, 4, 5, 2018, "party", "retirement", "good@edu");
        appts.add(appt4);

        int []recurringDays = new int[0];
        appt.setRecurrence(recurringDays, 2, 0, 1);
        GregorianCalendar firstDay = new GregorianCalendar(2018,5,6);
        GregorianCalendar lastDay = (GregorianCalendar)firstDay.clone();
        lastDay.add(Calendar.DAY_OF_MONTH,1);

        try{
            DH0.getApptRange(firstDay, lastDay);
        }

        catch( NullPointerException e)
        {
        
        }

    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        DataHandler DH0 = new DataHandler();
        Calendar rightnow = Calendar.getInstance();
        Appt appt = new Appt(0, 30, 6, 5, 2018, "birthday", "shame", "what@edu");
        LinkedList<Appt> appts = new LinkedList<Appt>();
        appts.add(appt);
        Appt appt2 = new Appt(0, 30, 5, 5, 2018, "party", "lame", "is@edu");
        appts.add(appt2);
        Appt appt3 = new Appt(0, 30, 5, 15, 2018, "invalid", "shit", "what@edu");
        appts.add(appt3);
        Appt appt4 = new Appt(0, 30, 5, 6, 2018, "Wow", "cool", "osu@edu");
        appts.add(appt4);

        /*int []recurringDays = new int[0];
        appt.setRecurrence(recurringDays, 2, 0, 1);

        GregorianCalendar firstDay = new GregorianCalendar(2018,5,6);
        GregorianCalendar lastDay = (GregorianCalendar)firstDay.clone();
        lastDay.add(Calendar.DAY_OF_MONTH, -1);

        try{
            DH0.getApptRange(firstDay, lastDay);
        }

        catch( NullPointerException e)
        {
        
        }*/
    }
}
