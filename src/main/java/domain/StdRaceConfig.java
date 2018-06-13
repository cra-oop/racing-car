package domain;

import domain.IConfig;

public class StdRaceConfig implements IConfig {
    private int numLaps;

    public StdRaceConfig(int numLaps){
        //참가자 명단과 몇바퀴인지만 있으면 세팅 가능.
        this.numLaps = numLaps;
    }
    public int getNumLaps() {
        return numLaps;
    }

}
