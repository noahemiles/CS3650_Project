package CS3650_Project;

public class Player extends GameObject {

    private int currentEXP;
    private int stamina;
    private int toLevelUp;
    //This constructor is called when using only a name to crate a Player
    public Player(String name){
        super(name);
        this.currentEXP = 0;
        this.stamina = 100;
        toLevelUp = 10;
        setIdPlayer();
    }
    
    public Player(int exp, int stamina, String name, int level, int maxHealthPoints, int currentHealthPoints, int attackDamageStat, int defenseStat, ID id) {
        super(name, level, maxHealthPoints, currentHealthPoints, attackDamageStat, defenseStat, id);
        this.currentEXP = exp;
        this.stamina = stamina;
    }


    public void levelUp() 
    {
    	//update the amount needed to level up next
    	toLevelUp = getLevel()*10;
    	int currLevel = getLevel();
    	//move onto next level
    	this.setLevel(++currLevel);
    	
    	//increase player's stats for leveling up
    	//+5 for HP
    	setCurrentHealthPoints(getCurrentHealthPoints() + 5);
    	setMaxHealthPoints(getCurrentHealthPoints() +5);
    	
    	//+2 for Attack
    	setAttackDamageStat(getAttackDamageStat() + 2);
    	
    	//+1 for Defense
    	setDefenseStat(getDefenseStat() + 1);
    	
    	System.out.println("Congratualtions " + this.getName() + ", You just leveled up to " + this.getLevel() + "!!");
    }

    public void gainxp(int monsterLevel, int damageDealt) {
    	int tempEXP = currentEXP;
    	int gainedEXP = monsterLevel * damageDealt;
    	currentEXP += gainedEXP;
    	System.out.println("Gained " + gainedEXP + " EXP ");
    	System.out.println("Total EXP Now " + currentEXP + " EXP ");

    	//Keep looping through progressive level as long as have enough exp
    	while(gainedEXP >= toLevelUp)
    	{
    		gainedEXP -= toLevelUp;
    		levelUp();
    	}
    	
    	//Leftover exp counts towards next level
    	toLevelUp -= gainedEXP;
    	
    }

    
    
    public void staminaUp() {

    }

}
