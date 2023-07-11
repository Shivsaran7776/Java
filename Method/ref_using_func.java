//Using more than one reference of an class to get results.

class Person{
    String name;
    int age;
    String gender;
    public void show(){
        System.out.println("Name:"+name+" Age:"+age+" Gender:"+gender);
        }
}
class ref_using_func{
    public static void main(String args[]){
        Person p1 = new Person();
        p1.name = "Joel Miller";
        p1.age = 47;
        p1.gender = "male";

        Person p2 = new Person();
        p2.name = "Ellie";
        p2.age = 18;
        p2.gender = "Female";

        Person p3 = new Person();
        p3.name = "Nathan_Drake";
        p3.age = 30;
        p3.gender = "male";

        Person p4 = new Person();
        p4.name = "Sarah Miller";
        p4.age = 14;
        p4.gender = "Female";

        p1.show();
        p2.show();
        p3.show();
        p4.show(); 
    }
}