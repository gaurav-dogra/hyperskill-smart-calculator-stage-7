import java.util.*;

class Main {

    public static final String DELIMITER = ";";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder jointExpression = new StringBuilder();
        Expression expressionObject = new Expression(null);

        label:
        while (true) {
            String expression = scanner.nextLine();

            switch (expression) {
                case "/exit":
                    System.out.println("Bye!");
                    break label;
                case "/help":
                    System.out.println("this application supports variables, addition and subtraction");
                    break;
                default:
                    if (expression.matches("")) {
                        break;
                    } else if (expression.matches("/.*")) {
                        System.out.println("Unknown command");
                        break;
                    } else if (expression.matches(".*=.*")) {
                        // if the input expression is an assignment statement
                        // it is added to jointExpression
                        jointExpression.append(expression);
                        jointExpression.append(DELIMITER);
                    } else {
                        jointExpression.append(expression);
                        expressionObject = new Expression(jointExpression.toString(), DELIMITER);
                        if (expressionObject.isInvalid()) {
                            System.out.println("Invalid expression");
                            break;
                        }
                        jointExpression = new StringBuilder();
                    }
            }
        }
    }
}