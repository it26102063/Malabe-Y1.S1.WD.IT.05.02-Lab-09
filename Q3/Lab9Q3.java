public class IT26102063Lab9Q3 {

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        // Expression i: (3 * 4 + 5 * 7)^2
        int term1 = multiply(3, 4);
        int term2 = multiply(5, 7);
        int sum1 = add(term1, term2);
        int result1 = square(sum1);

        // Expression ii: (4 + 7)^2 + (8 + 3)^2
        int sum2 = add(4, 7);
        int sq1 = square(sum2);

        int sum3 = add(8, 3);
        int sq2 = square(sum3);

        int result2 = add(sq1, sq2);

        System.out.println("Result of (3 * 4 + 5 * 7)^2\t: " + result1);
        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2\t: " + result2);
    }
}