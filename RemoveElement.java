/*
    Change the array nums such that the first k elements of
        nums contain the elements which are not equal to val and return k.

    Constraints:
        0 <= nums.length <= 100
        0 <= nums[i] <= 50
        0 <= val <= 100
 */

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = nums.length;
        int[] result = nums;

        for(int i = 0, j = 0; i < nums.length; i++){
            if(result[i] == val){
                k--;
            } else {
                nums[j] = result[i];
                j++;
            }
        }
        return k;
    }
}