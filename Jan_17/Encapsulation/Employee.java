package Jan_17.Encapsulation;

public class Employee {

    String name;
    int age;
    int salary;

    Employee(String Name,int Age,int Salary){

        name = Name;
        age = Age;
        salary = Salary;

    }

    void set_name(String Name){
        name = Name;
    }

    void set_age(int Age){
        age = Age;
    }

    void set_salary(int Salary){
        salary = Salary;
    }


    String get_name(){
        return name;
    }

    int get_age(){
        return age;
    }

    int get_salary(){
        return salary;
    }

    
}
