package Patterns;

public class Hollowrect {
  public static void main(String[] args) {
    int n = 4;
    // no: of rows -> 4
    // Time Complexity = O(n)
    // Space Complexity = O(1)
    for (int row = 1; row <= n; row++) {
      // for each row -> 6 columns
      for (int col = 1; col <= 6; col++) {
        // for row 1 and last row print 6 stars
        if (row == 1 || row == n) {
          System.out.print("* ");
        } else {
          // for column 1
          if (col == 1 || col == 6) {
            System.out.print("* ");
          } else {
            // for middle columns print space
            System.out.print("  ");
          }
        }
      }
      System.out.println();
    }

  }
}