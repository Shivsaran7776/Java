/*4.	Write a Java program that accepts two double variables and test if both strictly between 0 and 1 and false otherwise. 
Sample Output:
Input first number: 5
Input second number: 1
false
 */

import java.util.*;
class q4{
    public static void main(String args[]){
        double val1,val2;
        System.out.println("Enter first value:");
        Scanner sc = new Scanner(System.in);
        val1 = sc.nextDouble();
        System.out.println("Enter second value:");
        val2 = sc.nextDouble();
        if (val1 <=1 || val1 >=0 && val2 <=1 || val2 <=0){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        sc.close();
    }
}