package Jan_29.Encpsulation_practice;

public class student {
    
    String Name;
    int Age;
    String City;
    int Rollno;

    student(String name, int age, String city, int rollno){
        Name = name;
        Age = age;
        City = city;
        Rollno = rollno;
    }

    String get_name(){
        return Name;
    }
    int get_age(){
        return Age; 
    }
    String get_city(){
        return City;
    }
    int get_rollno(){
        return Rollno;
    }
}
