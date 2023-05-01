/*12. Create a function that takes the age and return the age in days.
	calcAge(65) ➞ 23725
	calcAge(0) ➞ 0
	calcAge(20) ➞ 7300
*/

import java.util.*;
class q12{
    void calcAge(int y){
        int days = y*365;
	    System.out.println("Age to days convertion is : "+days);
	}
	public static void main(String args[]){
		int age;
		System.out.println("Enter your age in number:");
        Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		q12 res = new q12();
		res.calcAge(age); 
		sc.close();
	}
}