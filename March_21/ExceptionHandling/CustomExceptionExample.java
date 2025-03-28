package March_21.ExceptionHandling;
import java.io.*;

    class CustomException extends Exception {
        public CustomException(String message) {
            super(message);
        }
    }

    public class CustomExceptionExample {

        public static void demonstrateCustomExeption(int value) throws CustomException {
            if (value < 0) {
                throw new CustomException("Negative value provide: " + value);
            }
            System.out.println("Value is: " + value);
        }
    

    public static void main(String[] args) {
        try{
            demonstrateCustomExeption(10);
            demonstrateCustomExeption(-5);
        }catch (CustomException e){
            System.out.println("Caught CoustomExeption: " + e.getMessage());
        }
    }
}




