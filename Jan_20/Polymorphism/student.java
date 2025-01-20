package Jan_20.Polymorphism;

public class student {
    
    void info(){
        System.out.println("Hello");
    }
    void info(String name){
        System.out.println("My name is :" +name);
    }

    void info(int rollno){
        System.out.println("My rollno is :" +rollno);
    }

    void info(char grade){
        System.out.println("My grade is :" +grade);
    }
    
    public static void main(String[] args) {
       
        student std = new student();
        std.info();
        std.info("Sai");
        std.info(20);
        std.info('A');

    }
}
