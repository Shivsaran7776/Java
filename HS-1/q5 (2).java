/*Write a program that reads a sequence of integer values and determines whether it is a decreasing
sequence. A decreasing sequence is one where each value is greater than or equal to the next
element in the sequence. The program will first read the number of values to process followed by
the values in the sequence. The program will print the message &quot;Decreasing&quot; for a decreasing
sequence and &quot;Non-Decreasing&quot; otherwise.
For example, here are two decreasing sequences:

Input1: 90 87 30 0 -1 -2
Input2: 110 4 0 -20

The following are non-decreasing sequences:

Input3: 90 100 20 4
Input4: 30 24 -2 -1 8 9

You may assume that the integer sequence will have at least two integer values and no two values
will be equal. */

import java.util.*;
class q5
{
    static void sequence(int arr[],int size)
    {
        int count = 1;
        for(int i=0;i<size-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                count+=1;
            }
        }
        if (count == size)
        {
            System.out.println("Decreasing");
        }
        else
        {
            System.out.println("Non-Decreasing");
        }
    }
    public static void main(String[] args)
    {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the array values:");
        for(int i=0;i<size;i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.println("Values are checked whether it is decreasing sequeal or not:");
        q5 obj = new q5();
        if(array.length>=2)
            obj.sequence(array,size);
        sc.close();
    }
}