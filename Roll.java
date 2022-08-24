
/**
 * Write a description of class Roll here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Roll
{
    private int strength;
    private int dexterity;
    private int endurance;
    private String rollType;
    public Roll(String r)
    {
        rollType = r;
    }
    
    public boolean useSword()
    {
        return rollType.equals("Warrior");
    }
    
    public boolean useBow()
    {
        return rollType.equals("Archer");
    }
    
    public String getRoll()
    {
        return rollType;
    }
    
    public int getStrength()
    {
        return strength;
    }
    
    public int getDexterity()
    {
        return dexterity;
    }
    
    public int getEndurance()
    {
        return endurance;
    }
}
