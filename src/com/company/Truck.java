package com.company;

public final class  Truck extends PassengerCar {

    private String mark;

    public Truck(int volume, Color color, String maker, int year, int speed, String mark) {
        super(volume, color, maker, year, speed);
        this.mark = mark;
    }

    public Truck(int volume, Color color, String maker, int year, int speed) {
        super(volume, color, maker, year, speed);
    }


    public String getMark() {
        return mark;
    }

    @Override
    public String getInfo() {
        return (super.getInfo() + "Mark " + getMark());
    }

    {


    }

    @Override
    public void Light() {
        System.out.println("Fast truck");
    }
}






