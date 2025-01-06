package Jan_3.Function;

public class return_type {
    
    public static int result(){
        return 10+20;
    }

    public static String result1(){
        return "Hello";
    }

    public static boolean result2(){
        return true;
    }
    public static double result3(){
        return 10.3;
    }

    public static void main(String[] args) {
        System.out.println("Addition of two numbers is: " +result());
        System.out.println(result1());
        System.out.println(result2());
        System.out.println(result3());

    }
}
