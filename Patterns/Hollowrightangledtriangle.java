package Patterns;

public class Hollowrightangledtriangle {
  public static void main(String[] args) {
    int n = 10;
    // total no: of rows = 10
    // 1st row -> 1 (*)
    // 2nd row -> 2 stars(**)
    // last row (10th) -> 10 stars (**********)
    // middle rows -> 1 star at the beginning and 1 star at the end
    // Column -> 1 to value of row
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    for (int row = 1; row <= n; row++) {
      if (row == 1 || row == 2 || row == n) {
        for (int col = 1; col <= row; col++) {
          System.out.print("* ");
        }
      } else {
        System.out.print("* ");
        for (int col = 1; col <= row - 2; col++) {
          System.out.print("  ");
        }
        System.out.print("* ");
      }
      System.out.println();
    }

  }
}
