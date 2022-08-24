
/**
 * One handed swords
 * 
 * Steven Klug 
 * 
 */
public class OneHandSword extends Weapons
{
   private int minDmg, maxDmg;
   private String type, name;
   
   public OneHandSword(String name, int minDmg, int maxDmg)
   {
       super("One Hand Sword", minDmg, maxDmg);
       this.type = "One Hand Sword";
       this.name = name;
       this.minDmg = minDmg;
       this.maxDmg = maxDmg;
   }
   
   //hits all enemies in front of player
   public int cleave()
   {
       int m = (maxDmg + minDmg)/2;
       int h = (int)(Math.random() * m) +  m + 5;
       return h;
   }
   
   public int slash()
   {
      int m = (maxDmg + minDmg)/2;
       int h = (int)(Math.random() * m) +  2 * m;
      return h;
   }
   
   //inflicts bleed damage (worth 1/5 of the maxDmg) for 3 turns
   public int thrust()
   {
       int m = (maxDmg + minDmg)/2;
       int h = (int) (Math.random() * m) + m;
       return h;
   }
   
   public String toString()
   {
       return type + "\n" + name + "\n" + minDmg + "-" + maxDmg + "\n";
   }
}
