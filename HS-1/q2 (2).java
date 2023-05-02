/*2. Define a function that takes three integer values as formal arguments
and returns "YOU WIN" if the third formal argument value is between first
and second arguments (both included). In the other case it returns "YOU LOSE".
Also check that second argument should not be lesser than the first argument.
If so continue, else display relevant error message. */

import java.util.*;
class q2
{
    public String check(int a,int b,int c)
    {
        if(b>a)
        {
            if(c>a && c<b)
            {
                return "You win";
            }
            else
            {
                return "You lose";
            }
        }
        else
        {
            return "Enter the 3rd value within range of 1st value and 2nd value";
        }
    }
    public static void main(String args[])
    {
        int val1,val2,val3;
        System.out.println("Enter three integer values:");
        Scanner sc = new Scanner(System.in);
        val1 = sc.nextInt();
        val2 = sc.nextInt();
        val3 = sc.nextInt();
        q2 obj = new q2();
        System.out.println(obj.check(val1,val2,val3));
        sc.close();
    }
}