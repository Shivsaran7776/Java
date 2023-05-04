/* 2.	Write a program called PrintDayInWord which prints “Sunday”, “Monday”, ... “Saturday” if the int variable "dayNumber" is 0, 1, ..., 6, respectively.  Otherwise, it shall print "Not a valid day". Use (a) a "nested-if" statement; (b) a "switch-case-default" statement.
Try dayNumber = 0, 1, 2, 3, 4, 5, 6, 7 and verify your results.
*/
import java.util.*;
class q2{
    public static void main(String args[]){
        int day;
        System.out.println("Enter the no. of the day i n week[1 to 7]");
        Scanner sc = new Scanner(System.in);
        day = sc.nextInt();
        sc.close();
        //nested-if statement
        System.out.println("a:");
        if(day<=7 && day>=1)
        {
            if(day==1)
            {
                System.out.println("Sunday");
            }
            if(day==2)
            {
                System.out.println("Monday");
            }
            if(day==3)
            {
                System.out.println("Tuesday");
            }
            if(day==4)
            {
                System.out.println("Wednesday");
            }
            if(day==5)
            {
                System.out.println("Thursday");
            }
            if(day==6)
            {
                System.out.println("Friday");
            } 
            if(day==7)
            {
                System.out.println("Saturday");
            }
        }
        else
        {
            System.out.println("Not a valid day");
        }
        //switch statement
        System.out.println("b:");
        switch(day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Not a valid day");
                break;
        }  
    }
}