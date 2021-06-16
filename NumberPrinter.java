
/**
 * This class prints out numbers from 1 to 100 and replaces multiples of 
 * 3, 5, and 15 with different words.
 *
 * @Anthony Jereza
 * @June 16, 2021
 */
public class NumberPrinter
{
    public static void main(String[] args)
    {
        // Iterating loop from 1 to 100
        for(int i = 1; i < 101; i++)
        {
            // Replace multiples of 15 with "FizzBuzz"
            if(i % 15 == 0)
            {
                System.out.println("FizzBuzz");
            }
            
            // Replace multiples of 5 with "Buzz"
            else if(i % 5 == 0)
            {
                System.out.println("Buzz");
            }
            
            // Replace multiples of 3 with "Fizz"
            else if(i % 3 == 0)
            {
                System.out.println("Fizz");
            }
            
            else
            {
                System.out.printf("%d\n", i);
            }
        }
    

    
    
    
    }
}
