
/**
 * Write a description of class Dice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dice
{
   private int numSides;
   
   public Dice(int n)
   {
       numSides = n;
   }
   
   public int getNumberOfSides()
   {
       return numSides;
   }
   
   public int rollDice()
   {
       return (int)(Math.random() * numSides) + 1;
   }
   
   public int sumDice(Dice other)
   {
       return rollDice() + other.rollDice();
   }
}
