package CS3650_Project;

public class Monster extends GameObject {

    protected Type type; //monster typing (weakness & strengths)

    public Monster(String name){
        super(name);
        setIdMonster();
    }
    
    public Monster(Type type, String name, int level, int maxHealthPoints, int currentHealthPoints, int attackDamageStat, int defenseStat, ID id) {
        super(name, level, maxHealthPoints, currentHealthPoints, attackDamageStat, defenseStat, id);
        this.type = type;
    }
    

}
