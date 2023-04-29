import java.util.Scanner;
import java.util.Calendar;

class Calen
{
    static void findDay(int month,int date,int year)
    {
        System.out.println(Calen  .get(Calendar.MONTH));
    }
    public static void main(String[] args)
    {
        int month,date,year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month,date and year:");
        month = sc.nextInt();
        date = sc.nextInt();
        year = sc.nextInt();
        Calen cal = new Calen();
        cal.findDay(month,date,year);
        sc.close();
    }
}