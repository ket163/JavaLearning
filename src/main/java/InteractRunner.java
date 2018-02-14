import java.util.Scanner;

/**
 * Created by qa on 14.02.18.
 */
public class InteractRunner {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            Calculator calculator = new Calculator();
            String exit = "no";

        while (!exit.equals("yes")) {

            System.out.println("Enter first number : ");
            String first = scanner.next();
            System.out.println("Enter second number : ");
            String second = scanner.next();
            System.out.println("Enter second number : ");
            String third = scanner.next();
            calculator.sum(Integer.valueOf(first),Integer.valueOf(second),Integer.valueOf(third));

            System.out.println("The result is : " + calculator.getResult());
            calculator.cleanResult();
            System.out.println("Exit?  yes/no ");
            exit = scanner.next();

        }

        }


    }
}
