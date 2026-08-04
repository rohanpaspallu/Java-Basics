package decision_structure;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("Enter your letter grade : ");
        Scanner scanner = new Scanner(System.in); 
        String grade = scanner.next().toUpperCase();
        scanner.close();

        String message =  switch (grade){
            case "A" -> "Excellent job";
            case "B" -> "Great job";
            case "C" -> "Good job";
            case "D" -> "Work a bit harder";
            case "F" -> "Uh oh!";
            default -> "Not a vaild grade";
        };
        System.out.println(message);
    }
}
