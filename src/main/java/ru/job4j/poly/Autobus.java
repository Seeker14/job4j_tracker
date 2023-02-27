package ru.job4j.poly;

public class Autobus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " движется по скоростной трассе.");
    }

    @Override
    public void refuel() {
        System.out.println(getClass().getSimpleName() + " заправляется бензином.");
    }
}
