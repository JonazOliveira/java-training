/*
    Welcome!
    This algorithm squares each digit of a number and concatenates them.
*/
/*
    Example:
        if we run 9119 through the function,
        811181 will come out,
        because 92 is 81 and 12 is 1.
        (81-1-1-81)
 */

public class SquareEveryDigit {
    public int squareDigits(int number) {
        String strDigits = String.valueOf(number);
        String result = "";

        for (char c : strDigits.toCharArray()) {
            int digit = Character.digit(c, 10);
            result += digit * digit;
        }

        return Integer.parseInt(result);
    }

}
