public class MonsterCard extends Card {
    private String name;
    private int attack;
    private int defence;
    private int MagicPoint;
    private int Speed;
    private Boolean haveAttacked;

    public MonsterCard(String nm, int MP, int AP, int DP, int SP){
        setName(nm);
        MagicPoint = MP;
        attack = AP;
        defence = DP;
        Speed = SP;
        haveAttacked = false;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getMagicPoint() {
        return MagicPoint;
    }

    public void setMagicPoint(int MP) {
        this.MagicPoint = MP;
    }

    public int getSpeed(){
        return Speed;
    }

    public void setSpeed(int SP){
        this.Speed = SP;
    }

    public Boolean getHaveAttacked(){
        return haveAttacked;
    }

    public void setHaveAttacked(Boolean haveAttacked) {
        this.haveAttacked = haveAttacked;
    }
}
