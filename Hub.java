package utcn;

public class Hub {
    private String name;

    public Hub(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Hub)) return false;
        Hub other = (Hub)obj;
        return name.equals(other.name);
    }

    public int hashCode(){
        return name.hashCode();
    }
}
