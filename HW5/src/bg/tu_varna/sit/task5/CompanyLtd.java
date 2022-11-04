package bg.tu_varna.sit.task5;

public class CompanyLtd extends Company {
    private int capital;
    private int profit;

    public CompanyLtd(int capital, int profit) {
        this.capital = capital;
        this.profit = profit;
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    @Override
    public double tax() {
        int operativeProfit = getIncome() - getCosts();
        if (operativeProfit < 0) {
            return 0;
        }
        if (getProfit() < 0) {
            operativeProfit -= getProfit();
            if (operativeProfit < 0) {
                return 0;
            }
        }
        return 0.1*operativeProfit;
    }

}
