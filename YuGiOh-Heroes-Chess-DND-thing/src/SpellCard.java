abstract public class SpellCard extends Card {
    private String name;
    private int MPCost;

    public SpellCard(String nm, int MPC){
        name = nm;
        MPCost = MPC;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMPCost() {
        return MPCost;
    }

    public void setMPCost(int MPCost) {
        this.MPCost = MPCost;
    }

    public void activateSpell(){
}

}
