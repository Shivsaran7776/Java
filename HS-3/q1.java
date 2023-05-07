/*Write a program to accept 'n' (taken from test data) numbers of elements using dynamic memory allocation and then print the element
 at position 'p' (taken from test data) after sorting the elements in ascending order.
For example:
If the value of n is 5 and value of p is 3 then the program will accept five numbers as input from the test data, sort them in ascending 
order and display the third number as output.
If the input is 20,30,90,40,80 then it will display 40 as output.
 */
import java.util.*;
class q1
{
    public void AscOrder(int array[],int k)
    {
        Arrays.sort(array);
        System.out.println(array[k-1]);
    }
    public static void main(String[] args)
    {
        int size,key;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array values:");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to find index of the sorted array:");
        key = sc.nextInt();
        q1 obj = new q1();
        obj.AscOrder(arr,key);
        sc.close();
    }
}