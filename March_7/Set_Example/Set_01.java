package March_7.Set_Example;

import java.util.HashSet;
import java.util.Set;

public class Set_01 {
    
    public static void main(String[] args) {
        
        Set<String> data = new HashSet<>();

        data.add("Apple");
        data.add("Mango");
        data.add("Banana");
        data.add("Banana");
        data.add("Orange");
        data.add("Orange");
        data.add("Apple");

        System.out.println(data);

        data.remove("Apple");
        System.out.println(data);

        System.out.println(data.contains("Apple"));

        System.out.println(data.size());

        data.clear();
        System.out.println(data);

        System.out.println(data.isEmpty());

        data.add("Apple");
        data.add("Mango");
        data.add("Banana");
        data.add("Banana");
        data.add("Orange");
        data.add("Orange");
        data.add("Apple");
        
        System.out.println(data);

    }
}
