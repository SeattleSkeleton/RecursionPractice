public class MoreRecursion {
    public static void main(String[] args) {
        printStars(5);
        printStars2(5);

    }

    public static void printStars(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }

    }

    public static void printStars2 (int n) {
        if (n == 1) {
            System.out.print(" *");
        }
            else {
                System.out.print(" *");
                printStars2(n - 1);
        }
    }
}
