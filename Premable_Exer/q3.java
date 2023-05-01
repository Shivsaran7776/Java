/*3.	Write a C++ program to determine obesity according to body mass index, computed by,
    BMI    =        Weight in kgs
                (Height in meters) 2
A BMI >=27.8 for men and BMI >=25 for women is considered as obesity. The program should prompt for height, weight and gender and determine whether the person is obese.
 */

 import java.util.*;
 class q3{
    public static void main(String args[]){
        double weight,height,bmi;
        String gender;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your gender:");
        gender = sc.next();
        System.out.println("Enter your weight:");
        weight = sc.nextDouble();
        System.out.println("Enter your height:");
        height = sc.nextDouble();
        bmi = weight/height*height;
        System.out.println("Your BMI:"+bmi);
        if(bmi >= 27.8 && gender == "male"){
            System.out.println("You are in obesity");
        }
        else if (bmi >=25 && gender =="female"){
            System.out.println("You are in obesity");
        }
        else{
            System.out.println("You are healthy");
        }
        sc.close();
    }
}