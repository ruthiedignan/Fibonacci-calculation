
/**
 * This program recursively calculates the nth Fibonacci number.
 *
 * @author Ruthie Dignan
 * @version 4/04/21
 */
import java.util.Scanner;
public class Fibonacci
{
    static int calc(int n)
    {
        if(n <= 1)
            return n;
        return calc(n-1) + calc(n-2);
    }
    
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter a number (0-46): ");
        int value = sc.nextInt();
        
        if (value>50 || value<0)
        {
          System.out.println("That value is out of range.");
        } else
        {
          System.out.println("The Fibonacci number for " + value + " is: " + calc(value));
        }
    }
}
