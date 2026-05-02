package Patterns;

public class PalindromicAlphabet {
  public static void main(String[] args) {
    int n = 4;
    for (int row = 1; row <= n; row++) {
      for (int col = 1; col <= n - row; col++) {
        System.out.print("  ");
      }
      for (int col = 1; col <= row; col++) {
        int a = col;
        int b = 'A' - 1;
        int ans = a + b;
        char finalans = (char) ans;
        System.out.print(finalans + " ");
      }
      char toPrint = (char) ('A' + row - 2);
      for (int col = 1; col <= row - 1; col++) {
        System.out.print(toPrint + " ");
        toPrint--;
      }
      System.out.println();
    }
  }
}
