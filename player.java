package CS3650_Project;

public class Player {

    private String name;
    private int ID;
    private int level;
    private double exp;
    private int currentHealthPoints;
    private int maxHealthPoints;
    private int attackDamage;
    private int defense;
    private int stamina;

    public Player() {
        name = "Player 1";
        ID = 000;
        level = 1;
        currentHealthPoints = 100;
        attackDamage = 10;
        defense = 5;
    }

    //setters
    public void levelUp() {
        level++;
    }

    public void expUp(double expData) {
        exp = exp + expData;
    }

    public void maxHPUp() {

    }

    public void attackDamageUp() {

    }

    public void defenseUp() {

    }

    public void staminaUp() {

    }

    //getters
    public int getCurrentHP() {
        return currentHealthPoints;
    }

    public int getMaxHP() {
        return maxHealthPoints;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public int getDefense() {
        return defense;
    }

    public int getStamina() {
        return stamina;
    }

}
