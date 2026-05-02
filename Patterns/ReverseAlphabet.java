package Patterns;

public class ReverseAlphabet {
  public static void main(String[] args) {
    int n = 5;
    for (int row = 1; row <= n; row++) {
      char ch = 'E';
      for (int col = 1; col <= row; col++) {
        System.out.print(ch + " ");
        ch--;
      }
      System.out.println();
    }
  }
}
