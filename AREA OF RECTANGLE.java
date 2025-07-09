import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Length: ");
        int Length = scanner.nextInt();

        System.out.print("Enter Breath: ");
        int Breath = scanner.nextInt();

        int area = Length * Breath;
        System.out.println("Area of the rectangle is: " + area + " cm^2");

        scanner.close();
    }
}
