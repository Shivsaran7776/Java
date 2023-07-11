 //Multi-Dimensional Array

import java.util.*;
 class Two_d_Array{
    public static void main(String args[])
    {
        int r,c;
        System.out.println("Enter row size of the array:");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        System.out.println("Enter column size of the array:");
        c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Enter array value:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("Printing the inserted array values is:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close(); 
    } 
}