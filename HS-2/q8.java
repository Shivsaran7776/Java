import java.util.*;
class q8
{
    public void season(int m,int d)
    {
        if((m == 3 && d >= 21 && d<=31)||(m == 4 && d >=1 && d<=30) || (m == 5 && d >=1 && d<=31) || (m == 6 && d >=1 && d <=20)){
            System.out.println("Spring");
        }
        else if((m == 6 && d >= 21 && d<=30)||(m == 7 && d >=1 && d<=31) || (m == 8 && d >=1 && d<=30) || (m == 9 && d >=1 && d <= 22)){
            System.out.println("Summer");
        }
        else if((m == 9 && d >= 23 && d<=30)||(m == 10 && d >=1 && d<=31) || (m == 11 && d >=1 && d<=30) || (m == 12 && d >=1 && d <= 21)){
            System.out.println("Fall");
        }
        else if((m == 12 && d >= 21 && d<=31)||(m == 1 && d >=1 && d<=31) || (m == 2 && d >=1 && d<=29) || (m == 3 && d >=1 && d <=20)){
            System.out.println("Winter");
        }
    }
    public static void main(String[] args)
    {
        int month,day;
        Scanner sc = new Scanner("System.in");
        System.out.println("Enter the month in integer value from [1-12]:"+args[0]);
        System.out.println("Enter the day in integer value:"+args[1]);
        month = Integer.parseInt(args[0]);
        day = Integer.parseInt(args[1]); 
        q8 obj = new q8();
        obj.season(month,day); 
        sc.close();  
    }
}