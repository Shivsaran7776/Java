import java.util.*;
class q9
{
    public void ZodaicSign(int m,int d)
    {
        if((m == 12 && d >= 22 && d<=31) || (m == 1 && d >= 1 && d<=19)){
            System.out.println("Capicorn");
        }
        else if((m == 1 && d >= 20 && d<=31) || (m == 2 && d >= 1 && d<=17)){
            System.out.println("Aquarius");
        }
        else if((m == 2 && d >= 18 && d<=28) || (m == 3 && d >= 1 && d<=19)){
            System.out.println("Pisces");
        }
        else if((m == 3 && d >= 20 && d<=31) || (m == 4 && d >= 1 && d<=19)){
            System.out.println("Aries");
        }
        else if((m == 4 && d >= 20 && d<=30) || (m == 5 && d >= 1 && d<= 20)){
            System.out.println("Taururs");
        }
        else if((m == 5 && d >= 21 && d<=31) || (m == 6 && d >= 1 && d<= 22)){
            System.out.println("Gemini");
        }
        else if((m == 6 && d >= 23 && d<=30) || (m == 7 && d >= 1 && d<= 22)){
            System.out.println("Cancer");
        }
        else if((m == 7 && d >= 23 && d<=31) || (m == 8 && d >= 1 && d<= 22)){
            System.out.println("Leo");
        }
        else if((m == 8 && d >= 23 && d<=31) || (m == 9 && d >= 1 && d<=22)){
            System.out.println("Virgo");
        }
        else if((m == 9 && d >= 23 && d<= 30) || (m == 10 && d >= 1 && d<= 21)){
            System.out.println("Libra");
        }
        else if((m == 10 && d >= 22 && d<=31) || (m == 11 && d >= 1 && d<= 21)){
            System.out.println("Scorpio");
        }
        else if((m == 11 && d >= 22 && d<=30) || (m == 12 && d >= 1 && d<= 21)){
            System.out.println("Sagittarius");
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
        q9 obj = new q9();
        obj.ZodaicSign(month,day); 
        sc.close();  
    }
}