import java.util.*;
class usingbool{
    public static void main(String args[]){
        int a,b,res;
        System.out.println("Enter 1st value:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Enter 2nd value:");
        b = sc.nextInt();
        res = a > b ? 15 : 30;
        System.out.println(res);
        boolean result = a > b ;
        System.out.println(result);
        sc.close();
    }
}