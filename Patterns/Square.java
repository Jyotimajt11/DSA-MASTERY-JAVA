package Patterns;

public class Square {
  public static void main(String[] args) {
    int n = 4;
    // for each rown -> 4 columns
    // n = 4 -> 4 rows
    // printing (*)
    // Pattern: Square
    // Logic: Print n x n stars
    // Time Complexity: O(n^2)

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}