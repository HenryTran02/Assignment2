package Henry.decisionMakingStatement.classActivity3;
import java.util.Scanner;



public class SwitchStatementEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double firstNumber = input.nextDouble();

        System.out.print("Enter second number: ");
        double secondNumber = input.nextDouble();

        System.out.print("Choose number(Operation): \n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \n");
        String operation = input.next();

        double result = 0;

        switch (operation) {
            case "1":
                result = firstNumber + secondNumber;
                break;
            case "2":
                result = firstNumber - secondNumber;
                break;
            case "3":
                result = firstNumber * secondNumber;
                break;
            case "4": {
                if (secondNumber == 0) {
                    System.out.println("dawg you can't divide by zero");
                }
            }
                result = firstNumber / secondNumber;
                break;
            default:
                System.out.println("Invalid number");
                break;
        }
        System.out.println("Result: " + result);

        if (result >= 100) {
            System.out.print("You get a 10% discount!");
        } else {
            System.out.print("No discount available.");
        }


    }
}
