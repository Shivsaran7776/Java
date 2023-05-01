/*	Write a program that reads in the radius and length of a cylinder 
and computes volume using the following formulas:

area = radius * radius * π
volume = area * length
 */

import java.util.*;
 class q2{
    public static void main(String args[]){
        double radius,length,area,volume;
        double pi = 3.14;
        System.out.println("Enter radius of the cylinder:");
        Scanner sc = new Scanner(System.in);
        radius =  sc.nextDouble();
        area = radius*radius*pi;
        System.out.println("Area of the cylinder:"+area);
        System.out.println("Enter the length to get volume of cylinder:");
        length=sc.nextDouble();
        volume = area*length;
        System.out.println("Volume of the cylinder:"+volume);
        sc.close();
    }
}