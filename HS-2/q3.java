/*3.Write a program that takes three integer command-line arguments and prints equal if all three are equal, and not equal otherwise.  */
class q3
{
    public static void main(String[] args)
    {
        System.out.println("Enter first arguements:"+args[0]);
        System.out.println("Enter second arguements:"+args[1]);
        System.out.println("Enter third arguements:"+args[2]);
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if(a==b && b==c)
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not-Equal");   
        } 
    }
}