package oopgame;

public class player {
    private String name;
    private int ID;
    private int level;
    private double exp;
    private int currentHealthPoints;
    private int maxHealthPoints;
    private int attackDamage;
    private int defense;
    private int stamina;
    
    
    public player() {
        name = "Player 1";
        ID = 000;
        level = 1;
        healthPoints = 100;
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
        return healthPoints;
    }
    public int getMaxHP() {
        
    }
    public int getAttackDamage() {
        return attackDamage;
    }
    public int getDefense() {
        
    }
    public int getStamina() {
        
    }
    
}
