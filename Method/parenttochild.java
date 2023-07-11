//using method in child class and accesing in parent class

import java.util.*;
class child{
    /**
     * @param a
     * @return
     */
    public String vote(int a)
    {
        if(a >=18)
        {
            return "You are eligible to vote";
        }
        else
        {
            return "Not eligible to vote";
        }
    }
    public void documents()
    {
        System.out.println("Bring your original proof while voting");
    } 
}
class parenttochild{
    public static void main(String args[]){
        int age;
        System.out.println("Enter your age:");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        child c = new child();
        System.out.println(c.vote(age));
        c.documents();    
        sc.close();
    }
}