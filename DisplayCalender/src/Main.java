import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main
{

    private static final String[] monthName = {"January", "February", "March", "April", "May","Jun",
            "July", "August", "September", "October", "November", "December"};

    public static void main(String[] args)
    {
        if (args.length != 2)
        {
            System.out.println("Invalid flags must be \" [MONTH] [YEAR] \"");
            System.exit(1);
        }
        Calendar calendar = null;
        try
        {
            int month = Integer.parseInt(args[0]);
            int year = Integer.parseInt(args[1]);
            if (month < 0 || month > 12)
                throw new NumberFormatException("Month must be in range (1,12)");
            calendar = new GregorianCalendar(year,month -1, 1);
        } catch (NumberFormatException ex)
        {
            System.out.println("Invalid arguments");
            System.exit(1);
        }

        printMonth(calendar);



    }

    /**
     * Print the calendar for a month in a year
     */
    public static void printMonth(Calendar calendar)
    {
        // Print the headings of the calendar
        printMonthTitle(calendar);
        // Print the body of the calendar
        printMonthBody(calendar);
    }

    /**
     * Print the month title, e.g., March 2012
     */
    public static void printMonthTitle(Calendar calendar)
    {
        System.out.printf("%15s %s\n", monthName[calendar.get(Calendar.MONTH)],calendar.get(Calendar.YEAR));
        System.out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    public static void printMonthBody(Calendar calendar)
    {
        // Get start day of the week for the first date in the month
        int startDay =calendar.get(Calendar.DAY_OF_WEEK); // Min 1 _Sunday
        // Get number of days in the month
        int numberOfDaysInMonth = calendar.getActualMaximum(Calendar.DATE);
        // Pad space before the first day of the month
        for (int i = 1; i < startDay; i++)
            System.out.print("    ");
        for (int i = 0; i < numberOfDaysInMonth; i++)
        {
            System.out.printf("%4d", i + 1);
            if ((i+startDay) % 7 == 0)
                System.out.println();
        }
        System.out.println();
    }

}
