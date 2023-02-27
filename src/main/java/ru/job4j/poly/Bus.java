package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Автобус отправляется по расписанию.");
    }

    @Override
    public void passengers(int count) {
        System.out.println("В автобусе находятся " + count + " пассажиров.");
    }

    @Override
    public double price(double fuel) {
        return fuel * 35;
    }
}
