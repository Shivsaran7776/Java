/*1.	Write a program that reads a Celsius degree in double from the console, then converts it to Fahrenheit and displays the result. The formula for the conversion is as follows:
fahrenheit = (9 / 5) * celsius + 32
*/

import java.util.*;
class q1{
    public static void main(String args[]){
        double celsius;
        System.out.println("Enter the celsius:");
        Scanner sc = new Scanner(System.in);
        celsius=sc.nextDouble();
        double fahrenheit = (1.8) * celsius + 32;
        System.out.println("The fahrenheit is:"+fahrenheit);
        sc.close();
    }
}