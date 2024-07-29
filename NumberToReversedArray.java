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
        return new StringBuilder().append(number)
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }
}
