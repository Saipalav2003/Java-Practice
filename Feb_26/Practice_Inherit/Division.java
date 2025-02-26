package Feb_26.Practice_Inherit;

public class Division {
    static int per;
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
}
