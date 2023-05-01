/* 8. 	Write a function that converts hours into seconds.
	howManySeconds(2) ➞ 7200
	howManySeconds(10) ➞ 36000
	howManySeconds(24) ➞ 86400
*/

import java.util.*;
class q8{
    int sec;
    void howManySecond(int h){
        sec=h*60*60;
        System.out.println("Hours to seconds convertion is:"+sec);
    }
    public static void main(String args[]){
        int hours;
        System.out.println("Enter hours:");
        Scanner sc = new Scanner(System.in);
        hours = sc.nextInt();
        q8 res = new q8();
        res.howManySecond(hours);
        sc.close();
    }
}