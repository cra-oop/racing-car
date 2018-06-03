package domain;

import java.util.Random;

public class RandomStrategy implements IStrategy{

    int speed;

    public RandomStrategy() {
        Random randomGenerator = new Random();
        this.speed = randomGenerator.nextInt(10);
    }

    public boolean isMovable(){
        return (this.speed >= 4);
    }
}
