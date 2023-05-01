/*5.	Write a function that takes an integer minutes and converts it to seconds.
	convert(5) ➞ 300
	convert(3) ➞ 180
	convert(2) ➞ 120
 */

import java.util.*;
class q5{
    int sec;
    void second(int m){
        sec=m*60;
        System.out.println("Minutes to seconds convertion is:"+sec);
    }
    public static void main(String args[]){
        int min;
        System.out.println("Enter minutes:");
        Scanner sc = new Scanner(System.in);
        min = sc.nextInt();
        q5 res = new q5();
        res.second(min);
        sc.close();
    }
}