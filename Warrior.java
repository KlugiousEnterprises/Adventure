
/**
 * Write a description of class Warrior here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Warrior extends Roll
{
   private int strength;
   private int dexterity;
   private int endurance;
   
   public Warrior()
   {
       super("Warrior");
       strength = 20;
       dexterity = 15;
       endurance = 19;
   }
}
