public class Main {
    public static void main(String[] args) {
        System.out.println(5 + "! = " + iFact(5));
        System.out.println(5 + "! = " + rFact(5));

    }

    public static long iFact(int n) {
        long product = 1;
        for(int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;


    }

    public static long rFact(int n) {
        if(n > 1) {
            return 1;
        }
        else
            return n * rFact(n - 1);
    }


}
