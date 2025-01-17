package Jan_17.Encapsulation;

public class StudentMain {
    
    public static void main(String[] args) {

        Student std = new Student("Neha", 201, 22,"Mumbai");

        System.out.println("My name is :" +std.get_name());
        System.out.println("My rollno is :" +std.get_rollno());
        System.out.println("My age is :" +std.get_age());
        System.out.println("My city is :" +std.get_city());

    }
}
