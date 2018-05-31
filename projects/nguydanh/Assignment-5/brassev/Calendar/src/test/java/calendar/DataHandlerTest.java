
/** A JUnit test class to test the class DataHandler. */


package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalDay;
import calendar.DataHandler;

import java.util.GregorianCalendar;
import java.util.LinkedList;


public class DataHandlerTest{

	@Test(timeout = 4000)
	public void test00()  throws Throwable  {
		DataHandler DH0 = new DataHandler("lame", false);
		Appt appt0 = new Appt(0, 12, 14, 0, 2017, "invalid appt", null, null);
		appt0.setValid();
		DH0.saveAppt(appt0);
		DH0.deleteAppt(appt0);


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
		int[] recurC1 = {};
		apptC1.setRecurrence(recurC1, 1, 2, 0);
		int[] recurC2 = {3,5};
		apptC2.setRecurrence(recurC2, 3, 2, 0);
		caldC.addAppt(apptC1);
		caldC.addAppt(apptC2);
		DH1.saveAppt(apptC1);
		DH1.saveAppt(apptC2);
		System.out.println(DH1.getApptRange(dayC, dayD));
		DH1.deleteAppt(apptC1);
		DH1.deleteAppt(apptC2);
	}
}