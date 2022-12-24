package transport;

import java.util.ArrayDeque;
import java.util.Deque;

public class ServiceStation {


    private Deque<Transport> queue = new ArrayDeque<>();


    private void add(Transport transport) {
        queue.offerLast(transport);
    }

    public void addCar(Car car) {
//        queue.offerLast(car);

        add(car);
    }

    public void addTruck(Truck truck) {
//        queue.offerLast(truck);

        add(truck);
    }



    public void serviceAuto() {
        Transport transport = queue.poll();
        if (transport != null) {
            System.out.println("Станция техобслуживания проводит осмотр " + transport.getBrand() + " " + transport.getModel());
            boolean result = transport.diagnostic();
            if (!result) {
                transport.repair();
                serviceAuto();
            } else {
                System.out.println(transport.getBrand() + " " + transport.getModel() + " в ремонте не нуждается");
                serviceAuto();
            }
        } else {
            System.out.println("В очереди больше никого нет");
        }
    }


}
