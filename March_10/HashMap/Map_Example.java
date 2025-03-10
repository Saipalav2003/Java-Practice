package March_10.HashMap;

import java.util.HashMap;
import java.util.Map;

import javax.xml.crypto.Data;

import Jan_20.Polymorphism.student;

public class Map_Example {
    
    public static void main(String[] args) {
        
        Map<Integer, String> data = new HashMap<Integer, String>();

        //add data
        data.put(101, "Java");
        data.put(102, "C++");
        data.put(103, "SQL");
        data.put(104, "Python");
        data.put(105, "Javascript");    

        System.out.println("Data" +data);

        
        //Remove element from HashMap
        data.remove(105);

        System.out.println("Data" +data);

        //Get all keys and values using loop
        //Iterating over HashMap

        for (Map.Entry<Integer, String> entry : data.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + "Value" + value);
        }


        //Retriving values Using key
        String value = data.get("SQL");
        System.out.println("Value associated with 'SQL' : +value");


        //Retrive value using getOrDefault
        String key = data.getOrDefault(105, "JSP");
        System.out.println("Value associated with '105': " + value);


        //Getting the key set
        Set<String> Keys = data.keySet();
        System.out.println("Keys in the Data: " + Keys);

    }

}
