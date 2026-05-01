package Patterns;

public class Rhombus {
  public static void main(String[] args) {
    int n = 5;
    // total no: of rows = 5
    // 1st row -> 4 spaces + 1 (*)
    // 2nd row -> 3 spaces + 2 (*)
    // 3rd row -> 2 spaces + 3 (*)
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    for (int i = 1; i <= n; i++) {
      // spaces -> n - row
      for (int j = 1; j < n - i; j++) {
        System.out.print("  ");
      }
      // stars -> row
      for (int j = 1; j <= n; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

  }
}
