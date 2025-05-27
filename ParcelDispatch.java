package utcn;

import java.util.ArrayList;
import java.util.List;

public class ParcelDispatch implements Runnable {

    private List<Parcel> parcels;

    public ParcelDispatch() {
        parcels = new ArrayList<Parcel>();
    }

    public ParcelDispatch(List<Parcel> parcels) {
        this.parcels = parcels;
    }

    public void run(){
        for(Parcel parcel : parcels){
            double cost = parcel.calcCost();
            System.out.printf("%s dispatched parcel : %s (cost=%.2f)%n",
                    Thread.currentThread().getName(),
                    parcel.getId(), cost);
        }
        try{
            Thread.sleep(50);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }


}
