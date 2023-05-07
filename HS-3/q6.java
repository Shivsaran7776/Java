/*. Complete the Java program which takes size of the array and array elements as input and puts the prime and composite elements of 
the array in two separate arrays (according to their occurrence in the input array) .

For example:
If size of an array is 10 and the elements are 3, 9, 60, 5, 17, 40, 70, 18, 100 and 43 then the output will be

Elements of Prime array: 3 5 17 43
Elements of Composite array: 9 60 40 70 18 100
 */

import java.util.*;
class q6
{
    void Elements(int arr[],int n)
    {
        ArrayList<Integer> PA = new ArrayList<Integer>();
        ArrayList<Integer> CA = new ArrayList<Integer>();
        int val_i,val_j;
        for(int i=0;i<n;i++)
        {
            val_i=arr[i];
            if(val_i%2==0||val_i%3==0||val_i%5==0||val_i%7==0)
            {
                if(val_i==2||val_i==3||val_i==5||val_i==7)
                {
                    PA.add(val_i);
                }
                else
                {
                    continue;
                }
            }
            else
            {
                PA.add(val_i);
            }
            for(int j=i+1;j<n;j++)
            {
                val_j=arr[j];
                if(val_j%val_i==0||val_j%2==0)
                {
                    if(!CA.contains(val_j))
                    {
                        CA.add(val_j);
                    }  
                }
                else
                {
                    continue;
                }
            }
        }
        System.out.println(PA+" ");
        System.out.println(CA+" ");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of the array:");
        size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements in array:");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        q6 obj = new q6();
        obj.Elements(arr,size);
        sc.close();
    }
}