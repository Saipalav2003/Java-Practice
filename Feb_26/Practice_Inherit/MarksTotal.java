package Feb_26.Practice_Inherit;

public class MarksTotal {

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
   
}
