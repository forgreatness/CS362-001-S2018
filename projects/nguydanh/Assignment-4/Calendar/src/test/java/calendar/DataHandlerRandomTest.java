package calendar;

import java.util.Calendar;
import java.util.Random;

import org.junit.Test;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.Calendar;



import static org.junit.Assert.*;



/**
 * Random Test Generator  for DataHandler class.
 */

public class DataHandlerRandomTest {
	
    /**
     * Generate Random Tests that tests DataHandler Class.
     */

		 private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
		 private static final int NUM_TESTS=100;

		 /**
		  * Return a randomly selected method to be tests !.
		  */
		 public static String RandomSelectMethod(Random random){
			 String[] methodArray = new String[] {"deleteAppt","getApptRange"};// The list of the of methods to be tested in the Appt class

			 int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)

			 return methodArray[n] ; // return the method name
		 }
		 /**
		  * Return a randomly selected appointments to recur Weekly,Monthly, or Yearly !.
		  */
		 public static int RandomSelectRecur(Random random){
			 int[] RecurArray = new int[] {Appt.RECUR_BY_WEEKLY,Appt.RECUR_BY_MONTHLY,Appt.RECUR_BY_YEARLY};// The list of the of setting appointments to recur Weekly,Monthly, or Yearly

			 int n = random.nextInt(RecurArray.length);// get a random number between 0 (inclusive) and  RecurArray.length (exclusive)
			 return RecurArray[n] ; // return the value of the  appointments to recur
		 }
		 /**
		  * Return a randomly selected appointments to recur forever or Never recur  !.
		  */
		 public static int RandomSelectRecurForEverNever(Random random){
			 int[] RecurArray = new int[] {Appt.RECUR_NUMBER_FOREVER,Appt.RECUR_NUMBER_NEVER};// The list of the of setting appointments to recur RECUR_NUMBER_FOREVER, or RECUR_NUMBER_NEVER

			 int n = random.nextInt(RecurArray.length);// get a random number between 0 (inclusive) and  RecurArray.length (exclusive)
			 return RecurArray[n] ; // return appointments to recur forever or Never recur
		 }
		 /**
		  * Generate Random Tests that tests Appt Class.
		  */
		 @Test
		 public void radnomtest()  throws Throwable  {

			 long startTime = Calendar.getInstance().getTimeInMillis();
			 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;


			 System.out.println("Start testing...");

			 try{
                     DataHandler DH = new DataHandler("shame", true);
                     DataHandler DH1 = new DataHandler("lame", false);
                     DataHandler DH2 = new DataHandler("blame", true);

				 for (int iteration = 0; elapsed < TestTimeout; iteration++) {
					 long randomseed =System.currentTimeMillis(); //10
					 //			System.out.println(" Seed:"+randomseed );
					 Random random = new Random(randomseed);

					 int startHour=ValuesGenerator.getRandomIntBetween(random, 1, 11);
					 int startMinute=ValuesGenerator.getRandomIntBetween(random, 1, 11);
					 int startDay=ValuesGenerator.getRandomIntBetween(random, 1, 11);
					 int startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
					 int startYear=ValuesGenerator.getRandomIntBetween(random, 2018, 2018);
					 String title="Birthday Party";
					 String description="This is my birthday party.";
					 String emailAddress="xyz@gmail.com";

					 //Construct a new Appointment object with the initial data
					 //Construct a new Appointment object with the initial data
					 Appt appt = new Appt(startHour,
							 startMinute ,
							 startDay ,
							 startMonth ,
							 startYear ,
							 title,
							 description,
							 emailAddress);

					 int startHour1=ValuesGenerator.getRandomIntBetween(random, -60, 60);
					 int startMinute1=ValuesGenerator.getRandomIntBetween(random, -59, 59);
					 int startDay1=ValuesGenerator.getRandomIntBetween(random, -11, 11);
					 int startMonth1=ValuesGenerator.getRandomIntBetween(random, -11, 11);
					 int startYear1=ValuesGenerator.getRandomIntBetween(random, -2018, 2018);

					 //Construct a new Appointment object with the initial data
					 //Construct a new Appointment object with the initial data
					 Appt appt1 = new Appt(startHour1,
							 startMinute1,
							 startDay1,
							 startMonth1,
							 startYear1,
							 title,
							 description,
							 emailAddress);


					 int startHour2=ValuesGenerator.getRandomIntBetween(random, 1, 11);
					 int startMinute2=ValuesGenerator.getRandomIntBetween(random, 1, 11);
					 int startDay2=ValuesGenerator.getRandomIntBetween(random, 1, 11);
					 int startMonth2=ValuesGenerator.getRandomIntBetween(random, 1, 11);
					 int startYear2=ValuesGenerator.getRandomIntBetween(random, 2018, 2018);

					 Appt appt2 = new Appt(startHour2,
							 startMinute2,
							 startDay2,
							 startMonth2,
							 startYear2,
							 title,
							 description,
							 emailAddress);


					 int startHour3=ValuesGenerator.getRandomIntBetween(random, 1, 11);
					 int startMinute3=ValuesGenerator.getRandomIntBetween(random, 1, 11);
					 int startDay3=ValuesGenerator.getRandomIntBetween(random, 1, 11);
					 int startMonth3=ValuesGenerator.getRandomIntBetween(random, 1, 11);
					 int startYear3=ValuesGenerator.getRandomIntBetween(random, 2018, 2018);

					 Appt appt3 = new Appt(startHour3,
							 startMinute3,
							 startDay3,
							 startMonth3,
							 startYear3,
							 title,
							 description,
							 emailAddress);


					 int startHour4=ValuesGenerator.getRandomIntBetween(random, 1, 11);
					 int startMinute4=ValuesGenerator.getRandomIntBetween(random, 1, 11);
					 int startDay4=ValuesGenerator.getRandomIntBetween(random, 1, 11);
					 int startMonth4=ValuesGenerator.getRandomIntBetween(random, 1, 11);
					 int startYear4=ValuesGenerator.getRandomIntBetween(random, 2018, 2018);

					 Appt appt4 = new Appt(startHour4,
							 startMinute4,
							 startDay4,
							 startMonth4,
							 startYear4,
							 title,
							 description,
							 emailAddress);



                     

					 GregorianCalendar day = new GregorianCalendar (1997, 3, 15);
                     GregorianCalendar day1 = new GregorianCalendar (2018, 3, 15);
                     GregorianCalendar day2 = new GregorianCalendar (2018, 3, 14);

                     GregorianCalendar today = new GregorianCalendar (2017, 1, 1);
                     GregorianCalendar tomorrow = new GregorianCalendar (2019, 1, 1);



					 if(!appt.getValid())continue;
					 for (int i = 0; i < NUM_TESTS; i++) {
						 String methodName = DataHandlerRandomTest.RandomSelectMethod(random);
						if (methodName.equals("deleteAppt")){
                            
                            appt1.setValid();
                            appt1.getValid();
                            appt.setValid();
                            appt.getValid();

                            DH.saveAppt(appt);
                            DH.deleteAppt(appt);
                            DH.deleteAppt(appt);

                            DH.saveAppt(appt1);
                            DH.deleteAppt(appt1);
                            DH.save();

                            DH1.saveAppt(appt);
                            DH1.deleteAppt(appt);
                            DH1.deleteAppt(appt);

                            DH1.saveAppt(appt1);
                            DH1.deleteAppt(appt1);
                            DH1.save();



                            

						 }
                         else if (methodName.equals("getApptRange")){
                         int sizeArray = ValuesGenerator.getRandomIntBetween(random, 0,8);
                         int[] recurDays = ValuesGenerator.generateRandomArray(random,sizeArray);
                         int recur = DataHandlerRandomTest.RandomSelectRecur(random);
                         int recurIncrement = ValuesGenerator.RandInt(random);
                         int recurNumber = DataHandlerRandomTest.RandomSelectRecurForEverNever(random);
                         appt.setRecurrence(recurDays, recur, recurIncrement, recurNumber);
                         appt1.setRecurrence(recurDays, recur, recurIncrement,recurNumber);


                         appt2.setRecurrence(recurDays, recur, recurIncrement, recurNumber);
                         appt3.setRecurrence(recurDays, recur, recurIncrement, recurNumber);
                         appt4.setRecurrence(recurDays, recur, recurIncrement, recurNumber);



                         DH2.saveAppt(appt);
                         DH2.saveAppt(appt2);
                         DH2.saveAppt(appt3);
                         DH2.saveAppt(appt4);

                         LinkedList<CalDay> calDays = new LinkedList<CalDay>();
                         calDays = (LinkedList<CalDay>) DH2.getApptRange(today,tomorrow);
                         

                
                                                  


                         DH.saveAppt(appt);
                         DH.saveAppt(appt1);

                         DH1.saveAppt(appt);
                         DH1.saveAppt(appt1);

                         DH1.getApptRange(day2,day1);
                         DH1.getApptRange(day1,day2);

                            DH.getApptRange(day2,day1);
                            DH.getApptRange(day1,day2);
                         }


					 }

					 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
					 if((iteration%10000)==0 && iteration!=0 )
						 System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);

				 }
			 }catch(DateOutOfRangeException e){
                

			 }

			 System.out.println("Done testing...");
		 }


	
}
