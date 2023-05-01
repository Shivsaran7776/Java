/*3. The health visitor at a school is going to measure the heights of all pupils. For each class he makes a statistics giving the number of pupils of each height and the average height. Make a Java program that helps the health visitor making the statistics.
Example: 
In a class with 20 pupils the heights of the individual pupils, in centimeters, are:
175, 167, 160, 164, 183, 187, 188, 179, 176, 175,
169, 	175, 	    176,          178,          165, 	      160,         173,         165,         187,          178.
The program should read in all the numbers and make a table like this:
Height	Number of pupils
160	2
164	1
165	2
167	1
...	...
...	...
188	1
Average Height 174.0
 */

import java.util.*;
class q3
{
    static void countDuplicates(int a[],int s)
    {
        Arrays.sort(a);
        //int avg,tot,tot1;
        for(int i =0;i<a.length;i++)
        {
            int count=1;
            if(i!=a.length-1)
            {
                for(int j= i+1;j<a.length;j++)
                {
                    if(a[i]==a[j])
                    {
                        count++; 
                        //tot = a[i]+a[j];
                    }
                    else
                    {
                        //tot1 = a[i]+a[j];
                        break;
                    }
                }
            }
                System.out.println(a[i]+"               "+count);
        }
       // avg = tot+tot1/s;
        //System.out.println("Average Height:"+avg);
    }
    public static void main(String args[])
    {
        int pupils;
        //double avg;
        System.out.println("Enter no.of pupil in class:");
        Scanner sc = new Scanner(System.in);
        pupils = sc.nextInt();
        int arr[] = new int[pupils];
        System.out.println("Enter the "+pupils+" pupils height in centimeters:");
        for(int i=0;i<pupils;i++)
        {
            arr[i] = sc.nextInt();
        } 
        q3 obj = new q3();
        System.out.println("Height           No.of pupils");
        obj.countDuplicates(arr,pupils);
        sc.close();
    }
}
