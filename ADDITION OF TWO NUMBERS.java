import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int sum = x+y;
        System.out.println("Sum of the two numbers is: " + sum);
        scanner.close();
    }
}
