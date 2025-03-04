package March_3.ArrayList_Example;

import java.util.ArrayList;

public class A_List {
    
    public static void main(String[] args) {
        
        ArrayList<String> data = new ArrayList<String>();

        data.add("Apple");
        data.add("Mango");
        data.add("Orange");
        data.add("Banana");

        System.out.println("data : "+data);

        System.out.println(data.get(2));

        data.remove(3);

        System.out.println(data);

        for(String d : data){
            System.out.println(d);
        }
    }

}
