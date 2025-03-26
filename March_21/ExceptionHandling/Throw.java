package March_21.ExceptionHandling;

public class Throw {
    class CustomException extends Exception {
        // Constructor
        public CustomException(String message) {
            super(message);
        }
    }
    
    public class UseFinal {
        
        // Method that throws the custom exception
        public static void throwAndThrowsExample() throws CustomException {
            throw new CustomException("This is custom exception");
        }
    
        public static void main(String[] args) {
            try{
                throwAndThrowsExample(); // Call method that throws exception
            }catch (CustomException e) {
                System.out.println("Caught Custom Exception: " + e.getMessage());
            }
        }
    }
}
