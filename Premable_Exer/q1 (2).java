/*1. Given two numbers, return true if the sum of both numbers is less than 100. Otherwise return false.
lessThan100 (22, 15) ➞ true				// 22 + 15 = 37
	
lessThan100 (83, 34) ➞ false				// 83 + 34 = 117

lessThan100 (3, 77) ➞ true
 */

import java.util.*;
class q1 
{
    int sum;
    void lessThan100(int a,int b)
    {
        sum = a+b;
        boolean res = sum<100;
        System.out.println(res);
    }

    public static void main(String args[])
    {
        int a,b;
        System.out.println("Enter the 1st value:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Enter the 2nd value:");
        b = sc.nextInt();
        q1 obj = new q1();
        obj.lessThan100(a,b);
        sc.close();
    }
}