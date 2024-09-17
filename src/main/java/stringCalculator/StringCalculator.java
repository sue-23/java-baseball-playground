package stringCalculator;

import java.util.Scanner;


public class StringCalculator {

    public String[] inputExpression() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputs = input.split(" ");
        return inputs;
    }

}
