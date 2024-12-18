package Dec_17;
import java.util.Scanner;
public class mcq {
    public static void main(String [] arg){

        int a = 10;
        int b = 20;

        //Question 1
        Scanner sc = new Scanner (System.in);
        System.out.println("1. Who invented Java Programming?\r\n" + //
                        "a) Guido van Rossum\r\n" + //
                        "b) James Gosling\r\n" + //
                        "c) Dennis Ritchie\r\n" + //
                        "d) Bjarne Stroustrup\n");
        char option = sc.next().charAt(0);

        switch (option) {
            case 'a': System.out.println("Wrong Answer");
            break;

            case 'b': System.out.println(" Answer: b \r\n" +//
            "Explanation: Java programming was developed by James Gosling at Sun Microsystems in 1995. James Gosling is well known as the father of Java.");
            break;

            case 'c': System.out.println("Wrong Answer");
            break;

            case 'd': System.out.println("Wrong Answer");
            break;
            
            default:
            System.out.println("select only a,b,c,d");
        }

        //Question 2
        System.out.println("2. Which statement is true about Java?\r\n" + //
                        "a) Java is a sequence-dependent programming language\r\n" + //
                        "b) Java is a code dependent programming language\r\n" + //
                        "c) Java is a platform-dependent programming language\r\n" + //
                        "d) Java is a platform-independent programming language\n");
        char option1 = sc.next().charAt(0);

        switch (option1) {
            case 'a': System.out.println("Wrong Answer");
            break;

            case 'b': System.out.println("Wrong Answer");
            break;

            case 'c': System.out.println("Wrong Answer");
            break;

            case 'd': System.out.println("Answer: d \r\n" +//
            "Explanation: Java is called ‘Platform Independent Language’ as it primarily works on the principle of ‘compile once, run everywhere’.");
            break;
            
            default:
            System.out.println("select only a,b,c,d");
        }

        //Question 3
        System.out.println("3. Which component is used to compile, debug and execute the java programs?\r\n" + //
                        "a) JRE\r\n" + //
                        "b) JIT\r\n" + //
                        "c) JDK\r\n" + //
                        "d) JVM\n");
        char option2 = sc.next().charAt(0);

        switch (option2) {
            case 'a': System.out.println("Wrong Answer");
            break;

            case 'b': System.out.println("Wrong Answer");
            break;

            case 'c': System.out.println("Answer: c \r\n" +//
            "Explanation: JDK is a core component of Java Environment and provides all the tools, executables and binaries required to compile, debug and execute a Java Program.");
            break;

            case 'd': System.out.println("Wrong Answer");
            break;
            
            default:
            System.out.println("select only a,b,c,d");
        }

         //Question 3
        System.out.println("3. Which component is used to compile, debug and execute the java programs?\r\n" + //
                        "a) JRE\r\n" + //
                        "b) JIT\r\n" + //
                        "c) JDK\r\n" + //
                        "d) JVM\n");
        char option3 = sc.next().charAt(0);

        switch (option3) {
            case 'a': System.out.println("Wrong Answer");
            break;

            case 'b': System.out.println("Wrong Answer");
            break;

            case 'c': System.out.println("Answer: c \r\n" +//
            "Explanation: JDK is a core component of Java Environment and provides all the tools, executables and binaries required to compile, debug and execute a Java Program.");
            break;

            case 'd': System.out.println("Wrong Answer");
            break;
            
            default:
            System.out.println("select only a,b,c,d");
        }

         //Question 4
         System.out.println("4. Which one of the following is not a Java feature?\r\n" + //
         "a) Object-oriented\r\n" + //
         "b) Use of pointers\r\n" + //
         "c) Portable\r\n" + //
         "d) Dynamic and Extensible\n");
        char option4 = sc.next().charAt(0);

        switch (option4) {
        case 'a': System.out.println("Wrong Answer");
        break;

        case 'b': System.out.println("Answer: b \r\n" +//
        "Explanation: Pointers is not a Java feature. Java provides an efficient abstraction layer for developing without using a pointer in Java. Features of Java Programming are Portable, Architectural Neutral, Object-Oriented, Robust, Secure, Dynamic and Extensible, etc");
        break;

        case 'c': System.out.println("Wrong Answer");
        break;

        case 'd': System.out.println("Wrong Answer");
        break;

        default:
        System.out.println("select only a,b,c,d");
        }


        //Question 5
        System.out.println("5. Which of these cannot be used for a variable name in Java?\r\n" + //
        "a) identifier & keyword\r\n" + //
        "b) identifier\r\n" + //
        "c) keyword\r\n" + //
        "d) none of the mentioned\n");
       char option5 = sc.next().charAt(0);

       switch (option5) {
       case 'a': System.out.println("Wrong Answer");
       break;

       case 'b': System.out.println("Wrong Answer");
       break;

       case 'c': System.out.println("Answer: c \r\n" +//
       "Explanation: Keywords are specially reserved words that can not be used for naming a user-defined variable, for example: class, int, for, etc.");
       break;

       case 'd': System.out.println("Wrong Answer");
       break;

       default:
       System.out.println("select only a,b,c,d");
       }
   }
    }

