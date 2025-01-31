package Jan_31;

public class Stud_Main {
    
    public static void main(String[] args) {
        student stud = new student(101, "Rohit", 29, "Mumbai");
        System.out.println("ID : "+stud.get_id());
        System.out.println("Name : "+stud.get_name());
        System.out.println("Rollno : "+stud.get_rollno());
        System.out.println("Address : "+stud.get_address());
    }
}
