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

    public void setId(ID id) {
        this.id = id;
    }

}
