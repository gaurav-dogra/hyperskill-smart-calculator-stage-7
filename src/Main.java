import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Expression expression = new Expression();

        label:
        while (true) {
            String input = scanner.nextLine();

            switch (input) {
                case "/exit":
                    System.out.println("Bye!");
                    break label;
                case "/help":
                    System.out.println("this application supports variables, addition and subtraction");
                    break;
                default:
                    if (input.matches("")) {
                        break;
                    } else if (input.matches("/.*")) {
                        System.out.println("Unknown command");
                        break;
                    } else if (input.matches(".*=.*")) { // assignment into a variable
                        // input is added to the jointExpression
                        String result = expression.isValid(input);
                        if (result != null) { // nothing is printed if assignment statement is correct
                            // it could print "Invalid Assignment", "Unknown variable", "Invalid identifier"
                            System.out.println(result);
                            break;
                        }
                    } else {
                        String result = expression.compute(input);
                        System.out.println(result);
                    }
            }
        }
    }
}