package Jan_10;

public class Student {
    
    String name;
    int rno;
    
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rno);

}

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Sai";
        s1.rno = 101;
        s1.display();
    }
}