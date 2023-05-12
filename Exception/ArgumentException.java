import java.util.*;
class Limit extends Exception
{
    Limit()
    {
        super("Limit should be greater than 5");
    }
}
public class ArgumentException
{
    public static void main(String[] args)
    {
        int limit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit:");
        limit = sc.nextInt();
        sc.close();
        try
        {
            if(limit<5)
            {
                throw new Limit();
            }
            else
            {
                int sum=0;
                for(int i=0;i<limit;i++)
                {
                    sum+=i;
                }
                System.out.println("Sum is: "+sum);
            }
        }catch(Limit e)
        {
            System.out.println(e);
        }
}
}