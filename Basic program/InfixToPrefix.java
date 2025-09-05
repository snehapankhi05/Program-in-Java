package project;



import java.util.*;

public class InfixToPrefix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an infix expression:");
        String infix = scanner.nextLine();
        scanner.close();

        String prefix = convertInfixToPrefix(infix);
        System.out.println("Prefix expression: " + prefix);
    }

    public static String convertInfixToPrefix(String infix) {
        String[] operators = { "+", "-", "*", "/", "^" };
        String[] tokens = infix.split("\\s+");

        // Reverse the tokens
        String[] reversedTokens = new String[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            reversedTokens[i] = tokens[tokens.length - 1 - i];
        }

        // Convert to prefix
        StringBuilder prefix = new StringBuilder();
        for (String token : reversedTokens) {
            if (isOperator(token, operators)) {
                prefix.insert(0, token + " ");
            } else {
                prefix.append(token + " ");
            }
        }

        return prefix.toString().trim();
    }

    public static boolean isOperator(String token, String[] operators) {
        for (String operator : operators) {
            if (token.equals(operator)) {
                return true;
            }
        }
        return false;
    }
}

