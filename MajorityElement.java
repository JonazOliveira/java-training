/*
    Given an array nums of size n, return the majority element.

    The majority element is the element that appears more than ⌊n / 2⌋ times.
    You may assume that the majority element always exists in the array.

    Constraints:
        n == nums.length
        1 <= n <= 5 * 104
        -109 <= nums[i] <= 109
 */

import java.util.Arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int majority = -1;
        int count = 0;

        for(int num: nums) {
            if(count == 0) {
                majority = num;
            }
            if(num == majority) {
                count++;
            } else {
                count--;
            }
        }
        return majority;
    }
}