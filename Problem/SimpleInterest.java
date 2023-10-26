
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principle amount: ");
        double principle = scanner.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the time (in years): ");
        double time = scanner.nextDouble();

        double simpleInterest = (principle * rate * time) / 100.0;

        System.out.println("Simple Interest = " + simpleInterest);
    }
}
