/*4. Write a program to find Sum of series S=1+(1+2)+(1+2+3)+..….+(1+2+3+…+n) */

import java.util.*;
class q4
{
    int Sum_series(int n)
    {
        int sum=0;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                sum+=j;
            }
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number for sum of a series:");
        n = sc.nextInt();
        q4 obj = new q4();
        System.out.println(obj.Sum_series(n));
        sc.close();
    }
}