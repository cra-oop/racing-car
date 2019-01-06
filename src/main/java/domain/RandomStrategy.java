package domain;

import java.util.Random;

public class RandomStrategy implements IStrategy{

    int speed;

    public RandomStrategy() {
        this.speed = new Random().nextInt(10);
    }

    public boolean isMovable(){
        return (this.speed >= 4);
    }
}
