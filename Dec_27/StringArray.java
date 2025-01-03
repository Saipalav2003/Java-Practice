public class StringArray {
    public static void main(String[] args) {
        String data[] = new String[5];

        data[0] = "JAVA";
        data[1] = "HTML";
        data[2] = "CSS";
        data[3] = "C++";
        data[4] = "SQL";

        for (int i = 0; i < data.length; i++){
            System.out.println((i+1)+" = "+data[i]);
        }
    }
}
