package oopgame;

public class monster {
    private String name;
    private int ID;
    private int level;
    private double exp;
    private int healthPoints;
    private int attackDamage;
    private int defense;
    
    public monster() {
        name = "Monster";
        ID = 001;
        level = 1;
        healthPoints = 50;
        attackDamage = 1;
        defense = 1;
    }
}
