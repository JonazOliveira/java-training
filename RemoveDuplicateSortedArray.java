/*
    Given an integer array nums sorted in non-decreasing order,
        remove the duplicates in-place such that each unique element appears only once.
    The relative order of the elements should be kept the same.

    Constraints:
        1 <= nums.length <= 3 * 104
        -100 <= nums[i] <= 100
        nums is sorted in non-decreasing order.
 */

public class RemoveDuplicateSortedArray {
    public int removeDuplicates(int[] nums) {
        int k = 0;

        for(int i = 1; i < nums.length; i++) {
            if(nums[k] != nums[i]) {
                nums[k+1] = nums[i];
                k++;
            }
        }
        return k+1;
    }
}
