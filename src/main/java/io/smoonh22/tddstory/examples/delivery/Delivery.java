package io.smoonh22.tddstory.examples.delivery;

public class Delivery {
    private IVehicle vehicle;
    public Delivery() {
    }

    public Delivery(IVehicle vehicle) {
        this.vehicle = vehicle;
    }

    public boolean makeADelivery() {
        //TODO 배달을 위한 준비
        return vehicle.deliver();
    }
}
