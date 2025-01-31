package Jan_31.Practice;

public class EncapPractice {

    int id;
    String name;
    int age;
    String place;
    float salary;

    EncapPractice(int ID, String Name, int Age, String Place, float Salary){

        id = ID;
        name = Name;
        age = Age;
        place = Place;
        salary = Salary;
    }

    void set_id(int ID){
        id = ID;
    }

    void set_name(String Name){
        name = Name;
    }

    void set_age(int Age){
        age = Age;
    }

    void set_place(String Place){
        place = Place;
    }

    void set_salary(float Salary){
        salary = Salary;
    }

    int get_id(){
        return id;
    }

    String get_name(){
        return name;
    }

    int get_age(){
        return age;
    }

    String get_place(){
        return place;
    }

    float get_salary(){
        return salary;  
    }
}