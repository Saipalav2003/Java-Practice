package Jan_24;

public class parameterized {
    int num1;
    int num2;

    parameterized(int Num1, int Num2){
        num1 = Num1;
        num2 = Num2;
    }

    public void display(){
        System.out.println("Number:" +(num1+num2));
    }

    public static void main(String[] args) {
        parameterized par = new parameterized(10, 20);
        par.display();
    }
}
