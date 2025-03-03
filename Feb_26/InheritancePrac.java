package Feb_26;

public class InheritancePrac{
    
    class Marks{

        public int getmarks(int cpp, int SQL, int Java, int Python, int HTML){

            int total = cpp + SQL + Java + Python + HTML;
            System.out.println("Marks in cpp: "+cpp);
            System.out.println("Marks in SQL: "+SQL);
            System.out.println("Marks in Java: "+Java);
            System.out.println("Marks in Python: "+Python);
            System.out.println("Marks in HTML: "+HTML);
            System.out.println("Total marks: "+total);
            return total;
        }
    }

    class Percentage extends Marks{

        int total = getmarks(70, 60, 55, 80, 96);

        public float getPercentage(){

            float percentage = (total/500.0f)*100;
            System.out.println("Percentage: "+percentage);
            return percentage;

        }
    } 

    class Result extends Percentage{

        float percentage;

        public Result() {
            
            percentage = getPercentage();

            if(percentage > 80 && percentage <= 100) {
                System.out.println("Grade A");
            }
            else if(percentage > 60 && percentage <= 80){
                System.out.println("Grade B");
            }
            else if(percentage > 40 && percentage <= 60){
                System.out.println("Grade c");
            }
            else{
                System.out.println("Fail");
            }
        }
    }

        
   
        public static void main(String[] args){
            Result r = new Result();
            r.getPercentage();
        }
    
    
}
