/** A JUnit test class to test the class ApptTest. */

package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalendarUtil;
public class ApptTest  {

    @Test(timeout = 4000)
    public void test00()  throws Throwable  {
        Appt appt0 = new Appt(15, 30, 9, 14, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
        appt0.getEmailAddress();
        String string0 = appt0.toString();
        assertEquals(2, appt0.getRecurBy());
        assertFalse(appt0.isRecurring());
        assertEquals("\t14/9/2018 at 3:30pm ,Birthday Party, This is my birthday party\n", string0);
        assertEquals(0, appt0.getRecurIncrement());
        appt0.setValid();
    }

    @Test(timeout = 4000)
    public void test02()  throws Throwable  {
        Appt appt2 = new Appt(0, -3, 9, 12, 2018, "Birthday Party", "This is my friend's birthday party", "what@edu");
        appt2.setValid();
        appt2.getXmlElement();
        assertFalse(appt2.getValid());
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        Appt appt3 = new Appt(0, 3, 9, 12, 2018, null, null, null);
        appt3.setValid();
        Boolean check = appt3.isOn(9, 12, 2018);
        appt3.hasTimeSet();

    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        Appt appt4 = new Appt(15, 3, 0, "What", null, null);
        appt4.setValid();
        appt4.isOn(15,3,0);
        Appt appt4a = new Appt(0, 32, 2, 3, 0, "invalid appt", null, null);
        appt4a.setValid(); //invalid appt for year
        Appt appt4b = new Appt(0, 32, 0, 3, 2001, "invalid startday", null, null);
        appt4b.setValid(); //invalid appt for start day
        int []recur = null;
        appt4b.setRecurrence(recur, 1, 1, 1);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
    Appt appt = new Appt(0, 59, 1, 1, 1, "Birthday", "nguyen", "gamil.com");
    appt.setValid();
    assertEquals(true,appt.getValid());
    assertEquals("gamil.com",appt.getEmailAddress());
    int []recur;
    recur = new int[2];
    recur[0] = 1;
    recur[1] = 2;
    appt.setRecurrence(recur,2,2,-1);
    assertEquals(-1, appt.getRecurNumber());
    assertEquals(2, appt.getRecurIncrement());
    assertEquals(recur,appt.getRecurDays());
    assertTrue(appt.isOn(1,1,1));
    assertTrue(appt.hasTimeSet());
}

    @Test(timeout = 4000)
    public void test06() throws Throwable {
    Appt appt = new Appt(0, 0, 31, 12, 1, null, null, null);
    appt.setValid();
    assertEquals(true,appt.getValid());
}

    @Test(timeout = 4000)
    public void test07() throws Throwable {
    Appt appt = new Appt(0, 59, 30, 11, 1, null, null, null);
    appt.setValid();
    assertEquals(true,appt.getValid());
}

    @Test(timeout = 4000)
    public void test08() throws Throwable {
    Appt appt = new Appt(0, 0, 1, 1, 1, null, null, null);
    appt.setValid();
    assertEquals(true,appt.getValid());
}

     @Test(timeout = 4000)
    public void test09() throws Throwable {
    Appt appt = new Appt(0, 59, 1, 12, 1, null, null, null);
    appt.setValid();
    assertEquals(true,appt.getValid());
}

     @Test(timeout = 4000)
    public void test10() throws Throwable {
    Appt appt = new Appt(0, 0, 1, 12, 0, null, null, null);
    appt.setValid();
    assertEquals(false,appt.getValid());
}


}
