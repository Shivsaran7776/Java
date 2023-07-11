//Accesing one class to other class file

import java.util.*;
class hello {
    void greet(){
        System.out.print("Hello ");
    }
}
class user extends hello {
    public static void main(String args[]){
        String name;
        System.out.println("Enter your name:");
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        hello h = new hello();
        h.greet();
        System.out.print(name);
        sc.close();
    }
} 