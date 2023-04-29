//String function in java

import java.util.*;
class StringFunc
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.next();
        System.out.println("Hello "+ name);
        String name1 = name + 'S';
        System.out.println(name1);
        System.out.println(name == name1);
        sc.close();
        //using StringBuffer functionalies is peform
        StringBuffer sb = new StringBuffer("Vikram ");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.insert(7," learns java "));
    }
}