package Arrays;
// Problem: Maximum Subarray

// Link: https://leetcode.com/problems/maximum-subarray/ 
// Approach: Optimal (Kadane's Algorithm)

public class MaximumSubarray {
  public static int maxsubArray(int[] nums) {
    int currentSum = 0;
    int maxSum = nums[0];
    for (int num : nums) {
      currentSum = currentSum + num;
      if (currentSum > maxSum) {
        maxSum = currentSum;
      }
      if (currentSum < 0) {
        currentSum = 0;
      }
    }
    return maxSum;
  }

  public static void main(String[] args) {
    int[] nums = { -2, -1, 4, 5, 3, -9, 8, -4 };
    int result = maxsubArray(nums);
    System.out.println(result);
  }
}
