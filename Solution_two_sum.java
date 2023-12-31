/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Input: nums = [2,7,11,15], target = 9
Output: [0,1]

Input: nums = [3,2,4], target = 6
Output: [1,2]

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
*/

class Solution_two_sum {
    public int[] twoSum(int[] nums, int target) {
        int[] found = new int[2];

        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if ((nums[i] + nums[j]) == target){
                    found[0] = i;
                    found[1] = j;
                }
            }
        }
        return found;
    }
}
