/* 4. Doctor says a man should weigh 106 pounds for the first 5 feet of height,
plus 7 pounds for every inch above that; a woman should weigh 100 pounds for
the first 5 feet of height, plus 6 pounds for every inch above that.
Write a program that determines how much an individual person should weigh. 
Here’s what your program might look like in action:

Sample Output: 
Type 1 if you are female and 2 if male: How tall are you?
Number of feet	:	5
Number of inches	:	10
You should weigh 160 pounds

Type 1 if you are female and 2 if male: How tall are you?
Number of feet	:	6
Number of inches	:	0
You should weigh 190 pounds
*/

import java.util.*;
class q4
{
    static void male_BMI(int i,int g)
    {
        int pound;
        if(g == 1)
        {
            if(i>60){
                pound =106;
                i=i-60;
                if(i>0)
                {
                    pound+=i*7;
                    System.out.println("You should weigh "+pound+" pounds");
                }
                else{
                    System.out.println("You should weigh 106 pounds");
                }
            }
            else
            {
                System.out.println("You are below 5 feet");
            }
        }
    } 
    static void female_BMI(int i,int g)
    {
        int pound;
        if(g == 2)
        {
            if(i>60)
            {
                pound =100;
                i=i-60;
                if(i>0)
                {
                    pound+=i*6;
                    System.out.println("You should weigh "+pound+" pounds");
                }
                else{
                    System.out.println("You should weigh 100 pounds");
                }
            }
            else
            {
                System.out.println("You are below 5 feet");
            }
        }
    }
    public static void main(String[] args)
    {
    int feet,inches,gender,inch_conv;    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your gender: \n(1) for male,(2) for female:");
    gender = sc.nextInt();
    System.out.println("Enter feet of your height:");
    feet = sc.nextInt();
    System.out.println("Enter inches of your height:");
    inches = sc.nextInt();
    inch_conv = (feet*12)+inches;
    q4 obj = new q4();
    if(gender==1)
        obj.male_BMI(inch_conv,gender);
    else if(gender==2)
        obj.female_BMI(inch_conv,gender);
    sc.close();
    }
}