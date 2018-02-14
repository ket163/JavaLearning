import java.util.Scanner;

/**
 * Created by qa on 14.02.18.
 */
public class InteractRunner {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            Calculator calculator = new Calculator();
            String exit = "no";
            System.out.println("Choose an a operation: + - / * " + "Or type exit to leave the programm");
            String operation = scanner.next();

            switch (operation) {

                case "+":
                    while (!exit.equals("yes")) {

                        System.out.println("Enter first number : ");
                        String first = scanner.next();
                        System.out.println("Enter second number : ");
                        String second = scanner.next();

                        calculator.plus(Integer.valueOf(first), Integer.valueOf(second));

                        System.out.println("The result is : " + calculator.getResultPlus());
                        calculator.cleanResult();
                        System.out.println("Exit?  yes/no ");
                        exit = scanner.next();

                    }
                case "-":
                    while (!exit.equals("yes")) {

                        System.out.println("Enter first number : ");
                        String first = scanner.next();
                        System.out.println("Enter second number : ");
                        String second = scanner.next();

                        calculator.minus(Integer.valueOf(first), Integer.valueOf(second));

                        System.out.println("The result is : " + calculator.getResultMinus());
                        calculator.cleanResult();
                        System.out.println("Exit?  yes/no ");
                        exit = scanner.next();


                    }
                case "*":
                    while (!exit.equals("yes")) {

                        System.out.println("Enter first number : ");
                        String first = scanner.next();
                        System.out.println("Enter second number : ");
                        String second = scanner.next();

                        calculator.multiply(Integer.valueOf(first), Integer.valueOf(second));

                        System.out.println("The result is : " + calculator.getResultMultiply());
                        calculator.cleanResult();
                        System.out.println("Exit?  yes/no ");
                        exit = scanner.next();


                    }
                case "/":
                    while (!exit.equals("yes")) {

                        System.out.println("Enter first number : ");
                        String first = scanner.next();
                        System.out.println("Enter second number : ");
                        String second = scanner.next();


                        calculator.divide(Integer.valueOf(first), Integer.valueOf(second));


                        calculator.cleanResult();
                        System.out.println("Exit?  yes/no ");
                        exit = scanner.next();
                    }

            }

        }

    }

}
