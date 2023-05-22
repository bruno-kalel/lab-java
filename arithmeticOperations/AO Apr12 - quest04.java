import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double base, exponent, result;

        System.out.println("base: ");
        base = scanner.nextDouble();

        System.out.println("exponent: ");
        exponent = scanner.nextDouble();

        result = Math.pow(base, exponent);

        System.out.println("result: " + result);

        scanner.close();
    }
}