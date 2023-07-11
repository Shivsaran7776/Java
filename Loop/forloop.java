// for loop statement in java
 
import java.util.*;
class forloop{
    public static void main(String args[]){
        int var;
        System.out.println("Enter a variable:");
        Scanner sc = new Scanner(System.in);
        var = sc.nextInt();
        for(int i = 0; i <= var; i++){
            System.out.println("i value is:"+i);
        }
        sc.close();
    }
}