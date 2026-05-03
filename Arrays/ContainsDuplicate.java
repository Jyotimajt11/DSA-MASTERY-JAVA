package Arrays;

import java.util.HashSet;

// Problem: Contains Duplicate
// Link: https://leetcode.com/problems/contains-duplicate/
// Approach: HashSet
public class ContainsDuplicate {
  public static boolean containsDuplicate(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    for (int num : nums) {
      if (set.contains(num)) {
        return true;
      }
      set.add(num);
    }
    return false;
  }

  public static void main(String[] args) {
    int[] num = { 1, 2, 3, 4, 5, 6, 1 };
    boolean result = containsDuplicate(num);
    System.out.println(result);
  }
}
