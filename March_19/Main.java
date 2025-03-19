package March_19;

public class Main {
    
    public static void main(String[] args) {

        Employee emp = new Employee(101, "Riya", 56899, "Mumbai");

        System.out.println("This is my ID : " +emp.getID());
        System.out.println("This is my Name : " +emp.getName());
        System.out.println("This is my Salary : " +emp.getSalary());
        System.out.println("This is my City : " +emp.getCity());


    }
}
