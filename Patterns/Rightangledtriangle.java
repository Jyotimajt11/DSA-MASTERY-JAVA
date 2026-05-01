package Patterns;

public class Rightangledtriangle {
  public static void main(String[] args) {
    int n = 5;
    // total no: of rows = 5
    // 1st row -> 1 (*)
    // 2nd row -> 2 (*)
    // 3rd row -> 3 (*)
    // Column -> 1 to value of row
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
