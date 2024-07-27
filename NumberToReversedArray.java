/*
    Given a random non-negative number,
    have to return the digits of this number within an array in reverse order.
 */
/*
    Example:
        35231 => [1,3,2,5,3]
        0 => [0]
 */

public class NumberToReversedArray {
    public static int[] digitize(long number) {
        char[] charArray = new StringBuilder().append(number).reverse().toString().toCharArray();
        int[] array = new int[charArray.length];

        for(byte i = 0; i < charArray.length; i++){
            array[i] = Integer.parseInt(String.valueOf(charArray[i]),10);
        }

        return array;
    }
}
