/*13. Create a function that takes an array containing only numbers and return the first element.
	getFirstValue([1, 2, 3]) ➞ 1
	getFirstValue([80, 5, 100]) ➞ 80
	getFirstValue([-500, 0, 50]) ➞ -500
 */

 import java.util.*;
 class q13{
    int first;
    static int getFirstValue(int a[]){
        return a[0];
    }
    public static void main(String args[]){
        int size;
        System.out.println("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int arr[] = new  int[size];
        System.out.println("Enter array elemnts:");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The Index value in array is:"+ getFirstValue(arr));
        sc.close();
    }
 }