public abstract class Character {
    String name;
    int health;
    int attack;
    
    Character(){
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", attack=" + attack +
                '}';
    }
    
    public String getName(){
        return name;
    }
    
    public int getHealth(){
        return health;
    }
    
    public int getAttack(){
        return attack;
    }
    
    public void setName(String x){
        name = x;
    }
    
    public void setHealth(int x){
        health = x;
    }
    
    public void setAttack(int x){
        attack = x;
    }
}
