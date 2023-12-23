import java.util.Scanner;

public class Main {
    static final String ENTER_INT_MESSAGE = "Enter an integer";
    static final String ENTER_DOUBLE_MESSAGE = "Enter a double";

        static double checkDouble(final Scanner input) {

            while (!input.hasNextDouble()) {
                System.out.println(ENTER_DOUBLE_MESSAGE);
                input.nextLine();//throw away input
            }
            double inputValue = input.nextDouble();
            input.nextLine();
            return inputValue;
        }

        /*
        checkInt takes in the scanner and then checks to see whether the inputted
        value is an integer
         */
        static int checkInt(final Scanner input) {
            while (!input.hasNextInt()) {
                System.out.println(ENTER_INT_MESSAGE);
                input.nextLine();//throw away input
            }
            int inputValue = input.nextInt();
            input.nextLine();
            return inputValue;
        }

        /*
        stringChecker checks whether an inputted string is correct
        It takes in the scanner the list of values the input is supposed to be contained in
        and the message the user should receive before typing it in
         */
        static String stringChecker(final Scanner input, final String[] allowedInputs,
                                    final String message) {
            String value;
            boolean allowedInput = false;
            do {
                System.out.println(message);
                value = input.nextLine();
                for (String elem : allowedInputs) {
                    if (value.equalsIgnoreCase(elem)) {
                        allowedInput = true;
                    }
                }
            } while (!allowedInput);
            return value;
        }


    public static void main(String[] args) {
        final Scanner userInput = new Scanner(System.in);

        Room test = new Room("test",12,5,5,wallTypes.CAVITY,windowTypes.DOUBLE_GLAZED,12,1);
        test.addWall(5,4,wallTypes.CAVITY);
        test.addWall(3,1,wallTypes.CAVITY);
        test.addWindow(1,5,windowTypes.DOUBLE_GLAZED);
        System.out.println(test.toString());

    }
}