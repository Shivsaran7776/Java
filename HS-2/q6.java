/*6.	Quarterback rating. To compare NFL quarterbacks, the NFL devised a the quarterback rating formula based on the quarterbacks number of completed passes (A),
pass attempts (B), passing yards (C), touchdown passes (D), and interception (E) as follows: 
a.	Completion ratio: W = 250/3 * ((A / B) - 0.3). 
b.	Yards per pass: X = 25/6 * ((C / B) - 3). 
c.	Touchdown ratio: Y = 1000/3 * (D / B) 
d.	Interception ratio: Z = 1250/3 * (0.095 - (E / B)) 

The quarterback rating is computed by summing up the above four quantities, but rounding up or down each value so that it is at least 0 and at most 475/12. 
Write a program QuarterbackRating.java that takes five command line inputs A, B, C, D, and E, and prints the quarterback rating. Use your program to compute
Steve Young's 1994 record-setting season (112.8) in which he completed 324 of 461 passes for 3,969 yards, and threw 35 touchdowns and 10 interceptions.
As of 2014, the all-time single-season record is 122.5 by Aaron Rodgers in 2011. 
 */

import java.util.*;
 class q6
{
    public static void main(String[] args)
    {
        int inputs,cases;
        double w,x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of input:");
        inputs = sc.nextInt();
        double[] arr = new double[inputs];
        System.out.println("Enter first integer values:"+args[0]);
        System.out.println("Enter second integer values:"+args[1]);
        System.out.println("Enter third integer values:"+args[2]);
        System.out.println("Enter first integer values:"+args[3]);
        System.out.println("Enter first integer values:"+args[4]);
        for(int i=0;i<inputs;i++)
        {
            arr[i]=Double.parseDouble(args[i]);
        }
        double a = arr[0];
        double b = arr[1];
        double c = arr[2];
        double d = arr[3];
        double e = arr[4];
        System.out.println("Enter the case that you want to formulate:\n1.Pass Attempts\n2.Passing Yards\n3.Touchdown Passes\n4.Interception");
        cases = sc.nextInt();
        switch(cases)
        {
            case 1:
                w=83.3*((a/b)-0.3);
                System.out.println("Completion ratio:"+w);
                break;
            case 2:
                x=8.3*((c/b)-3);
                System.out.println("Yards per pass:"+x);
                break;
            case 3:
                y=333.3*((c/b));
                System.out.println("Completion ratio:"+y);
                break;
            case 4:
                z=416.6*(0.095-(e/b));
                System.out.println("Completion ratio:"+z);
                break;
            default:
                System.out.println("Wrong value,No case exists");
                break;
        }
        sc.close();
    }
}