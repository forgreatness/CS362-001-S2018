package calendar;

import java.util.Calendar;
import java.util.Random;
import java.util.LinkedList;
import java.util.GregorianCalendar;

import org.junit.Test;



import static org.junit.Assert.*;



/**
 * Random Test Generator  for Appt class.
 */

public class CalDayRandomTest {

    private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
    private static final int NUM_TESTS=100;

    /**
     * Return a randomly selected method to be tests !.
     */
    public static String RandomSelectMethod(Random random){
        String[] methodArray = new String[] {"addAppt"};// The list of the of methods to be tested in the Appt class

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

                startHour=ValuesGenerator.getRandomIntBetween(random, 1, 11);
                startMinute=ValuesGenerator.getRandomIntBetween(random, 1, 11);
                startDay=ValuesGenerator.getRandomIntBetween(random, -1, 11);
                startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
                startYear=ValuesGenerator.getRandomIntBetween(random, 2018, 2018);

                //Construct a new Appointment object with the initial data
                //Construct a new Appointment object with the initial data
                Appt appt1 = new Appt(startHour,
                        startMinute ,
                        startDay ,
                        startMonth ,
                        startYear ,
                        title,
                        description,
                        emailAddress);
    
                GregorianCalendar day = new GregorianCalendar (1997, 3, 15);
                CalDay cald0 = new CalDay(day);



                if(!appt.getValid())continue;
                for (int i = 0; i < NUM_TESTS; i++) {
                    String methodName = CalDayRandomTest.RandomSelectMethod(random);
                    if (methodName.equals("addAppt")){
                        appt.setValid();
                        appt1.setValid();
                        cald0.addAppt(appt);
                        cald0.addAppt(appt1);

                    }

          
                }

                elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
                if((iteration%10000)==0 && iteration!=0 )
                    System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);

            }
        }catch(NullPointerException e){

        }

        System.out.println("Done testing...");
    }






}
