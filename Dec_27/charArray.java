public class charArray {
    
    public static void main(String[] args) {
        char data[] = new char[3];

        data[0] = 'S';
        data[1] = 'A';
        data[2] = 'I';

        for (int i = 0; i < data.length; i++){
            System.out.println((i+1)+" = " +data[i]);
        }

    }
}
