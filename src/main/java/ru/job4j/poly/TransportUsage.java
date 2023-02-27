package ru.job4j.poly;

public class TransportUsage {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle train = new Train();
        Vehicle autobus = new Autobus();

        Vehicle[] transport = new Vehicle[]{plane, train, autobus};
        for (Vehicle tr : transport) {
            tr.move();
            tr.refuel();
        }
    }
}
