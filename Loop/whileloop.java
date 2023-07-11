// while loop

import java.util.*;
class whileloop{
    public static void main(String args[]){
        int a,i=0;
        System.out.println("Enter value for variable:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        sc.close();
        while(i<=a){
            System.out.println(i);
            i++;
        }
    }
} 