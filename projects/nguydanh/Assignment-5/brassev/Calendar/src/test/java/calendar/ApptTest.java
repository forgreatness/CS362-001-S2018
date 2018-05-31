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
		String string0 = appt0.toString();
		assertEquals(2, appt0.getRecurBy());
		assertFalse(appt0.isRecurring());
		assertEquals("\t14/9/2018 at 3:30pm ,Birthday Party, This is my birthday party\n", string0);
		assertEquals(0, appt0.getRecurIncrement());
		appt0.setValid();

        Appt appt1 = new Appt(15, 30, 30, 1, 2000, "Birthday party", "Invalid stuff", "xyz@gmail.com");
        appt1.setValid();
        assertFalse(appt1.getValid());
        

        Appt appt2 = new Appt(14, 30, 9, 10, 2018, "Birthday party", "Valid Stuff", "xyz@gmail.com");
        appt2.setValid();
        int []recur = {1,3,5};
        appt2.setRecurrence(recur, 2, 2, 4);
        assertFalse(appt2.isOn(9,11,2018));

        Appt appt3 = new Appt(14, 30, 3, 10, 2018, "BirthDay party", "valid", "xyz@gmail.com");
        appt3.setValid();
        appt3.setRecurrence(recur, 2, 2, 4);
        assertTrue(appt3.isOn(3,10,2018));

        Appt appt4 = new Appt(14,30,9,10,2018, "Birthday party", "Valid Stuff", "xyz");
        appt4.setValid();
        appt4.setRecurrence(recur, 3, 2, 3);
        assertFalse(appt4.isOn(3,10,2019));
        

        
        


	}
/*	@Test(timeout = 4000)
	public void test01()  throws Throwable  {
		Appt appt1 = new Appt(23, 30, 9, 12, 2018, null, null, null);
		appt1.setValid();
		appt1.setDescription(appt1.getDescription());
		appt1.setTitle(appt1.getTitle());
		appt1.getXmlElement();
		String string1 = appt1.getEmailAddress();
		assertEquals("", string1);
		assertFalse(appt1.getValid());
	}*/


	@Test(timeout = 4000)
	public void test02()  throws Throwable  {
		Appt appt2 = new Appt(0, -3, 9, 12, 2018, "Birthday Party", "This is my friend's birthday party", "what@edu");
		appt2.setValid();
		appt2.getXmlElement();
		assertFalse(appt2.getValid());
	}
/*
	@Test(timeout = 4000)
	public void test03() throws Throwable {
		Appt appt3 = new Appt(0, 3, 9, 12, 2018, null, null, null);
		appt3.setValid();
		Boolean check = appt3.isOn(9, 12, 2018);
		appt3.hasTimeSet();

	}*/


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

}
