//As we know n ^ n = 0 and n ^ 0 = n

class Solution {
public int missingNumber(int[] nums) {
    int result = 0;
    for (int i = 1; i <= nums.length; i++) {
        result ^= nums[i - 1];
        result ^= i;
    }
    return result;
  }
}
