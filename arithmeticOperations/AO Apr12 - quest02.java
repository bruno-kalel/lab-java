import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double grade1, grade2, grade3, average;

        System.out.println("grade1: ");
        grade1 = scanner.nextDouble();

        System.out.println("grade2: ");
        grade2 = scanner.nextDouble();

        System.out.println("grade3: ");
        grade3 = scanner.nextDouble();

        average = (grade1 + grade2 + grade3)/3;

        System.out.println("average: " + average);

        scanner.close();
    }
}