package Patterns;

public class Hollowpyramid {
  public Hollowpyramid() {
  }

  public static void main(String[] var0) {
    byte var1 = 5;

    for (int var2 = 1; var2 <= var1; ++var2) {
      for (int var3 = 1; var3 <= var1 - var2; ++var3) {
        System.out.print("  ");
      }

      if (var2 != 1 && var2 != var1) {
        System.out.print("* ");

        for (int var5 = 1; var5 <= 2 * var2 - 3; ++var5) {
          System.out.print("  ");
        }

        System.out.print("* ");
      } else {
        for (int var4 = 1; var4 <= 2 * var2 - 1; ++var4) {
          System.out.print("* ");
        }
      }

      System.out.println();
    }

  }
}
