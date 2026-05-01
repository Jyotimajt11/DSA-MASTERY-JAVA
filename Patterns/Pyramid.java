package Patterns;

public class Pyramid {
  public static void main(String[] args) {
    int n = 5;
    // total no: of rown -> 5
    // 1st row -> 4 spaces + 1 (*)
    // 2nd row -> 3 spaces + 2 (*)
    // 3rd row -> 2 spaces + 3 (*)
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    for (int row = 1; row <= n; row++) {
      // spaces -> n - row
      for (int col = 1; col <= n - row; col++) {
        System.out.print("  ");
      }
      // stars -> row
      for (int col = 1; col <= 2 * row - 1; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
