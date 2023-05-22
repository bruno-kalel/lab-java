import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double c, f;

        System.out.println("c: ");
        c = scanner.nextDouble();

        f = (c*1.8)+32;

        System.out.println("f: " + f);

        scanner.close();
    }
}