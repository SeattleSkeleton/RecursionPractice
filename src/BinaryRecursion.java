public class BinaryRecursion {
    public static void main(String[] args) {
        printBinary(130);
    }


    public static void printBinary(int n) {
        if (n < 2) {
            System.out.println(n);
        } else {
            printBinary(n / 2);
            printBinary(n % 2);
        }
    }
}
