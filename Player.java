
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player
{
    private String name;
    private Roll roll;
    private String race;
    private Dice d1 = new Dice(20);
    private Dice d2 = new Dice(20);
    private int attackRoll;
    private int hitPoints;
    public Player(String n, Roll r, String race)
    {
        name = n;
        roll = r;
        this.race = race;
        hitPoints = roll.getEndurance() * 10;
    }
    
    public int attack()
    {
        attackRoll = d1.rollDice();
        return attackRoll;
    }
    
    public boolean criticalHit()
    {
        return attack() >= 19;
    }
    
    public int attackModifier()
    {
        if(roll.getRoll().equals("Warrior"))
        {
            return attack() * roll.getStrength();
        }
        if(roll.getRoll().equals("Archer"))
        {
            return attack() * roll.getDexterity();
        }
        else
        {
            return -1;
        }
    }
    
}
