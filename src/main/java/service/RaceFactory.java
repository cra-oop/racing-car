package service;

import domain.Car;

public class RaceFactory {
    public static Car createCar(int randomValue) {
        //TODO: randomValue를 인자로 준다
        return new Car();
    }
}
