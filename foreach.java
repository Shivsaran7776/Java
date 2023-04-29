//for each loop in java code.

import java.util.*;
class foreach
{
    public static void main(String argsa[])
    {
        int size;
        System.out.println("Enter the size of array:");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array value:");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array value:");
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
        sc.close();
    }
}