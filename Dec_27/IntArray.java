import java.util.Scanner;

public class IntArray{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array size...");
        int size;
        size = scanner.nextInt();

        String Course[]  = new String[size];

        for (int i = 0; i < Course.length; i++){
            
            System.out.println("Enter Course Name = "+(i+1));
            Course[i] = scanner.next();

        }

         System.out.println("------output-------------");
        for (int i = 0; i < Course.length; i++) {
            System.out.println((i+1)+" = "+Course[i]);
        }


    }
}