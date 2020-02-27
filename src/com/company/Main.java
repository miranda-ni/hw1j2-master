package com.company;

public class Main {



    public static void main(String[] args) {
        Truck truck1 = new Truck(20,Color.RED,"Japan",1012,20,"Audi");
        System.out.println(truck1.getInfo());
        truck1.Light();
        PassengerCar p1 = new PassengerCar(30,Color.WHITE,"Japan",2011,30);
        System.out.println(p1.getInfo());
        p1.Light();
        PassengerCar p2 = new PassengerCar(20,Color.BLACK,"Japan",2010,20);
        System.out.println(p2.getInfo());
        p2.Light();






    }

}
