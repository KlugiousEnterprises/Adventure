
/**
 * Write a description of class Bow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bow extends Weapons
{
   private int minDmg, maxDmg, m;
   private String type, name;
   private int arrowCount = 20;
   public Bow(String name, int minDmg, int maxDmg)
   {
       super("Bow", minDmg, maxDmg);
       this.minDmg = minDmg;
       this.maxDmg = maxDmg;
       this.type = "Bow";
       this.name = name;
       this.m = (maxDmg + minDmg) / 2;
   }
   
   //causes 1/2 damage to all nearby enemies as well
   public int explosiveArrow()
   {
       int h = (int)(Math.random() * m) + 2*m;
       arrowCount--;
       return h;
   }
   
   //chance to freeze enemy causing them to lose a turn
   public int iceArrow()
   {
       int h = (int)(Math.random() * m) + m;
       arrowCount--;
       return h;
   }
   
   //causes poison damage to enemy for 3 turns
   public int poisonArrow()
   {
       int h = (int)(Math.random() * m) + m + 7;
       arrowCount--;
       return h;
   }
   
   public boolean haveArrows()
   {
       return arrowCount > 0;
   }
   
   public void refillArrows()
   {
       if(!haveArrows())
       {
           arrowCount += 20;
       }
       else
       {
           arrowCount++;
       }
   }
   
   
   
   public String toString()
   {
       return type + "\n" + name + "\n" + minDmg + "-" + maxDmg + "\n";
   }
}
