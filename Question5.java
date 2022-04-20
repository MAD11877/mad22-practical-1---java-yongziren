import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */

    Scanner in = new Scanner(System.in);
    ArrayList<Integer> intlist = new ArrayList<Integer>();
    int repeat = in.nextInt();
    int highestrepeat = 0;
    int counter = 0;
    for (int i = 0; i < repeat; i++)
    {
      int integer = in.nextInt();
      intlist.add(integer);
    }
    for (int i = 0; i < intlist.size(); i++)
    {
      int tempcounter = 0;
      int tempnumber = intlist.get(i);
      for (int q = 0; q < intlist.size(); q++)
      {
        if (intlist.get(q) == tempnumber)
        {
          tempcounter++;
        }
      }
      if (tempcounter > counter)
      {
        counter = tempcounter;
        highestrepeat = intlist.get(i);
      }
    }
    System.out.println(highestrepeat);
  }
}
