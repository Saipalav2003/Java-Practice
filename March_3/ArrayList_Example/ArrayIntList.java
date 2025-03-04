package March_3.ArrayList_Example;

import java.util.ArrayList;

public class ArrayIntList {
    
    public static void main(String[] args) {
		
		ArrayList<Integer> data = new ArrayList<Integer>();
		
		// add data 
		data.add(22);
		data.add(55);
        data.add(76);
        data.add(21);
		
		System.out.println("data : "+data);
		
		System.out.println(data.get(2));
		
		data.remove(3);
		System.out.println(data);
		
		for(Integer d : data) {
			System.out.println(d);
		}
		
		
		
	}
}
