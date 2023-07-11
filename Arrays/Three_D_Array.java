//Three-Dimensional Array

import java.util.*;
class Three_D_Array
{
    public static void main(String args[])
    {
        int r,c,s;
        System.out.println("Enter the row of array:");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        System.out.println("Enter the column of array:");
        c = sc.nextInt();
        System.out.println("Enter the slice of array:");
        s = sc.nextInt();
        int arr[][][] =  new int[r][c][s];
        System.out.println("Enter three Dimensional Array values:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                for(int k=0;k<s;k++)
                {
                    arr[i][j][k] = sc.nextInt();
                }
            }  
        }
        System.out.println("Array elements is:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                for(int k=0;k<s;k++)
                {
                    System.out.print(arr[i][j][k]+" "); 
                }
            } 
            System.out.println(); 
        }
        sc.close();
    }
}