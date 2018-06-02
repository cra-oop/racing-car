package domain;

import domain.IConfig;

public class StdRaceConfig implements IConfig {
    private int numCars;
    private int numLaps;

    public StdRaceConfig(int numCars, int numLaps){
        this.numCars = numCars;
        this.numLaps = numLaps;
    }

    public int getNumCars() {
        return numCars;
    }

    public int getNumLaps() {
        return numLaps;
    }
}
