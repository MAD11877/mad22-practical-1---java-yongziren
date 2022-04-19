import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    /*System.out.print("Input a integer for triangle base: ");*/
    int base = in.nextInt();
    for (int i = 1; i <= base; i++) {
      for (int q = 1; q <= (base-i+1); q++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
