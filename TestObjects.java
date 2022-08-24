
/**
 * Write a description of class TestGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class TestObjects
{
    
   
   public static void main(String[]args)
   {
       OneHandSword s1 = new OneHandSword("Katana", 7, 11);
       OneHandSword s2 = new OneHandSword("Saber", 3, 12);
       OneHandSword s3 = new OneHandSword("LightSaber", 9, 16);
       Bow b1 = new Bow("Long Bow", (int)(Math.random() * 3)+1, (int)(Math.random() * 4) + 4);
       Bow b2 = new Bow("Compound Bow", 15, 20);
       ArrayList<Weapons> w = new ArrayList<Weapons>();
       w.add(s1);
       w.add(s2);
       w.add(s3);
       w.add(b1);
       w.add(b2);
       /*for(int k = 0; k < w.size(); k++)
       {
           System.out.println(w.get(k));
           System.out.println();
       }*/
       System.out.println(w);
   }
}
