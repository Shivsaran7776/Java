import java.util.*;
class TooOlder extends Exception
{
    TooOlder()
    {
        super("TooOlder");
    }
}
class TooYounger extends Exception
{
    TooYounger()
    {
        super("TooYounger");
    }
}
class AgeException
{
    public static void main(String[] args)
    {
        int age;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age and name:");
        age = sc.nextInt();
        name = sc.next();
        sc.close();
        try{
            if(age>45)
            {
                throw new TooOlder();
            }
            if(age<20)
            {

                throw new TooYounger();
            }
            System.out.println("My name is "+name+".My age is"+age+"is eligible");
        }catch(TooOlder e)
            {
                System.out.println(e);
            }
            catch(TooYounger e)
            {
                System.out.println(e);
            }
    }
}
