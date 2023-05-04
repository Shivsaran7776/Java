/*5.	Gymnastics judging. A gymnast's score is determined by a panel of 6 judges who each decide a score between 0.0 and 10.0. 
The final score is determined by discarding the high and low scores, and averaging the remaining 4. Write a program that takes 6 
real command line inputs representing the 6 scores and prints their average, after throwing out the high and low scores.  */

import java.util.Arrays;
class q5
{
    public static void main(String[] args)
    {
        int judges = 6;
        double avg,tot=0;
        int j=0;
        int[] arr = new int[judges];
        for(String i:args)
        {
            arr[j]= Integer.parseInt(i);
            j++;
        }
        Arrays.sort(arr);
        for(int i=1;i<arr.length-1;i++)
        {
            System.out.println(tot+=arr[i]); 
        }
        avg=tot/4;
        System.out.println("Total Score:"+tot);
        System.out.println("Average Score:"+avg);
    }
}