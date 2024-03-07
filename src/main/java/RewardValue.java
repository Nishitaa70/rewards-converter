public class RewardValue {
    private double cashValue;
    private double miles;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.miles = cashValue / 0.0035;
    }

    public RewardValue(int miles){
        this.miles = miles;
        this.cashValue = miles * 0.0035;
    }

    public double getCashValue(){
        return cashValue;
    }
    public double getMilesValue() {
        return miles;
    }
}
