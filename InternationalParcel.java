package utcn;

public class InternationalParcel extends Parcel{

    private double weightKg;
    private double baseFee;
    private double customRate;

    public InternationalParcel(String id, double baseFee, double customRate, double weightKg) {
        super(id);
        this.baseFee = baseFee;
        this.customRate = customRate;
        this.weightKg = weightKg;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    public double getBaseFee() {
        return baseFee;
    }

    public void setBaseFee(double baseFee) {
        this.baseFee = baseFee;
    }

    public double getCustomRate() {
        return customRate;
    }

    public void setCustomRate(double customRate) {
        this.customRate = customRate;
    }

    public double calcCost(){
        return baseFee + (customRate * weightKg * baseFee);
    }
}
