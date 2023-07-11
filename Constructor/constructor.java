//Constructor in classes using this and super method.  

class A
{
    public A()
    {
        this(5);
        System.out.println("In A");
    }
    public A(int a)
    {
        super();
        System.out.println("Integer input A");
    }
}
class B extends A
{
    public B()
    {
        super();
        System.out.println("In B");
    }
    public B(int a)
    {
        this();
        System.out.println("Integer input B");
    }
}
class constructor
{
    public static void main(String args[])
    {
        B obj1;
        obj1 = new B(5);  
    } 
}