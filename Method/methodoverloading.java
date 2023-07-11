  //Method overloading java code

import java.util.*;
class child{
    public int add(int a,int b,int c){
        return a + b + c;
    }
    public int add(int a,int b){
        return a + b;
    }
    public double add(double a,double b){
        return a + b;
    }
}
class methodoverloading{
    public static void main(String args[]){
        int a,b,c;
        double x,y;
        System.out.println("Enter integer value:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("Enter two double value:");
        x = sc.nextDouble();
        y = sc.nextDouble();
        child ch = new child();
        System.out.println(ch.add(a,b,c));
        System.out.println(ch.add(b,c));
        System.out.println(ch.add(x,y));
        sc.close();
    } 
}