package Patterns;

public class PalindromicNumberPattern {
  public static void main(String[] args) {
    int n = 4;
    // spaces
    for (int row = 1; row <= n; row++) {
      for (int col = 1; col <= n - row; col++) {
        System.out.print("  ");
      }
      // increasing number
      for (int col = 1; col <= row; col++) {
        System.out.print(col + " ");
      }

      // decreasing number

      for (int col = row - 1; col >= 1; col--) {
        System.out.print(col + " ");
      }
      System.out.println();
    }
  }
}
