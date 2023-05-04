/*4.	Write a program that that takes the wind speed (in miles per hour) as an integer command-line argument and prints whether it qualifies as a hurricane, and if so,
 whether it is a Category 1, 2, 3, 4, or 5 hurricane. Below is a table of the wind speeds according to the Saffir-Simpson scale.  */

class q4
{
    public static void main(String[] args)
    {
        System.out.println(args[0]);
        int mph = Integer.parseInt(args[0]);
        if(mph>=74 && mph<=95)
            System.out.println("Category 1");
        else if(mph>=96 && mph<=95)
            System.out.println("Category 2");
        else if(mph>=96 && mph<=110)
            System.out.println("Category 2");
        else if(mph>=111 && mph<=130)
            System.out.println("Category 3");
        else if(mph>=131 && mph<=155)
            System.out.println("Category 4");
        else if(mph>=155)
            System.out.println("Category 5");
        else
            System.out.println("Not a hurricane");
    }
}