package CS3650_Project;

public class Player extends GameObject {

    private int currentEXP;
    private int stamina;

    //This constructor is called when using only a name to crate a Player
    public Player(String name){
        super(name);
        this.currentEXP = 0;
        this.stamina = 100;
        setIdPlayer();
    }
    
    public Player(int exp, int stamina, String name, int level, int maxHealthPoints, int currentHealthPoints, int attackDamageStat, int defenseStat, ID id) {
        super(name, level, maxHealthPoints, currentHealthPoints, attackDamageStat, defenseStat, id);
        this.currentEXP = exp;
        this.stamina = stamina;
    }

    public static void displayInfo(Player obj){
        System.out.println(obj.getName());
        System.out.println("Level: " + obj.getLevel());
        System.out.println("Health: " + obj.getCurrentHealthPoints() + "/" + obj.getMaxHealthPoints());
        System.out.println("Attack: " + obj.getAttackDamageStat());
        System.out.println("Defense: " + obj.getDefenseStat());
    }
    
    public void levelUp() {

    }

    public void staminaUp() {

    }

}
