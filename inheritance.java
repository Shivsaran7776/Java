//Inheritance concept using files Calc,AdvCalc,PowCalc

import java.util.*;
class inheritance
{
    public static void main(String args[])
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integer value:");
        a = sc.nextInt();
        b = sc.nextInt();
        PowCalc obj1 = new PowCalc();
        int v1 = obj1.add(a,b);
        int v2 = obj1.sub(a,b);
        int v3 = obj1.multi(a,b);
        int v4 = obj1.div(a,b);
        double v5 = obj1.pow(a,b);
        System.out.println(v1+" "+v2+" "+v3+" "+v4+" "+v5);
    }
}