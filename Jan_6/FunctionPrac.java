package Jan_6;

public class FunctionPrac {
    static int Total;
    static void marks(int Java, int CPP, int SQL, int Python, int Javascript){
        int total = Java + CPP + SQL + Python + Javascript;
        Total = total;
        System.out.println("Java =" +Java);
        System.out.println("CPP =" +CPP);
        System.out.println("SQL =" +SQL);
        System.out.println("Python =" +Python);
        System.out.println("Javascript =" +Javascript);
        System.out.println("Total =" +total);

    }

    static void percentage(){
        int percentage = (Total*100)/500;
        System.out.println("Percentage :" +percentage);
    }

    static void division(){
        int division = (Total*100)/500;
        System.out.println("Division :" +division);
    }

    public static void main(String[] args) {
        marks(67, 57, 79, 54, 66);
        percentage();
    }
}
