package Jan_17.Encapsulation;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee emp = new Employee("sai", 21, 56700);
        System.out.println("My name is : "+emp.get_name());
        System.out.println("My age is : "+emp.get_age());
        System.out.println("My Salary is "+emp.get_salary());
        emp.set_age(20);
        System.out.println("My name is : "+emp.get_name());
        System.out.println("My age is : "+emp.get_age());
        System.out.println("My Salary is "+emp.get_salary());
    }
    
}
