import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side length of the square: ");
        double sideLength = scanner.nextDouble();

        double area = sideLength * sideLength;

        System.out.println("Area of the square = " + area);
    }
}
