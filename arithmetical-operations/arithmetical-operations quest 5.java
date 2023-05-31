import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double length, perimeter;

        System.out.println("length: ");
        length = scanner.nextDouble();

        perimeter = length*4;

        System.out.println("perimeter: " + perimeter);

        scanner.close();
    }
}