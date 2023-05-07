/*Write a program to find the total sum of the diagonal elements of a square matrix.  */
import java.util.*;
class q3
{
    public void sumDiagonal(int arr[][],int s)
    {
        int sum=0;
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;i++)
            {
                if(i==j)
                {
                    sum += arr[i][j];
                }
            }
            System.out.println(sum);
        }
    }
    public static void main(String[] args)
    {
        int matrix;
        Scanner sc  = new Scanner(System.in);
        matrix = sc.nextInt();
        int[][] array = new int[matrix][matrix];
        for(int i=0;i<matrix;i++)
        {
            for(int j=0;j<matrix;j++)
            {
                array[i][j] = sc.nextInt();
            }
        }
        q3 obj = new q3();
        obj.sumDiagonal(array,matrix);
        sc.close();
    }
}