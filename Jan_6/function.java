package Jan_6;

public class function {
   static int Total;
    static void marks(int java, int Cpp, int python, int Javascript){
        int total = java+Cpp+python+Javascript;
        Total = total;
        System.out.println("JAVA = "+java);
        System.out.println("CPP = "+java);
        System.out.println("Python = "+java);
        System.out.println("JAVASCRIPT = "+java);
        System.out.println("Total  = "+total);
    
    }
    
    static void Percentage(){
        int percentage = (Total*100)/400;

        System.out.println("Percentage : "+percentage);
    }

    public static void main(String[] args) {
        marks(56,89,45,63);
        Percentage();
    }
}
