package com.chapter10.HomeWork.HomeWork06;

public class HomeWork06 {
    public static void main(String[] args) {
        /*Person person = new Person("唐僧", new Vehicles() {
            @Override
            public void work() {
                Boat boat = VehiclesFctory.getBoat();
                boat.work();
            }
        });*/
        Person tang = new Person("唐僧", new Horse());

//    }
}

class Person{
    private String name;
//    private String Vehicles;
    private Vehicles Vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.Vehicles = vehicles;
    }
    public void passRiver() {
    //先得到船
        /*Boat boat = VehiclesFctory.getBoat();
        boat.work();*/
        /*if (Vehicles != null) {
            Vehicles = VehiclesFctory.getBoat();
        }*/
        if (！(Vehicles instanceof Boat)) {//它不为空并且不是船
            Vehicles = VehiclesFctory.getBoat();
        }
    }
    public void common() {
        //判断一下当前的vehicles属性是否已经存在
        /*if (Vehicles != null) {
//            Horse horse = VehiclesFctory.getHorse();
            Vehicles = VehiclesFctory.getHorse();
        }
        Vehicles.work();*/
        if (！(Vehicles instanceof Horse)) {//它不为空并且不是马·1
            Vehicles = VehiclesFctory.getHorse();
        }
    }
}
}

interface Vehicles{
    public void work();
}

class Horse implements Vehicles{
    public void work(){
        System.out.println("使用马");
    }

}

class Boat implements Vehicles{
    public void work(){
        System.out.println("使用船");
    }

}

/*
class  VehiclesFctory() {
//    public Horse getHorse(){
    public static Horse getHorse(){//因为这里被必要创建VehiclesFactory对象，我们只需要调用它的方法就行了
        return new Horse();
    }
    public static Boat getBoat(){
        return new Boat();
    }
}*/

//马始终是同一批马
class  VehiclesFctory() {
    private  VehiclesFctory(){}
    private static Horse horse = new Horse();//饿汉式
    public static Horse getHorse() {
        return horse;
    }

    public static Boat getBoat(){
        return new Boat();
    }
}