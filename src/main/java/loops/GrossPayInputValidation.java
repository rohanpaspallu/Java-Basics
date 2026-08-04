package loops;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {
        double rate = 15;
        double maxHrs = 40;

        System.out.println("How many hours did you work : ");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while (hoursWorked > maxHrs || hoursWorked < 0){
            System.out.println("Invalid entry. Your hours must be less than 40 hrs OR greater than or equal to 0 hrs. Try again : ");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();
        double grossPay = hoursWorked*rate;
        System.out.println("Gross pay : " + grossPay);
    }
}
