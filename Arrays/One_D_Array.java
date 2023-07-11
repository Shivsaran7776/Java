//1-D Array

import java.util.*;
class One_D_Array
{
    public static void main(String args[]){
        int size;
        System.out.println("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements:");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements:");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");  
        }
        sc.close();
    }
}