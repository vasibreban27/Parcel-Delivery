package utcn;

public class LocalParcel extends Parcel{
    private double distanceKm;
    private double ratePerKm;

    public LocalParcel(String id, double ratePerKm, double distanceKm) {
        super(id);
        this.ratePerKm = ratePerKm;
        this.distanceKm = distanceKm;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public void setDistanceKm(double distanceKm) {
        this.distanceKm = distanceKm;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    public double calcCost(){
        return distanceKm*ratePerKm;
    }
}
