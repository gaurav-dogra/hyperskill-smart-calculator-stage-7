import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Expression {

    private final String[] expressions;

    public Expression(String jointExpression, String delimeter) {
        this.expressions = jointExpression.split(delimeter);
        System.out.println(Arrays.toString(this.expressions));
    }

    public String evaluate() {
        return null;
    }

//    private String convertToPostfix() {
//        String expression = inputExpression.replaceAll("\\s+", "");
//        String[] array = inputExpression.split("(?<=[+\\-*/()^])|(?=[+\\-*/()^])" );
//
//        StringBuilder postfix = new StringBuilder();
//        Deque<String> deque = new ArrayDeque<>();
//
//        for (String expressionToken : array) {
//            if (expressionToken.matches("[A-Za-z0-9]+")) { // variable or number
//                postfix.append(expressionToken);
//            } else if (expressionToken.equals("(") || expressionToken.equals("^")) { // highest priority added to stack
//                deque.add(expressionToken);
//            } else if (expressionToken.equals(")")) { // pop all till you reach "("
//                while (!deque.isEmpty()) {
//                    String stackTop = deque.removeLast();
//                    if (stackTop.equals("(")) {
//                        break;
//                    } else {
//                        postfix.append(stackTop);
//                    }
//                }
//            } else { // for +, -, *, /
//                while (!deque.isEmpty()) {
//                    String stackTop = deque.peekLast();
//                    if (getPriority(expressionToken) == getPriority(stackTop)) {
//                        postfix.append(deque.removeLast()); // stackTop goes to postfix
//                    } else if (getPriority(stackTop) < getPriority(expressionToken)) {
//                        break;
//                    } else {
//                        postfix.append(deque.removeLast());
//                    }
//                }
//                deque.add(expressionToken);
//            }
//
//        }
//        while (!deque.isEmpty()) { // emptying the stack
//            String dequeElement = deque.removeLast();
//            if (!dequeElement.equals("(")) {
//                postfix.append(dequeElement);
//            }
//        }
//        return postfix.toString();
//    }

    private static int getPriority(String s) {

        switch (s) {
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
            case "^":
                return 3;
            default:
                return 0;
        }
    }

    public boolean isInvalid() {

    }
}
