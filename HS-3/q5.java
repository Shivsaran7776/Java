/* 5. Complete the Java code which takes (i) size of the array (number of array elements) and (ii) the array elements as input and 
then counts and displays (i) the number of elements that are repeated and (ii) the repeated elements (in order of their occurrence 
in the input array)

For example if the size of the array is 10 and the elements are
10, 30, 20, 45, 60, 20, 20, 60, 20, 30
The output will be:
Total Repeated elements = 3 
Repeated elements are: 30 20 60
Sample Test Cases
*/

import java.util.*;
class q5
{
    void findDuplicate(int arr[],int n)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    if(al.contains(arr[i]))
                    {
                        count++;
                        break;
                    }
                    else
                    {
                        al.add(arr[i]);
                    }
                }
            }
        }
        System.out.println(al+" ");
        System.out.println("Count:"+count);
    }
    public static void main(String[] args)
    {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements:");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        q5 obj = new q5();
        obj.findDuplicate(arr,size);
        sc.close();
    }
}