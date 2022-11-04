package bg.tu_varna.sit.task4;

public class Defender extends Character {
    private String defensiveskill;
    private int armor;
    private int healingSkill;

    public Defender(int armor, String defensiveskill, int healingSkill) {
        super.setLife(250);
        this.armor = armor;
        this.defensiveskill = defensiveskill;
        this.healingSkill = healingSkill;
    }

    public String getDefensiveskill() {
        return defensiveskill;
    }

    public void setDefensiveskill(String defensiveskill) {
        this.defensiveskill = defensiveskill;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getHealingSkill() {
        return healingSkill;
    }

    public void setHealingSkill(int healingSkill) {
        this.healingSkill = healingSkill;
    }

    @Override
    public void defense(int striking) {
        this.setArmor(getArmor() - striking);
        if (getArmor() < 0) {
            this.setLife(getLife() - (0 - getArmor()));
            this.setArmor(0);
            if(getLife()<250){
                this.setLife(getLife() +(int)(healingSkill*0.01/100));
            }
        }if(getLife()>250){
            this.setLife(250);
        }
    }

    @Override
    public int striking() {
        return 10;
    }

}
