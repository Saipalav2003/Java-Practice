package Jan_20;

public class Crads {
    
    // method over loading 

    void info(){
        System.out.println("welcome to codes with pankaj");
    }

    void info(String msg){
        System.out.println("this is msg : "+msg);
    }

    void info(int limit){
        System.out.println("credit card limit...");
    }


    public static void main(String[] args) {
        Crads cards = new Crads();
        cards.info();
        cards.info("riya");
        cards.info(1001);

    }

}
