/*2. Write a program which dynamically allocates two one-dimensional arrays of 'n' elements each (supplied from test data) and
store their sum in a separate array and print the third array. */
import java.util.*;
class q2
{
    public void sumArray(int arr1[],int arr2[],int s)
    {
        int[] sumArray = new int[s];
        for(int i=0;i<s;i++)
        {
            sumArray[i] = arr1[i]+arr2[i];
        }
        for(int i=0;i<s;i++)
        {
            System.out.println(sumArray[i]);
        }
    }
    public static void main(String[] args)
    {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the arrays:");
        size = sc.nextInt();
        System.out.println("Enter first array values:");
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        for(int i=0;i<size;i++)
        {
            array1[i] = sc.nextInt();
        }
        System.out.println("Enter second array values:");
        for(int i=0;i<size;i++)
        {
            array2[i] = sc.nextInt();
        }
        System.out.println();
        q2 obj = new q2();
        obj.sumArray(array1,array2,size);
        sc.close();
    }
}