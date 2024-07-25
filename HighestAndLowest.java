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
        String[] numbers = stringNumbers.split(" ");
        int max = 0;
        int min = 0;

        for(int i = 0; i < numbers.length; i++){
            if(i == 0) {
                max = Integer.parseInt(numbers[i], 10);
                min = Integer.parseInt(numbers[i], 10);
                continue;
            }
            if(max < Integer.parseInt(numbers[i], 10)){
                max = Integer.parseInt(numbers[i], 10);
            }
            if(min > Integer.parseInt(numbers[i], 10)) {
                min = Integer.parseInt(numbers[i], 10);
            }
        }

        String result = max + " " + min;
        return result;
    }
}
