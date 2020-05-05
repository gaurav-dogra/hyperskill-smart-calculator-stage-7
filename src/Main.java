package calculator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Expression expression = new Expression();
        boolean exit = false;
        while (!exit) {
            String input = scanner.nextLine();

            switch (input) {
                case "/exit":
                    System.out.println("Bye!");
                    exit = true;
                    break;
                case "/help":
                    System.out.println("this application supports variables, brackets, addition, subtraction, multiplication" +
                            "division and power");
                    break;
                default:
                    if (input.matches("")) {
                        break;
                    } else if (input.matches("/.*")) {
                        System.out.println("Unknown command");
                        break;
                    } else {
                        try {
                            int result = expression.compute(input);
                            System.out.println(result);
                        } catch(MyException e) {
                            System.out.println(e.getMessage());
                        } catch(AssignmentExpression ae) {
                            // do nothing
                        }
                    }
            }
        }
    }
}