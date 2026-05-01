package Patterns;

public class Invertedpyramid {
  public static void main(String[] args) {
    int n = 4;
    // no: of rows-> 4
    // time complexity -> O(n^2)
    // space complexity -> O(1)
    for (int row = 1; row <= n; row++) {
      // spaces -> row-1
      for (int col = 1; col <= row - 1; col++) {
        System.out.print(" ");
      }
      // stars -> 2n-2row+1
      for (int col = 1; col <= 2 * n - 2 * row + 1; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
