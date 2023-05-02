public class RecursionMystery {
    public static void main(String[] args) {
        System.out.println(pow(2, 5));
        System.out.println(pow2(4, 6));

    }

    public static int pow(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * pow(base, exponent - 1);

        }
    }

    public static int pow2(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent % 2 == 0) {
            return pow(base * base, exponent / 2);
        } else {
            return base * pow(base, exponent - 1);
        }
    }
}
