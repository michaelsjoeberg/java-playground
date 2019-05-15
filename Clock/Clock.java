import java.util.*;
import java.io.*;

/**
  * Clock Class for Revision.
  * 
  * @author www.github.com/mqe
  * @version 1
  */

public class Clock
{
    private static final int HOURS_PER_DAY = 24;
    private static final int MINS_PER_HOUR = 60;
    private static final int SECS_PER_MIN = 60;

    private int sec;
    private int min;
    private int hour;

    /*
     *  Constructor for Clock.
     */
    public Clock(int h, int m, int s)
    {
        if (timeOkay(h, m, s))
        {
            hour = h;
            min = m;
            sec = s;
        }
        else 
        {
            hour = 0;
            min = 0;
            sec = 0;
        }
    }

    /*
     * Method for checking if time is valid.
     */
    private boolean timeOkay(int hour, int min, int sec)
    {
        if (hour < 0 || min < 0 || sec < 0)
        {
            return false;
        }
        if (hour >= HOURS_PER_DAY || min >= MINS_PER_HOUR || sec >= SECS_PER_MIN)
        {
            return false;
        }
        return true;
    }

    /*
     * Method for getting text representation for Clock.
     */
    @Override
    public String toString()
    {
        // return clock as string
        return this.hour + ":" + this.min + ":" + this.sec;
    }

    /*
     * Method for incrementing Clock.
     */
    public void increment()
    {   
        // increment sec
        this.sec = this.sec + 1;

        if (this.sec > 59)
        {
            // set sec to 0 and increment min
            this.sec = 0;
            this.min = this.min + 1;

            if (this.min > 59)
            {
                // set min to 0 and increment hour
                this.min = 0;
                this.hour = this.hour + 1;

                if (this.hour > 23)
                {
                    // set hour to 0
                    this.hour = 0;
                }
            }
        }
    }

    /*
     * Mehtod for checking if Clock objects are equal.
     */
    public boolean equals(Clock aClock)
    {
        // return true or false
        return this.toString().equals(aClock.toString());
    }

    /* init */
    public static void main(String args[])
    {
        // create objects
        Clock c1 = null;
        Clock c2 = null;

        // initialise objects
        c1 = new Clock(-1, 0, 0);
        c2 = new Clock(0, 59, 58);

        // increment objects
        c2.increment();
        c2.increment();
        c2.increment();

        // test
        System.out.println("c1 " + c1.toString());
        System.out.println("c2 " + c2.toString());
        System.out.println("Same time is " + c1.equals(c2));
    }
}
