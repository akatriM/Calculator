import java.util.Scanner;

public class RunnerCalculator {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            for (int i = 0; i == 0; ) {
                System.out.println("Please input your numbers for calculation: (use spaces between numbers)");
                String userInput = in.nextLine();
                Validator call = new Validator(userInput);
                boolean check = call.isValid();
                if (!check) {
                    break;
                }
                Calculator calculator = new Calculator(userInput);
                System.out.println("Result:");
                calculator.converter();
                System.out.println(calculator.operation());
            }
        } catch (Exception e) {
            System.err.println("Incorrect data");
        }
    }
}
