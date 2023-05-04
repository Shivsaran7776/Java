import java.util.*;
class q7
{
    public void DecimalExpansion(int f,int s)
    {
        double res;
        res = (double)f/s;
        System.out.println(res);
    }
    public static void main(String[] args)
    {
    int val1,val2;
        System.out.println("Enter first value:"+args[0]);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter second value"+args[1]);
        val1 = Integer.parseInt(args[0]);
        val2 = Integer.parseInt(args[1]);
        q7 obj = new q7();
        obj.DecimalExpansion(val1,val2);
        sc.close();
    }
}