
import java.util.Scanner;

public class IntArrayPrac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;

        System.out.println("Enter Array size .... ");
        size = scanner.nextInt();

        int [] array = new int[size];

        for (int i = 0; i < size; i++){
            System.out.println("Enter Array elements .... ["+i+"] = ");
            array[i] = scanner.nextInt();
        }

        System.out.println("-------Output---------");
    for (int i = 0; i < size; i++) {
        System.out.println("Array elements are : "+"["+i+"]  = "+array[i]);
    }
    }

}

