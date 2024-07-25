/*
    Given a string of space separated numbers, have to return the highest and lowest number.
 */
/*
    -All numbers are valid Int32, no need to validate them.
    -There will always be at least one number in the input string.
    -Output string must be two numbers separated by a single space, and highest number is first.
 */

public class HighestAndLowest {
    public static String highAndLow(String stringNumbers) {
        String[] array = stringNumbers.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i=0; i< array.length; i++){
            int value = Integer.parseInt(array[i]);
            if (value < min) min = value;
            if (value > max) max = value;
        }
        
        return String.format("%d %d", max, min);
    }
}
