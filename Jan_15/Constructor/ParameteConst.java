package Jan_15.Constructor;

public class ParameteConst {
    
    String Name = "Neha";
    int Salary = 100000;
    int EmpId = 101;

    ParameteConst(String web){

        System.out.println("Welcome to our first web page. \n" +web);
    }

    void get_output(){
        System.out.println("My name is :" +Name);
        System.out.println("My Salary is :" +Salary);
        System.out.println("My EmpId is :" +EmpId);

    }
}
