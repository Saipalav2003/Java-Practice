package March_21.ExceptionHandling;


    class CustomException extends Exception {
        // Constructor
        public CustomException(String message) {
            super(message);
        }
    }
    
    public class CustomExceptionExample {
        
        // Method that throws the custom exception
        public static void demonstrateCustomExeption(int value) throws CustomException {
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

