package utcn;

public abstract class Parcel {
    private String id;

    public Parcel(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract double calcCost();
}
