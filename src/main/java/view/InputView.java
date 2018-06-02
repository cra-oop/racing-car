package view;

import domain.StdRaceConfig;

public class InputView {

    public static StdRaceConfig scanConfig() {
        //TODO: 둘다 스캔해서 넘겨준다
        int numCars = 0;
        int numLaps = 0;
        return new StdRaceConfig(numCars, numLaps);
    }
}
