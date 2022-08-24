
/**
 * Parent class for all weapons
 * 
 * Steven Klug 
 * 
 */
public class Weapons
{
   private String type;
   private int minDmg, maxDmg;
   
   public Weapons(String type, int minDmg, int maxDmg)
   {
       this.type = type;
       this.minDmg = minDmg;
       this.maxDmg = maxDmg;
   }
   
   public int getMinDmg()
   {
       return minDmg;
   }
   
   public int getMaxDmg()
   {
       return maxDmg;
   }
   
   public int basicHit()
   {
       int range = maxDmg - minDmg;
       int hit = (int)(Math.random() * range) + minDmg;
       return hit;
   }
   
   public String getType()
   {
       return type;
   }
   
   public String toString()
   {
       return type + "  with minimum damage: " + minDmg + " and maximum damage " + maxDmg; 
   }
}
