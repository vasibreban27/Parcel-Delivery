package utcn;

import java.util.*;
import java.util.stream.Collectors;

public class Logistics {
    private Map<Hub, List<Parcel>> map ;

    public Logistics() {
        map  = new HashMap<Hub, List<Parcel>>();
    }

    public void addParcel(Hub hub, Parcel parcel) {
        map.computeIfAbsent(hub, k -> new ArrayList<>())
                .add(parcel);
    }

    public double totalCost(Hub hub){
        return map.getOrDefault(hub, Collections.emptyList())
                .stream()
                .mapToDouble(Parcel::calcCost)
                .sum();
    }

    public void addParcels(Hub hub, List<? extends Parcel> parcels) {
        map.computeIfAbsent(hub, k -> new ArrayList<>())
                .addAll(parcels);
    }

    public List<Parcel> filterAndSort(Hub hub,double minCost){
        return map.getOrDefault(hub, Collections.emptyList())
                .stream()
                .filter(p -> p.calcCost() >= minCost)
                .sorted(Comparator.comparing(Parcel::calcCost).reversed())
                .collect(Collectors.toList());
    }

     public static <T> void swap(List<T> list, int i, int j){
        int size = list.size();

        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
     }
}
