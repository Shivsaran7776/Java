//User input using switch statement print the day of the week

import java.util.*;
class switchst{
    public static void main(String args[]){
        int day;
        System.out.println("Enter the no. of the day i n week[1 to 7]");
        Scanner sc = new Scanner(System.in);
        day = sc.nextInt();
        sc.close();
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
                System.out.println("Wrong Input value");
                break;
        }
    }
}