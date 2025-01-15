package Jan_15.Constructor;

public class Student {
   

    String Name = "Sai";
    int RollNumber = 1001;

    // Student(){
    //     System.out.println("welcome to codes with pankaj");
    // }

    Student(String web){
        System.out.println("welcome to "+web);
    }

    void get_data(){

        System.out.println("My Name is : "+Name);
        System.out.println("My Roll Number : "+RollNumber);

    }


}
