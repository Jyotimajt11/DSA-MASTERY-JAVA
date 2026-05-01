package Patterns;

public class Invertedrightangledtriangle {
  public static void main(String[] args) {
    int n = 5;
    // total no: of rows = 5
    // 1st row -> 5 (*)
    // 2nd row -> 4 (*)
    // 3rd row -> 3 (*)
    // Column -> row to n
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    for (int i = 1; i <= n; i++) {
      for (int j = n; j >= i; j--) { // another formula -> for (int j = 1; j <= n - row + 1; j++)
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
