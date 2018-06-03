import domain.Race;
import domain.StdRaceConfig;
import view.InputView;
import view.ResultView;

public class Main {
    public static void main(String[] args){

        //controller는 어디에 쓸까..
        //Controller는 M과 V를 이어준다
        //M과 V는 서로 직접 통신할 수 없다

        StdRaceConfig raceConfig = InputView.scanConfig();

        Race race = new Race(raceConfig);
        Race result = race.play();

        ResultView resultView = new ResultView(result);
        resultView.show();
    }
}
