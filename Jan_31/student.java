package Jan_31;

public class student {
    int id;
    String name;
    int rollno;
    String address;

    student(int ID, String Name, int Rollno, String Address){
        id = ID;
        name = Name;
        rollno = Rollno;
        address = Address;
    }

    void set_id(int ID){
        id = ID;
    }

    void set_name(String Name){
        name = Name;
    }

    void set_rollno(int Rollno){
        rollno = Rollno;
    }

    void set_address(String Address){
        address = Address;
    }

    int get_id(){
        return id;
    }

    String get_name(){
        return name;
    }

    int get_rollno(){
        return rollno;
    }

    String get_address(){
        return address;
    }
}
