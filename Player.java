package CS3650_Project;

public class Player extends GameObject {

    private int currentEXP;
    private int stamina;

    public Player(int exp, int stamina, String name, int level, int maxHealthPoints, int currentHealthPoints, int attackDamageStat, int defenseStat, ID id) {
        super(name, level, maxHealthPoints, currentHealthPoints, attackDamageStat, defenseStat, id);
        this.currentEXP = exp;
        this.stamina = stamina;
    }

    public void levelUp() {

    }

    public void staminaUp() {

    }

}
