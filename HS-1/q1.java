/*1. Given two numbers, return true if the sum of both numbers is less than 100. Otherwise return false.
lessThan100 (22, 15) ➞ true				// 22 + 15 = 37
	
lessThan100 (83, 34) ➞ false				// 83 + 34 = 117

lessThan100 (3, 77) ➞ true
*/

import java.util.*;
class q1
{
    int res;
    void lessThan100(int a,int b)
    {
        if(a<=100 && b<=100)
        {
            res=a+b;
            System.out.println(res);
        }
        else
        {
            System.out.println("A or B greater than 100");
        }
    }
    public static void main(String[] args)
    {
        int val1,val2;
        System.out.println("Enter first value:");
        Scanner sc = new Scanner(System.in);
        val1 = sc.nextInt();
        System.out.println("Enter second value:");
        val2 = sc.nextInt();
        sc.close();
        q1 obj = new q1();
        obj.lessThan100(val1,val2);
    }

}