import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, k;
        int result = 1;
        Scanner sc = new Scanner(System.in);

            System.out.print("Please enter the base number: ");
            k = sc.nextInt();
            System.out.print("Please enter the exponent: ");
            n = sc.nextInt();

        if (n >= 0) {
            for (int i = 1; i <= n; i++) {
                result *= k;
            }
            System.out.println("Result: " + result);
        } else {
            System.out.println("Please enter an exponent greater than or equal to zero!");
        }
    }
}