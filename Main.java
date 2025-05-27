package utcn;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Hub hub1 = new Hub("North");
        Hub hub2 = new Hub("South");

        Logistics logistics = new Logistics();

        LocalParcel p1 = new LocalParcel("1", 30, 1000);
        LocalParcel p2 = new LocalParcel("2", 30, 1800);
        InternationalParcel p3 = new InternationalParcel("3", 10, 300, 1200);

        logistics.addParcel(hub1, p1);
        logistics.addParcel(hub1, p2);
        logistics.addParcel(hub1, p3);

        double totalCost = logistics.totalCost(hub1);
        System.out.println("Total cost: " + totalCost);

        List<Parcel> rez = logistics.filterAndSort(hub1, 10000);
        rez.forEach(p -> System.out.printf("%s - %.2f\n", p.getId(), p.calcCost()));

        Logistics.swap(rez, 0, 1);
        rez.forEach(p -> System.out.printf("->%s - %.2f<- ||", p.getId(), p.calcCost()));

        List<Parcel> list1 = Arrays.asList(p1, p3);
        List<Parcel> list2 = Arrays.asList(p2, p3);

        Thread t1 = new Thread(new ParcelDispatch(list1));
        Thread t2 = new Thread(new ParcelDispatch(list2));
        System.out.println("\nStarting threads processors ....");
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Threads over..");
    }
}
