/*1.Write a program called PrintNumberInWord which prints "ONE", "TWO",... , "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively.
Use (a) a "nested-if" statement; (b) a "switch-case-default" statement. */

import java.util.*;
class q1
{
    public static void main(String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no from 1-9 to be converted into word:");
        num = sc.nextInt();
        //nested-if statement
        System.out.println("a:");
        if(num<=10 && num>=0)
        {
            if(num==1)
            {
                System.out.println("ONE");
            }
            if(num==2)
            {
                System.out.println("TWO");
            }
            if(num==3)
            {
                System.out.println("THREE");
            }
            if(num==4)
            {
                System.out.println("FOUR");
            }
            if(num==5)
            {
                System.out.println("FIVE");
            }
            if(num==6)
            {
                System.out.println("SIX");
            }
            if(num==7)
            {
                System.out.println("SEVEN");
            }
            if(num == 8)
            {
                System.out.println("EIGHT");
            }
            if(num==9)
            {
                System.out.println("NINE");
            }
        }
        else
        {
                System.out.println("OTHER");
        }
        
        //switch case statement
        System.out.println("b:");
        switch(num)
        {
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
            }
            sc.close();
    }
}