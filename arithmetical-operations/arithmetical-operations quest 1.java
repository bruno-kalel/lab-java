import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String name, enrollmentNum, address;
        double average;

        System.out.println("name: ");
        name = scanner.nextLine();

        System.out.println("enrollmentNum: ");
        enrollmentNum = scanner.nextLine();

        System.out.println("address: ");
        address = scanner.nextLine();

        System.out.println("average: ");
        average = scanner.nextDouble();

        System.out.println("name: " + name);
        System.out.println("enrollmentNum: " + enrollmentNum);
        System.out.println("address: " + address);
        System.out.println("average: " + average);

        scanner.close();
    }
}
