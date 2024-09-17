package stringCalculator;

import java.util.Arrays;
import java.util.Scanner;


public class StringCalculator {

    public String[] inputExpression() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputs = input.split(" ");
        return inputs;
    }

    public Object[] separateNumbersAndOperators(String[] expression) {
        Integer[] numbers = new Integer[expression.length / 2 + 1];
        String[] operators = new String[expression.length / 2];
        int numIndex = 0;
        int opIndex = 0;
        for (int i = 0; i < expression.length; i++) {
            if (i % 2 == 0) {
                numbers[numIndex++] = Integer.parseInt(expression[i]);
            }else {
                operators[opIndex++] = expression[i];
            }
        }
        return new Object[] {numbers, operators};
    }

    public int calculate(Object[] separateResult) {
        Integer[] numbers = (Integer[]) separateResult[0];
        String[] operators = (String[]) separateResult[1];
        int result = numbers[0];

        for (int i = 0; i < operators.length; i++) {

            String operator = operators[i];
            int number = numbers[i+1];

            switch (operator) {
                case "+":
                    result += number;
                    break;
                case "-":
                    result -= number;
                    break;
                case "*":
                    result *= number;
                    break;
                case "/":
                    result /= number;
                    break;

                default:
            }
        }
        return result;

    }

}
