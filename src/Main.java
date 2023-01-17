
public class Main {
    public static void main(String[] args) {
        convertBinaryToDecimal("111111");
    }

    static void convertBinaryToDecimal(String bin){
        int counter = 0;
        int base_number_start = 1;

        for (int i = bin.length()-1; i >= 0; i--) {
            if (Integer.parseInt(String.valueOf(bin.charAt(i))) != 0){
                counter += base_number_start;
            }
            base_number_start *= 2;
        }
        System.out.print(counter);
    }
}