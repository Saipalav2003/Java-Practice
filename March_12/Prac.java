package March_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Prac {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter list size: ");
        String size = sc.next(); // Read size as a String

        // Convert String size to integer
        int listSize = Integer.parseInt(size);

        // Create an array of the converted integer size
        String arr[] = new String[listSize];

        // Create an ArrayList
        ArrayList<String> data = new ArrayList<String>();

        // Loop through using an integer index
        for (int i = 0; i < listSize; i++) { 
            System.out.println("Enter data for index " + i + ": ");
            arr[i] = sc.next();  // Read input string
            data.add(arr[i]); // Add input to the ArrayList
        }

        System.out.println("----------------------");

        // Print the stored data
        for (String a : data) {
            System.out.println(a);
        }

        sc.close(); // Close Scanner to avoid memory leak
    }
}
