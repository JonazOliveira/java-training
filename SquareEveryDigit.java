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
        char[] numberCharArray = String.valueOf(number).toCharArray();
        StringBuilder newNumberString = new StringBuilder();

        for(int i = 0; i < numberCharArray.length; i++){
            int num = Integer.parseInt(String.valueOf(numberCharArray[i]));
            newNumberString.append(num*num);
        }

        int newNumber = Integer.parseInt(newNumberString.toString());
        return newNumber;
    }

}
