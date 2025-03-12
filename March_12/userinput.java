package March_12;
import java.util.*;
public class userinput {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter list size");
        size = sc.nextInt();

        int arr[] = new int[size];

        ArrayList<Integer> data = new ArrayList<Integer>();

        for (int i = 0; i < size; i++) {

            System.out.println("Enter data = " +i);
            arr[i] = sc.nextInt();
            data.add(arr[i]);

        }

        System.out.println("-------------------------------");

        for(int a : data) {

            System.out.println(a);
        }
    }

}
