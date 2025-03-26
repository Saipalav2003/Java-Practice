package March_21.ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UseFinal {
    public static void main(String[] args) {
        
        try{
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your name:");
            String name = sc.next();

            System.out.println("Enter your age:");
            int age = sc.nextInt();

            System.out.println("Enter your name : " +name);
            System.out.println("Enter your age: "+age);
        }catch(InputMismatchException e){
            System.out.println("Enter only number.");
        }finally{
            System.out.println("The blosck always execute.");
        }
        
        }
    }
        
    

