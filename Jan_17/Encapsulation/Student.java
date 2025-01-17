package Jan_17.Encapsulation;

public class Student {
    
    String name;
    int rollno;
    int age;
    String city;

    Student(String Name, int Rollno, int Age, String City){

        name = Name;
        rollno = Rollno;
        age = Age;
        city = City;
    }

    void set_name(String Name){
        name = Name;
    }

    void set_rollno(int Rollno){
        rollno = Rollno;
    }

    void set_age(int Age){
        age = Age;
    }

    void set_city(String City){
        city = City;
    }

    String get_name(){
        return name;
    }

    int get_rollno(){
        return rollno;
    }

    int get_age(){
        return age;
    }

    String get_city(){
        return city;
    }

}
