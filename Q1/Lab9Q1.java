import java.util.Scanner;

public class IT26102063Lab9Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter value b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter value c: ");
        double c = scanner.nextDouble();

        double discriminant = Math.pow(b, 2) - (4 * a * c);

        if (discriminant >= 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("Roots are real and different:");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else {
            System.out.println("Roots are complex and imaginary.");
        }
    }
}