import java.util.InputMismatchException;

public class Methods {

    /**
     * Asks for an int between or equal to lower and upper bound values
     * @param num1 The lower bound
     * @param num2 The upper bound
     * @return A number between or equal to the upper bound and lower bound
     */
    private static int askForIntBetween(int num1, int num2) {
        int selection = -9999;
        boolean isInt = false;
        boolean isBetweenNum1AndNum2 = false;
        while (isInt == false || isBetweenNum1AndNum2 == false) {
            isInt = false;
            isBetweenNum1AndNum2 = false;
            try {
                System.out.print("Your selection (" + num1 + " - " + num2 + "): ");
                selection = keyboard.nextInt();
                if (selection >= num1 & selection <= num2)
                    isBetweenNum1AndNum2 = true;
                if (selection < num1 || selection > num2)
                    System.out.println("selection outside of acceptable range");
                isInt = true;
            } catch (InputMismatchException e) {
                keyboard.nextLine();
                System.out.println("Incorrect input: not an integer");
            }
        }
        return selection;
    }

    /**
     * Asks for a String that is within a certain length
     * @param informationRequestMessage The request message
     * @param lengthUpperBound The upper bound for length
     * @return A String within a length determined by the upper bound
     */
    private static String askForStringWithinLength(String informationRequestMessage, int lengthUpperBound) {
        keyboard.nextLine();
        boolean isWithinCorrectLength = false;
        String output = "";
        while (isWithinCorrectLength == false) {
            System.out.print(informationRequestMessage);
            output = keyboard.nextLine();
            if (output.length() <= lengthUpperBound)
                isWithinCorrectLength = true;
            if (output.length() > lengthUpperBound)
                System.out.println("input not of valid length " + "(" + lengthUpperBound + ")");
        }
        return output;
    }

}
