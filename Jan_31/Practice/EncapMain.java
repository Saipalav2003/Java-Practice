package Jan_31.Practice;

public class EncapMain {
    
    public static void main(String[] args) {
        EncapPractice encp = new EncapPractice(1, "Saloni", 24, "Mumbai", 10000.22f);
        System.out.println("ID : "+encp.get_id());
        System.out.println("Name : "+encp.get_name());
        System.out.println("Age : "+encp.get_age());
        System.out.println("Place : "+encp.get_place());
        System.out.println("Salary : "+encp.get_salary());

        encp.set_place("Delhi");
        System.out.println("ID : "+encp.get_id());
        System.out.println("Name : "+encp.get_name());
        System.out.println("Age : "+encp.get_age());
        System.out.println("Place : "+encp.get_place());
        System.out.println("Salary : "+encp.get_salary());
    }
}
