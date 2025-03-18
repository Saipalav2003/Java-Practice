package March_12;
import java.util.*;
public class userinputString {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter list size ");
        String size = sc.next();

        String arr[] = new String[size];

        ArrayList<String> data = new ArrayList<String>();

        for (String i = 0; i < size; i++) {

            System.out.println("Enter data = " +i);
            arr[i] = sc.next();
            data.add(String.valueOf(arr[i]));

        }

        System.out.println("----------------------");

        for(String a : data) {
            System.out.println(a);
        }

        sc.close();

    }
}
