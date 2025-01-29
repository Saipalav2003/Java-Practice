package Jan_29.Encpsulation_practice;

public class studentMain {
    
    public static void main(String[] args) {
        
        student std = new student("Jiya", 22, "Mumbai", 11);

        System.out.println("Name" + std.get_name());
        System.out.println("Age" + std.get_age());
        System.out.println("City" + std.get_city());
        System.out.println("Rollno" + std.get_rollno());
    }
}
