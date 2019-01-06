import domain.Car;
import domain.Race;
import domain.StdRaceConfig;
import model.RaceResult;
import service.RaceFactory;
import view.InputView;
import view.ResultView;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        //controller는 어디에 쓸까..
        //Controller는 M과 V를 이어준다
        //M과 V는 서로 직접 통신할 수 없다

        String[] carNameList = InputView.scanNameList();
        StdRaceConfig raceConfig = InputView.scanConfig();

        List<Car> cars = new ArrayList<>();
        for (String name: carNameList) {
            cars.add(RaceFactory.createCar(name));
        }

        Race race = new Race(cars, raceConfig);

        //컨트롤러에서 바퀴 수만큼 돌리면 어떤 장점이 있을까?
        //TODO: RaceResult를 리턴해야 함.
        RaceResult result = race.playOut();

        ResultView resultView = new ResultView(result);
        resultView.show();
    }
}
