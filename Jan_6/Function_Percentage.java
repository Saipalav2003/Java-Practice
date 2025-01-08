package Jan_6;

public class Function_Percentage {
    static int Total;
    static int per;
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
        per = percentage;
    }

    static void grade(){
        if(per < 100 && per > 80){
            System.out.println("Grade A");
        }else if(per < 80 && per > 60){
            System.out.println("B Grade");
        }else if(per < 60 && per > 40){
            System.out.println("C Grade");
        }else if(per < 40 && per > 20){
            System.out.println("D Grade");
        }else{
            System.out.println("Fail");
        }
       
    }

    public static void main(String[] args) {
        
        marks(67, 57, 79, 54, 66);
        percentage();
        
        grade();

  
    }
}
