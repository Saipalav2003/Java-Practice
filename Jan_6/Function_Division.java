package Jan_6;

public class Function_Division {
    
    public static double divide(double a, double b) {
        return a / b;
    }

    public static void main(String[] args){

        double num1 = 20.0;
        double num2 = 5.0;

        double result = divide(num1, num2);

        System.err.println("Result of division: " + result);
    }
}
