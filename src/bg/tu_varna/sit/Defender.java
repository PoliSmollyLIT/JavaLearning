package bg.tu_varna.sit;

public class Defender extends Character {
    private String defendingAbility;
    private boolean armour;
    private String healingAbility;

    public Defender() {

    }

    public Defender(String name, String defendingAbility, String healingAbility) {
        super(name, 250);
        this.defendingAbility = defendingAbility;
        this.armour = true;
        this.healingAbility = healingAbility;
    }

    public String getDefendingAbility() {
        return defendingAbility;
    }

    public void setDefendingAbility(String defendingAbility) {
        this.defendingAbility = defendingAbility;
    }

    public boolean isArmour() {
        return armour;
    }

    public String getHealingAbility() {
        return healingAbility;
    }

    public void setHealingAbility(String healingAbility) {
        this.healingAbility = healingAbility;
    }

}
