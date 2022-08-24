
/**
 * Write a description of class Archer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Archer extends Roll
{
    private int strength;
    private int dexterity;
    private int endurance;
    
    public Archer()
    {
        super("Archer");
        strength = 15;
        dexterity = 18;
        endurance = 18;
    }
}
