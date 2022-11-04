package bg.tu_varna.sit.task5;

public class CompanyST extends Company {
    private String owner;
    private boolean isPatentActivity;

    public CompanyST(String owner, boolean isPatentActivity) {
        this.owner = owner;
        this.isPatentActivity = isPatentActivity;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public boolean isPatentActivity() {
        return isPatentActivity;
    }

    public void setPatentActivity(boolean isPatentActivity) {
        this.isPatentActivity = isPatentActivity;
    }

    @Override
    public double tax() {
        if (isPatentActivity()) {
            return 500;
        } else {
            int operativeProfit = getIncome() - getCosts();
            if (operativeProfit < 0) {
                return 0;
            } else {
                return 0.15 * operativeProfit;
            }
        }
    }
}