package CS3650_Project;

//Every object in the games
public abstract class GameObject {

    private String name;
    private int level;
    private int maxHealthPoints;
    private int currentHealthPoints;
    private int attackDamageStat;
    private int defenseStat;

    protected ID id;
    
    public GameObject(String name) {
        this.name = name;
        this.level = 1;
        this.maxHealthPoints = 100;
        this.currentHealthPoints = 100;
        this.attackDamageStat = 10;
        this.defenseStat = 5;
    }
    
    public GameObject(String name, int level, int maxHealthPoints, int currentHealthPoints, int attackDamageStat, int defenseStat, ID id) {
        this.name = name;
        this.level = level;
        this.maxHealthPoints = maxHealthPoints;
        this.currentHealthPoints = currentHealthPoints;
        this.attackDamageStat = attackDamageStat;
        this.defenseStat = defenseStat;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public int getCurrentHealthPoints() {
        return currentHealthPoints;
    }

    public int getAttackDamageStat() {
        return attackDamageStat;
    }

    public int getDefenseStat() {
        return defenseStat;
    }

    public ID getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setMaxHealthPoints(int maxHealthPoints) {
        this.maxHealthPoints = maxHealthPoints;
    }

    public void setCurrentHealthPoints(int currentHealthPoints) {
        this.currentHealthPoints = currentHealthPoints;
    }

    public void setAttackDamageStat(int attackDamageStat) {
        this.attackDamageStat = attackDamageStat;
    }

    public void setDefenseStat(int defenseStat) {
        this.defenseStat = defenseStat;
    }
    
    //Not sure how enum objects work yet.
    //Come back to this later
    public void setId(ID id){
        this.id = id;
    }
    public void setIdPlayer() {
        this.id = ID.PLAYER;
    }
    public void setIdMonster() {
        this.id = ID.MONSTER;
    }
    
    public static void displayInfo(GameObject obj){
        System.out.println(obj.getName());
        System.out.println("Level: " + obj.getLevel());
        System.out.println("Health: " + obj.getCurrentHealthPoints() + "/" + obj.getMaxHealthPoints());
        System.out.println("Attack: " + obj.getAttackDamageStat());
        System.out.println("Defense: " + obj.getDefenseStat());
    }


}