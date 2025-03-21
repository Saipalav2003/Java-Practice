package March_21.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example_1 {
    
    public static void main(String[] args) {
        
        try{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Name ");
        String name = sc.next();

        System.out.println("Enter your Age ");
        int age = sc.nextInt();

        System.out.println("Enter your Height ");
        int height = sc.nextInt();

        System.out.println("Your name is :" +name);
        System.out.println("Your age is :" +age);
        System.out.println("Your height is :" +height);

        int bmi = age / height;
        System.out.println("Your BMI = "+bmi);

    }catch(InputMismatchException e){
        System.out.println("Please enter only Number -");
    }catch(ArithmeticException e){
        System.out.println("Do not enter zero into height -");
    }



    }
}
