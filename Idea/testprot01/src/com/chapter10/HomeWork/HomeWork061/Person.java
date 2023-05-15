package com.chapter10.HomeWork.HomeWork061;

public class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void passRiver() {
//        if (vehicles == null)
        if (!(vehicles instanceof Boat))//1.不为空，2.不为船
        vehicles = VehiclesFactory.getBoat();
        vehicles.work();
    }
    public void common() {
        if (vehicles == null) {
            vehicles = VehiclesFactory.getHorse();
        }
        vehicles.work();
    }
    public void fire() {
        if (!(vehicles instanceof Plane))
            vehicles = VehiclesFactory.getPlane();
        vehicles.work();
    }
}
