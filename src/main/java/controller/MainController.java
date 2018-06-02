package controller;

import domain.Race;
import domain.StdRaceConfig;
import view.InputView;
import view.ResultView;

public class MainController {
    public static void main(String[] args){
        StdRaceConfig raceConfig = InputView.scanConfig();

        Race race = new Race(raceConfig);
        Race result = race.play();

        ResultView resultView = new ResultView(result);
        resultView.show();

    }


}
