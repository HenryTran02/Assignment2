import java.util.Scanner;
public class HelloWorldVariation {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("First number: ");
        double num1 = scnr.nextDouble();

        System.out.print("Second number: ");
        double num2 = scnr.nextDouble();

        System.out.print("Enter an operator(+,-,*,/): ");
        String op = scnr.next();

        double result = 0;

        if (op.equals("+")) {
            result = num1 + num2;
            System.out.println("Result: " + result);
        } else if (op.equals("-")) {
            result = num1 - num2;
            System.out.println("Result: " + result);
        } else if (op.equals("*")) {
            result = num1 * num2;
            System.out.println("Result: " + result);
        } else if (op.equals("/")) {
            if (num2 == 0) {
                System.out.println("Error: cannot divide by 0.");
            } else {
                result = num1 / num2;
                System.out.println("Result: " + result);
            }
        }
        else {
                System.out.println("Invalid operator!");
            }
        scnr.close();
        }
    }
