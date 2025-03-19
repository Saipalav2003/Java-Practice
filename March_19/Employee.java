package March_19;

public class Employee {
    
    int id;
    String name;
    int salary;
    String city;

    Employee(int id, String name, int salary, String city){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.city = city;
    }

    public int getID(){
        return id;
    }
    
    public void setID(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public String getCity(){
        return city;
    }

    public void setCity(String city){
        this.city = city;
    }


}
