package loops;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again;

        do{
            System.out.print("Enter the first number : ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number : ");
            double num2 = scanner.nextDouble();
            System.out.println("sum : " + (num1+num2));

            System.out.print("Would you like to run again ? ");
            again = scanner.nextBoolean();

        }while (again);

    }
}
